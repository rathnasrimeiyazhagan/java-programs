import java.util.Scanner;

public class shippingcostanddelivery {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double packageweight = sc.nextDouble();
        sc.nextLine();
        String deszone = sc.nextLine();
        String shippingspeed = sc.nextLine();
        String packagesize = sc.nextLine();

        int baserate = 0;

        if (shippingspeed.equalsIgnoreCase("economy")) {
            baserate = 5;
        }
        else if (shippingspeed.equalsIgnoreCase("standard")) {
            baserate = 10;
        }
        else if (shippingspeed.equalsIgnoreCase("express")) {
            baserate = 25;
        }
        else if (shippingspeed.equalsIgnoreCase("overnight")) {
            baserate = 50;
        }

        double weightsur = packageweight * 1.0;

        double zonemul = 1.0;

        if (deszone.equalsIgnoreCase("local")) {
            zonemul = 1.0;
        }
        else if (deszone.equalsIgnoreCase("regional")) {
            zonemul = 1.2;
        }
        else if (deszone.equalsIgnoreCase("national")) {
            zonemul = 1.5;
        }
        else if (deszone.equalsIgnoreCase("international")) {
            zonemul = 3.0;
        }

        int sizesur = 0;

        if (packagesize.equalsIgnoreCase("small")) {
            sizesur = 0;
        }
        else if (packagesize.equalsIgnoreCase("medium")) {
            sizesur = 5;
        }
        else if (packagesize.equalsIgnoreCase("large")) {
            sizesur = 15;
        }
        else if (packagesize.equalsIgnoreCase("oversized")) {
            sizesur = 30;
        }

        double basecost = (baserate + weightsur) * zonemul;
        double totalcost = basecost + sizesur;

        String deliverytime = "";

        if (shippingspeed.equalsIgnoreCase("economy")) {
            if (deszone.equalsIgnoreCase("local")) 
                deliverytime = "3-5 days";
            else if (deszone.equalsIgnoreCase("regional")) 
                deliverytime = "5-7 days";
            else if (deszone.equalsIgnoreCase("national")) 
                deliverytime = "7-10 days";
            else deliverytime = "14-21 days";
        }
        else if (shippingspeed.equalsIgnoreCase("standard")) {
            if (deszone.equalsIgnoreCase("local")) 
                deliverytime = "2-3 days";
            else if (deszone.equalsIgnoreCase("regional")) 
                deliverytime = "3-5 days";
            else if (deszone.equalsIgnoreCase("national")) 
                deliverytime = "5-7 days";
            else deliverytime = "10-14 days";
        }
        else if (shippingspeed.equalsIgnoreCase("express")) {
            if (deszone.equalsIgnoreCase("local")) 
                deliverytime = "1 day";
            else if (deszone.equalsIgnoreCase("regional")) 
                deliverytime = "1-2 days";
            else if (deszone.equalsIgnoreCase("national")) 
                deliverytime = "2-3 days";
            else deliverytime = "3-5 days";
        }
        else if (shippingspeed.equalsIgnoreCase("overnight")) {
            deliverytime = "1 day";
        }

        String servicelevel = "";

        if (shippingspeed.equalsIgnoreCase("economy")) {
            servicelevel = "Budget";
        }
        else if (shippingspeed.equalsIgnoreCase("standard")) {
            servicelevel = "Standard";
        }
        else if (shippingspeed.equalsIgnoreCase("express")) {
            servicelevel = "Priority";
        }
        else if (shippingspeed.equalsIgnoreCase("overnight")) {
            servicelevel = "Premium";
        }

        System.out.println("Package Weight: " + packageweight + " lbs");
        System.out.println("Destination Zone: " + deszone);
        System.out.println("Shipping Speed: " + shippingspeed);
        System.out.println("Package Size: " + packagesize);
        System.out.println("Base Rate: $" + (double) baserate);
        System.out.println("Weight Surcharge: $" + weightsur);
        System.out.println("Zone Multiplier: " + zonemul + "x");
        System.out.println("Size Surcharge: $" + sizesur);
        System.out.println("Total Shipping Cost: $" + totalcost);
        System.out.println("Estimated Delivery Time: " + deliverytime);
        System.out.println("Service Level: " + servicelevel);

        sc.close();
    }
}