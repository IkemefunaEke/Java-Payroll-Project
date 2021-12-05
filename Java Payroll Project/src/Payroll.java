import java.util.Scanner;

public class Payroll {

    public static void main(String[] args) {
        int[] employeeID = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
        int[] hours = new int[7];
        double[] payRate = new double[7];
        double[] wages = new double[7];

        for (int i = 0; i < 7; i++) {
            System.out.println("Please enter hours worked by employee: " + employeeID[i]);
            Scanner keyboardInput = new Scanner(System.in);
                int hoursWorked = keyboardInput.nextInt();
                while (hoursWorked < 0){
                    System.out.println("HOURS WORKED CAN NOT BE NEGATIVE");
                    System.out.println("Please enter hours worked by employee: " + employeeID[i]);
                    hoursWorked = keyboardInput.nextInt();
                }
                hours[i] = hoursWorked;


        }
        for (int k = 0; k < 7; k++) {
            System.out.println("Please enter the Pay Rate of employee: " + employeeID[k]);
            Scanner keyboardInput = new Scanner(System.in);
                double rateOfPay = keyboardInput.nextDouble();
                while (rateOfPay < 6){
                    System.out.println("THE RATE OF PAY CAN NOT BE LESS THAN 6");
                    System.out.println("Please enter the Pay Rate of employee: " + employeeID[k]);
                    rateOfPay = keyboardInput.nextDouble();
                }
                payRate[k] = rateOfPay;
        }

        for (int m = 0; m < 7; m++) {
            wages[m] = hours[m] * payRate[m];
            System.out.println("Gross Wages of employee " + employeeID[m] + " is: " + wages[m]);
        }
        System.out.println("Input Employee ID to see wages");
        Scanner keyboardInput = new Scanner(System.in);
        int typedData = keyboardInput.nextInt();
        switch(typedData) {
            case 5658845:
                System.out.println("5658845 Gross Pay is: " + wages [0]);
                break;
            case 4520125:
                System.out.println("4520125 Gross Pay is: " + wages [1]);
                break;
            case 7895122:
                System.out.println("7895122 Gross Pay is: " + wages [2]);
                break;
            case 8777541:
                System.out.println("8777541 Gross Pay is: " + wages [3]);
                break;
            case 8451277:
                System.out.println("8451277 Gross Pay is: " + wages [4]);
                break;
            case 1302850:
                System.out.println("1302850 Gross Pay is: " + wages [5]);
                break;
            case 7580489:
                System.out.println("7580489 Gross Pay is: " + wages [6]);
                break;
            default:
                System.out.println("Invalid Employee ID");
                break;
        }

    }
}








