class SalaryDetails {

    public static double[] findDetails(double[] salary) {

        double sum = 0;
        int greaterCount = 0;
        int lesserCount = 0;

        // Step 1: Find sum
        for (int i = 0; i < salary.length; i++) {
            sum += salary[i];
        }

        // Step 2: Calculate average
        double average = sum / salary.length;

        // Step 3: Count greater and lesser salaries
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] > average) {
                greaterCount++;
            } else if (salary[i] < average) {
                lesserCount++;
            }
        }

        // Step 4: Store results in double array
        double[] result = new double[3];
        result[0] = average;
        result[1] = greaterCount;
        result[2] = lesserCount;

        return result;
    }
}
