import java.util.Scanner;

public class propertyvalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String loc = sc.nextLine().toLowerCase();
        int sq = sc.nextInt();
        int age = sc.nextInt();
        int am = sc.nextInt();

        double bp = 0;
        double adj = 0;
        double bonus = 0;
        String cat = "";

    
        if(loc.equals("prime")) {
            bp = 400;
        } else if(loc.equals("=urban")) {
            bp = 300;
        } else if(loc.equals("suburban")) {
            bp = 180;
        } else {
            bp = 100;
        }


        if(age >= 0 && age <= 5) {
            adj = 0;
        } else if(age >= 6 && age <= 15) {
            adj = -10;
        } else if(age >= 16 && age <= 30) {
            adj = -20;
        } else {
            adj = -30;
        }

        double base = sq * bp;
        double adjVal = base * (1 + adj/100);

        if(am >= 80 && am <= 100) {
            bonus = base * 0.10;
        } else if(am >= 60 && am <= 79) {
            bonus = base * 0.05;
        } else if(am >= 40 && am <= 59) {
            bonus = base * 0.02;
        } else {
            bonus = 0;
        }

        double finalVal = adjVal + bonus;

    
        if((loc.equals("prime") || loc.equals("urban")) && age < 15) {
            cat = "Hot";
        } else if(loc.equals("suburban")) {
            cat = "Stable";
        } else if(loc.equals("rural") || age > 30) {
            cat = "Slow";
        }
        
        System.out.println("Location Tier: " + loc);
        System.out.println("Square Footage: " + sq + " sq ft");
        System.out.println("Property Age: " + age + " years");
        System.out.println("Amenity Score: " + am);
        System.out.println("Base Price Per Sq Ft: $" + bp);
        System.out.println("Age Adjustment: " + adj + "%");
        System.out.println("Amenity Bonus: $" + bonus);
        System.out.println("Estimated Property Value: $" + finalVal);
        System.out.println("Market Category: " + cat);
    sc.close();
}
}
