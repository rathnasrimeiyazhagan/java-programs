import java.util.Scanner;

public class electricitybill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int u = sc.nextInt();
        sc.nextLine();
        String c = sc.nextLine();
        String s = sc.nextLine();
        String p = sc.nextLine();

        double t1 = 0, t2 = 0, t3 = 0, t4 = 0;

        if (c.equalsIgnoreCase("Residential")) {
            if (u <= 100) {
                t1 = u * 0.10;
                t2 = 0;
                t3 = 0;
                t4 = 0;
            } else if (u <= 300) {
                t1 = 100 * 0.10;
                t2 = (u - 100) * 0.15;
                t3 = 0;
                t4 = 0;
            } else if (u <= 500) {
                t1 = 100 * 0.10;
                t2 = 200 * 0.15;
                t3 = (u - 300) * 0.25;
                t4 = 0;
            } else {
                t1 = 100 * 0.10;
                t2 = 200 * 0.15;
                t3 = 200 * 0.25;
                t4 = (u - 500) * 0.30;
            }
        } else if (c.equalsIgnoreCase("Commercial")) {
            if (u <= 100) {
                t1 = u * 0.12;
                t2 = 0;
                t3 = 0;
                t4 = 0;
            } else if (u <= 300) {
                t1 = 100 * 0.12;
                t2 = (u - 100) * 0.18;
                t3 = 0;
                t4 = 0;
            } else if (u <= 500) {
                t1 = 100 * 0.12;
                t2 = 200 * 0.18;
                t3 = (u - 300) * 0.25;
                t4 = 0;
            } else {
                t1 = 100 * 0.12;
                t2 = 200 * 0.18;
                t3 = 200 * 0.25;
                t4 = (u - 500) * 0.25;
            }
        } else if (c.equalsIgnoreCase("Industrial")) {
            if (u <= 100) {
                t1 = u * 0.08;
                t2 = 0;
                t3 = 0;
                t4 = 0;
            } else if (u <= 300) {
                t1 = 100 * 0.08;
                t2 = (u - 100) * 0.12;
                t3 = 0;
                t4 = 0;
            } else if (u <= 500) {
                t1 = 100 * 0.08;
                t2 = 200 * 0.12;
                t3 = (u - 300) * 0.20;
                t4 = 0;
            } else {
                t1 = 100 * 0.08;
                t2 = 200 * 0.12;
                t3 = 200 * 0.20;
                t4 = (u - 500) * 0.20;
            }
        }

        double seasonAdj = 0;
        if (s.equalsIgnoreCase("Summer"))
            seasonAdj = 15;
        else if (s.equalsIgnoreCase("Winter"))
            seasonAdj = -10;
        else
            seasonAdj = 0;

        double payDisc = 0;
        if (p.equalsIgnoreCase("Auto-Pay"))
            payDisc = 5;
        else if (p.equalsIgnoreCase("Online"))
            payDisc = 3;
        else
            payDisc = 0;

        double total = (t1 + t2 + t3 + t4) * (1 + seasonAdj / 100) * (1 - payDisc / 100);
        double avg = total / u;

        System.out.println("Units Consumed: " + u + " kWh");
        System.out.println("Customer Type: " + c);
        System.out.println("Season: " + s);
        System.out.println("Payment Method: " + p);
        System.out.println("Tier 1 Cost (0-100): $" + t1);
        System.out.println("Tier 2 Cost (101-300): $" + t2);
        System.out.println("Tier 3 Cost (301-500): $" + t3);
        System.out.println("Tier 4 Cost (501+): $" + t4);
        System.out.println("Seasonal Adjustment: " + seasonAdj + "%");
        System.out.println("Payment Discount: " + payDisc + "%");
        System.out.println("Total Bill: $" + total);
        System.out.println("Average Rate: $" + avg + "/kWh");

        sc.close();
    }
}