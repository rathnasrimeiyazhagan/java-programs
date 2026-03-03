import java.util.*;

public class banktransaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double totaldep = 0;
        double totalwd = 0;
        double totaltransfers = 0;
        double totpayments = 0;

        for (int i = 1; i <= n; i++) {

            String type = sc.next();
            double amount = sc.nextDouble();

            String category = "";

            if (type.equalsIgnoreCase("Deposit")) {
                category = "Credit";
                totaldep += amount;
            }
            else if (type.equalsIgnoreCase("Withdrawal")) {
                category = "Debit";
                totalwd += amount;
            }
            else if (type.equalsIgnoreCase("Transfer")) {
                category = "Debit";
                totaltransfers += amount;
            }
            else if (type.equalsIgnoreCase("Payment")) {
                category = "Debit";
                totpayments += amount;
            }

            System.out.println("Transaction " + i + ": " + type);
            System.out.println("Amount: $" + amount);
            System.out.println("Category: " + category);
            System.out.println();
        }

        double netbal = totaldep - 
                (totalwd + totaltransfers + totpayments);

        System.out.println("Total Transactions: " + n);
        System.out.println("Total Deposits: $" + totaldep);
        System.out.println("Total Withdrawals: $" + totalwd);
        System.out.println("Total Transfers: $" + totaltransfers);
        System.out.println("Total Payments: $" + totpayments);

        if (netbal>=0) {
            System.out.println("Net Balance Change: $" + netbal);
        } else {
            System.out.println("Net Balance Change: -$" + Math.abs(netbal));
        }

        sc.close();
    }
}