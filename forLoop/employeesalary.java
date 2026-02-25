import java.util.Scanner;

public class employeesalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double payroll = 0;
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            double salary = sc.nextDouble();
            int performancerating = sc.nextInt();

            int increment = 0;
            if (performancerating == 5) {
                increment = 15;
            } else if (performancerating == 4) {
                increment = 10;
            } else if (performancerating == 3) {
                increment = 5;
            } else if (performancerating == 2) {
                increment = 2;
            } else if (performancerating == 1) {
                increment = 0;
            }

            double finalsalary = salary * (1 + increment / 100.0);
            payroll += finalsalary;
            System.out.println("Employee: " + name);
            System.out.println("Base Salary: $" + salary);
            System.out.println("Performance Rating: " + performancerating);
            System.out.println("Increment: " + increment + "%");
            System.out.println("Final Salary: " + String.format("$%.2f", finalsalary));
            System.out.println();
        }
        double avg = payroll / n;

        System.out.println("Total employees processed: " + n);
System.out.println("Total payroll: " + String.format("$%.2f", payroll));        System.out.println("Average salary: $" + String.format("%.2f", avg));
        sc.close();

    }
}
