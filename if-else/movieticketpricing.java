import java.util.Scanner;

public class movieticketpricing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String movieFormat = sc.nextLine();
        String showTime = sc.nextLine();
        String seatCategory = sc.nextLine();
        String customerType = sc.nextLine();

        double basePrice = 12.0;
        double formatSurcharge = 0.0;
        double seatUpgrade = 0.0;
        int timeAdjustment = 0;
        int customerDiscount = 0;

        if (movieFormat.equalsIgnoreCase("2D")) {
            formatSurcharge = 0.0;
        } 
        else if (movieFormat.equalsIgnoreCase("3D")) {
            formatSurcharge = 5.0;
        } 
        else if (movieFormat.equalsIgnoreCase("IMAX")) {
            formatSurcharge = 8.0;
        } 
        else if (movieFormat.equalsIgnoreCase("4DX")) {
            formatSurcharge = 10.0;
        }

        if (seatCategory.equalsIgnoreCase("Standard")) {
            seatUpgrade = 0.0;
        } 
        else if (seatCategory.equalsIgnoreCase("Premium")) {
            seatUpgrade = 4.0;
        } 
        else if (seatCategory.equalsIgnoreCase("Recliner")) {
            seatUpgrade = 7.0;
        }

        if (showTime.equalsIgnoreCase("Matinee")) {
            timeAdjustment = -30;
        } 
        else if (showTime.equalsIgnoreCase("Evening")) {
            timeAdjustment = 0;
        } 
        else if (showTime.equalsIgnoreCase("Prime-Time")) {
            timeAdjustment = 20;
        } 
        else if (showTime.equalsIgnoreCase("Late-Night")) {
            timeAdjustment = -20;
        }

        if (customerType.equalsIgnoreCase("Adult")) {
            customerDiscount = 0;
        } 
        else if (customerType.equalsIgnoreCase("Senior")) {
            customerDiscount = 25;
        } 
        else if (customerType.equalsIgnoreCase("Student")) {
            customerDiscount = 15;
        } 
        else if (customerType.equalsIgnoreCase("Child")) {
            customerDiscount = 30;
        }

        double baseWithSurcharges = basePrice + formatSurcharge + seatUpgrade;
        double adjustedPrice = baseWithSurcharges * (1 + timeAdjustment / 100.0);
        double finalPrice = adjustedPrice * (1 - customerDiscount / 100.0);

        finalPrice = Math.round(finalPrice * 100.0) / 100.0;

        String concessionVoucher = "No";
        if (showTime.equalsIgnoreCase("Matinee") ||customerType.equalsIgnoreCase("Senior") ||
            customerType.equalsIgnoreCase("Student") ||customerType.equalsIgnoreCase("Child")) {concessionVoucher = "Yes";
        }

        String pricingCategory = "";
        if (finalPrice < 10) {
            pricingCategory = "Value";
        } 
        else if (finalPrice < 25) {
            pricingCategory = "Standard";
        } 
        else if (finalPrice < 30) {
            pricingCategory = "Premium";
        } 
        else {
            pricingCategory = "Luxury";
        }

        System.out.println("Movie Format: " + movieFormat);
        System.out.println("Show Time: " + showTime);
        System.out.println("Seat Category: " + seatCategory);
        System.out.println("Customer Type: " + customerType);
        System.out.println("Base Ticket Price: $" + basePrice);
        System.out.println("Format Surcharge: $" + formatSurcharge);
        System.out.println("Seat Upgrade Fee: $" + seatUpgrade);
        System.out.println("Time-Based Adjustment: " + timeAdjustment + "%");
        System.out.println("Customer Discount: " + customerDiscount + "%");
        System.out.println("Final Ticket Price: $" + finalPrice);
        System.out.println("Concession Voucher: " + concessionVoucher);
        System.out.println("Pricing Category: " + pricingCategory);

        sc.close();
    }
}