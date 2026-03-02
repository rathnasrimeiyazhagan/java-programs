import java.util.*;

public class salescommission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double totalsales = 0;
        double totalcommissions = 0;

        double highestsales = 0;
        String topPerformer = "";

        for (int i = 0; i < n; i++) {

            String name = sc.next();
            double salesamt = sc.nextDouble();

            int comrate = 0;

            if (salesamt >= 0 && salesamt <= 40000) {
                comrate = 5;
            }
            else if (salesamt <= 80000) {
                comrate = 8;
            }
            else if (salesamt <= 100000) {
                comrate = 10;
            }
            else if (salesamt <= 150000) {
                comrate = 12;
            }
            else {
                comrate = 15;
            }

            double commission = salesamt * (comrate / 100.0);

            double bonus = 0;

            if (salesamt >= 150000) {
                bonus = 3000;
            }
            else if (salesamt >= 100000) {
                bonus = 2000;
            }

            double totalPayout = commission + bonus;

            totalsales += salesamt;
            totalcommissions += commission;

            if (salesamt > highestsales) {
                highestsales = salesamt;
                topPerformer = name;
            }

            System.out.println("Sales rep: " + name);
            System.out.println("Sales amount: $" + salesamt);
            System.out.println("Commission rate: " + comrate + "%");
            System.out.println("Commission earned: $" + commission);
            System.out.println("Bonus: $" + bonus);
            System.out.println("Total payout: $" + totalPayout);
            System.out.println();
        }

        System.out.println("Total sales reps: " + n);
        System.out.println("Total sales: $" + totalsales);
        System.out.println("Total commissions: $" + totalcommissions);
        System.out.println("Top performer: " + topPerformer);
       
        sc.close();
    }
}