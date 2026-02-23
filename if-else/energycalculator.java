import java.util.Scanner;

public class energycalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String timeOfDay = sc.nextLine();
        double powerConsumption = sc.nextDouble();
        double renewablePercentage = sc.nextDouble();
        sc.nextLine();
        String rateTier = sc.nextLine();

        double baseRate = 0;
        double rateMultiplier = 1.0;

        if (rateTier.equalsIgnoreCase("Basic")) {
            baseRate = 0.18;
        } 
        else if (rateTier.equalsIgnoreCase("Time-of-Use")) {
            baseRate = 0.15;
        } 
        else if (rateTier.equalsIgnoreCase("Premium-Green")) {
            baseRate = 0.12;
        }

        if (timeOfDay.equalsIgnoreCase("Peak")) {
            rateMultiplier = 1.5;
        } 
        else if (timeOfDay.equalsIgnoreCase("Off-Peak")) {
            rateMultiplier = 0.8;
        } 
        else if (timeOfDay.equalsIgnoreCase("Super-Off-Peak")) {
            rateMultiplier = 0.5;
        }

        double renewableCredit = (powerConsumption * renewablePercentage / 100) * baseRate;
        double totalCost = (powerConsumption * baseRate * rateMultiplier) - renewableCredit;

        String recommendation = "";
        double potentialSavings = 0;

        if (timeOfDay.equalsIgnoreCase("Peak") && renewablePercentage < 20) {
            recommendation = "Shift to Off-Peak";
            double offPeakCost = (powerConsumption * baseRate * 0.8) - renewableCredit;
            potentialSavings = totalCost - offPeakCost;
        }
        else if (renewablePercentage >= 50) {
            recommendation = "Excellent! Continue";
        }
        else if (rateTier.equalsIgnoreCase("Basic") && powerConsumption > 50) {
            recommendation = "Upgrade to Time-of-Use";
        }
        else {
            recommendation = "Good timing! Consider increasing renewable capacity";
        }

        System.out.println("Time of Day: " + timeOfDay);
        System.out.println("Power Consumption: " + powerConsumption + " kWh");
        System.out.println("Renewable Energy: " + renewablePercentage + "%");
        System.out.println("Rate Tier: " + rateTier);
        System.out.println("Base Rate: $" + baseRate + "/kWh");
        System.out.println("Rate Multiplier: " + rateMultiplier + "x");
        System.out.println("Renewable Credit: $" + renewableCredit);
        System.out.println("Total Cost: $" + totalCost);
        System.out.println("Optimization Recommendation: " + recommendation);
        System.out.println("Potential Savings: $" + potentialSavings);

        sc.close();
    }
}