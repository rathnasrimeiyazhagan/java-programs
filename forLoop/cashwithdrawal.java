import java.util.*;

public class cashwithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double initialbal = sc.nextDouble();
        int n = sc.nextInt();
        double remcash = initialbal;
        int succwd = 0;
        int failwd = 0;
        double sum = 0;
        double wd;

        if (n > 0 && n <= 20) {

            for (int i = 0; i < n; i++) {

                wd = sc.nextDouble();
                String status = "";

                if (wd <= remcash) {
                    status = "Approved";
                    remcash = remcash - wd;
                    succwd++;
                    sum += wd;

                    System.out.println("Transaction: " + (i + 1) + " $" + wd);
                    System.out.println("Status: " + status);
                    System.out.println("Remaining balance: " + remcash);
                } 
                else {
                    status = "Denied";
                    failwd++;

                    System.out.println("Transaction: " + (i + 1) + " $" + wd);
                    System.out.println("Status: " + status);
                    System.out.println("Reason: Insufficient funds");
                    System.out.println("Remaining balance: " + remcash);
                }

                System.out.println();
            }
        }

        double finalbal = remcash;

        System.out.println("Total transactions: " + n);
        System.out.println("Successful withdrawals: " + succwd);
        System.out.println("Failed withdrawals: " + failwd);
        System.out.println("Final balance: " + finalbal);
        System.out.println("Total withdrawn: " + sum);

        sc.close();
    }
}