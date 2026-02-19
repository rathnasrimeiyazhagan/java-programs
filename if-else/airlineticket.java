import java.util.Scanner;

public class airlineticket {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String cls = sc.nextLine().toLowerCase();
        int days = sc.nextInt();
        double avail = sc.nextDouble();
        sc.nextLine();   
        String route = sc.nextLine().toLowerCase();

        double base = 0;


        if (cls.equals("economy")) {
            if (route.equals("domestic")) {
                base = 200;
            } else if (route.equals("intshort")) {
                base = 500;
            } else if (route.equals("intlong")) {
                base = 800;
            }
        } 
        else if (cls.equals("business")) {
            if (route.equals("domestic")) {
                base = 600;
            } else if (route.equals("intshort")) {
                base = 1500;
            } else if (route.equals("intlong")) {
                base = 2500;
            }
        } 
        else if (cls.equals("first")) {
            if (route.equals("domestic")) {
                base = 1000;
            } else if (route.equals("intshort")) {
                base = 3000;
            } else if (route.equals("intlong")) {
                base = 5000;
            }
        }

        double multiplier = 0;
        String category = "";


        if (avail < 30 && days < 14) {
            multiplier = 1.8;
            category = "High Demand";
        }
        else if (avail < 50 && days < 30) {
            multiplier = 1.5;
            category = "High Demand";
        }
        else if (avail < 60 || (days >= 30 && days <= 60)) {
            multiplier = 1.0;
            category = "Moderate";
        }
        else if (avail >= 60 && days > 60) {
            multiplier = 0.8;
            category = "Low Demand";
        }

        double finalPrice = base * multiplier;

        System.out.println("Booking Class: " + cls);
        System.out.println("Days Until Departure: " + days);
        System.out.println("Seat Availability: " + avail + "%");
        System.out.println("Route Type: " + route);
        System.out.println("Base Price: $" + base);
        System.out.println("Demand Multiplier: " + multiplier + "x");
        System.out.println("Final Ticket Price: $" + finalPrice);
        System.out.println("Pricing Category: " + category);

        sc.close();
    }
}

