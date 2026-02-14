public class PasswordValidator {

    public static String validatePassword(String inStr) {
        String outStr = "Invalid"; // Default value

        // Check if length is at least 8
        if (inStr.length() >= 8) {

            boolean hasUpper = false;
            boolean hasLower = false;
            boolean hasDigit = false;
            boolean hasSpecial = false;
            boolean consecutive = false;
            boolean repetitive = false;

            // Check character types and consecutive characters
            for (int i = 0; i < inStr.length(); i++) {
                char ch = inStr.charAt(i);

                if (Character.isUpperCase(ch)) hasUpper = true;
                if (Character.isLowerCase(ch)) hasLower = true;
                if (Character.isDigit(ch)) hasDigit = true;
                if (!Character.isLetterOrDigit(ch)) hasSpecial = true;

                // Check consecutive characters
                if (i > 0 && inStr.charAt(i) == inStr.charAt(i - 1)) {
                    consecutive = true;
                }
            }

            // Check repetitive characters (any duplicate anywhere)
            for (int i = 0; i < inStr.length(); i++) {
                for (int j = i + 1; j < inStr.length(); j++) {
                    if (inStr.charAt(i) == inStr.charAt(j)) {
                        repetitive = true;
                        break;
                    }
                }
                if (repetitive) break;
            }

            // Strong password: hasUpper, hasLower, hasDigit, hasSpecial, no consecutive
            if (hasUpper && hasLower && hasDigit && hasSpecial && !consecutive) {
                outStr = "Strong";
            }
            // Partially Strong: hasUpper, hasDigit, hasSpecial, no repetitive
            else if (hasUpper && hasDigit && hasSpecial && !repetitive) {
                outStr = "Partially Strong";
            }
            // Weak: only alphabets or only digits
            else if (inStr.matches("[a-zA-Z]+") || inStr.matches("[0-9]+")) {
                outStr = "Weak";
            }
            // Otherwise Invalid
            else {
                outStr = "Invalid";
            }
        }

        return outStr;
    }

    public static void main(String[] args) {
        String[] testPasswords = {
            "A2b1&7v9!", 
            "KB3#WY59U", 
            "jamesDoe", 
            "Hft#98"
        };

        for (String pwd : testPasswords) {
            System.out.println(pwd + " -> " + validatePassword(pwd));
        }
    }
}
