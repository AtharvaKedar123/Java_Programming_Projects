public class findLeapYears {

    public static int[] findLeapYears1(int year) {

        int[] leapYears = new int[15];
        int count = 0;

        while (count < 15) {

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                leapYears[count] = year;
                count++;
            }

            year++;
        }

        return leapYears;
    }

    public static void main(String[] args) {

        int startYear = 2000;
        int[] result = findLeapYears1(startYear);

        for (int y : result)
            System.out.println(y);
    }
}
