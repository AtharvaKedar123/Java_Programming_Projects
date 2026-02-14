class SalaryDetailsTester {
    public static void main(String[] args) {

        double[] salaries = {25000, 30000, 28000, 35000, 27000};

        double[] output = SalaryDetails.findDetails(salaries);

        System.out.println("Average Salary: " + output[0]);
        System.out.println("Number of salaries greater than average: " + (int)output[1]);
        System.out.println("Number of salaries lesser than average: " + (int)output[2]);
    }
}
