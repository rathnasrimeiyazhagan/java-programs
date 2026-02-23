import java.util.Scanner;

public class creditcard {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String cardtier = sc.nextLine();
        String purchasecat = sc.nextLine();
        double transactionamt = sc.nextDouble();
        sc.nextLine();
        String promotionalstatus = sc.nextLine();

        double basepoint = 1.0;

        double catbonus = 1.0;
        if (purchasecat.equalsIgnoreCase("groceries")) {
            catbonus = 2.0;
        }
        else if (purchasecat.equalsIgnoreCase("dining")) {
            catbonus = 2.5;
        }
        else if (purchasecat.equalsIgnoreCase("travel")) {
            catbonus = 3.0;
        }
        else if (purchasecat.equalsIgnoreCase("gas")) {
            catbonus = 2.0;
        }
        else if (purchasecat.equalsIgnoreCase("other")) {
            catbonus = 1.0;
        }

        double tiermul = 1.0;
        if (cardtier.equalsIgnoreCase("basic")) {
            tiermul = 1.0;
        }
        else if (cardtier.equalsIgnoreCase("gold")) {
            tiermul = 1.25;
        }
        else if (cardtier.equalsIgnoreCase("platinum")) {
            tiermul = 1.5;
        }
        else if (cardtier.equalsIgnoreCase("black")) {
            tiermul = 2.0;
        }

        double promotionalmul = 1.0;
        if (promotionalstatus.equalsIgnoreCase("double-points")) {
            promotionalmul = 2.0;
        }
        else if (promotionalstatus.equalsIgnoreCase("triple-points")) {
            promotionalmul = 3.0;
        }

        double pointsearned = transactionamt * basepoint * catbonus * tiermul * promotionalmul;
        double cashvalue = pointsearned * 0.01;

        String rewardstier = "";
        if (pointsearned < 500) {
            rewardstier = "Standard";
        }
        else if (pointsearned < 1500) {
            rewardstier = "Enhanced";
        }
        else if (pointsearned < 3000) {
            rewardstier = "Premium";
        }
        else {
            rewardstier = "Elite";
        }

        System.out.println("Card Tier: " + cardtier);
        System.out.println("Purchase Category: " + purchasecat);
        System.out.println("Transaction Amount: $" + transactionamt);
        System.out.println("Promotional Status: " + promotionalstatus);
        System.out.println("Base Points Rate: " + basepoint + " points per dollar");
        System.out.println("Category Bonus: " + catbonus + "x");
        System.out.println("Tier Multiplier: " + tiermul + "x");
        System.out.println("Promotional Multiplier: " + promotionalmul + "x");
        System.out.println("Points Earned: " + pointsearned);
        System.out.println("Equivalent Cash Value: $" + cashvalue);
        System.out.println("Rewards Tier: " + rewardstier);

        sc.close();
    }
}