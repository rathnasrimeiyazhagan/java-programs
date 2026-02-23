import java.util.Scanner;

public class hotelroom {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String roomcat = sc.nextLine();
        String season = sc.nextLine();
        int nightsbooked = sc.nextInt();
        sc.nextLine();
        String loyaltytier = sc.nextLine();

        int baserate = 0;

        if (roomcat.equalsIgnoreCase("standard")) {
            baserate = 150;
        }
        else if (roomcat.equalsIgnoreCase("deluxe")) {
            baserate = 300;
        }
        else if (roomcat.equalsIgnoreCase("suite")) {
            baserate = 500;
        }
        else if (roomcat.equalsIgnoreCase("presidential")) {
            baserate = 1000;
        }

        double seasonalmul = 1.0;

        if (season.equalsIgnoreCase("off-peak")) {
            seasonalmul = 0.7;
        }
        else if (season.equalsIgnoreCase("regular")) {
            seasonalmul = 1.0;
        }
        else if (season.equalsIgnoreCase("peak")) {
            seasonalmul = 1.5;
        }
        else if (season.equalsIgnoreCase("holiday")) {
            seasonalmul = 2.0;
        }

        int extendeddis = 0;

        if (nightsbooked >= 1 && nightsbooked <= 4) {
            extendeddis = 0;
        }
        else if (nightsbooked >= 5 && nightsbooked <= 6) {
            extendeddis = 5;
        }
        else if (nightsbooked >= 7 && nightsbooked <= 14) {
            extendeddis = 10;
        }
        else if (nightsbooked >= 15) {
            extendeddis = 20;
        }

        int loyaltydis = 0;

        if (loyaltytier.equalsIgnoreCase("none")) {
            loyaltydis = 0;
        }
        else if (loyaltytier.equalsIgnoreCase("member")) {
            loyaltydis = 10;
        }
        else if (loyaltytier.equalsIgnoreCase("gold")) {
            loyaltydis = 15;
        }
        else if (loyaltytier.equalsIgnoreCase("platinum")) {
            loyaltydis = 20;
        }

        double seasonalrate = baserate * seasonalmul;
        double discountedrate = seasonalrate * (1 - extendeddis / 100.0) * (1 - loyaltydis / 100.0);
        double totalcost = discountedrate * nightsbooked;

        String upgrades = "None";

        if (loyaltytier.equalsIgnoreCase("gold")) {
            upgrades = "Free breakfast and spa access";
        }
        else if (loyaltytier.equalsIgnoreCase("platinum")) {
            upgrades = "Suite upgrade, free breakfast, and spa access";
        }

        System.out.println("Room Category: " + roomcat);
        System.out.println("Season: " + season);
        System.out.println("Nights Booked: " + nightsbooked);
        System.out.println("Loyalty Tier: " + loyaltytier);
        System.out.println("Base Rate Per Night: $" + (double) baserate);
        System.out.println("Seasonal Multiplier: " + seasonalmul + "x");
        System.out.println("Extended Stay Discount: " + extendeddis + "%");
        System.out.println("Loyalty Discount: " + loyaltydis + "%");
        System.out.println("Nightly Rate: $" + discountedrate);
        System.out.println("Total Booking Cost: $" + totalcost);
        System.out.println("Complimentary Upgrades: " + upgrades);

        sc.close();
    }
}