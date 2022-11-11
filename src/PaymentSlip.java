import java.util.Scanner;

public class PaymentSlip {
    public static void main(String[] args) {

        Employee employee1 = new Employee("...", 0, 0);

        // Askning for Employee Name

        Scanner nameScanner = new Scanner(System.in);
        System.out.println("Please enter Employee name");
        String newName = nameScanner.nextLine();
        employee1.setName(newName);

        // Asking for How Many Hours Empolyee Worked?

        Scanner hWorkedScanner = new Scanner(System.in);
        System.out.println("How many hours have " + newName + " worked?");
        int amountHours = hWorkedScanner.nextInt();
        employee1.setHours(amountHours);

        // Asking for Employee Hourly Rate
        Scanner hRateScanner = new Scanner(System.in);
        System.out.println("What is " + newName + " Hourly Rate?");
        int amountRate = hRateScanner.nextInt();
        employee1.setRate(amountRate);

        String paymentslip = "-------------------------------" + "\n" + "## PAYMENT INFORMATION##" + "\n " + "Name:"
                + "\t" + newName + "\n" + "Hourly Rate:" + "\t" + "$" + employee1.getRate() + "\n"
                + "Hours Worked:" + "\t" + employee1.getHours() + "\n" + "\n" + "Salary before tax:" + "\t" + "$"
                + employee1.calculateSalary() + "\n" + "Salary after tax:" + "\t" + "$" + employee1.calculateNetSalary()
                + "\n" + "If you have any questions regarding your salary, contact Bob" + "\n"
                + "-------------------------------";

        System.out.println(paymentslip);
    }

}
