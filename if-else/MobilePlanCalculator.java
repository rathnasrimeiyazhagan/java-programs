import java.util.Scanner;

public class MobilePlanCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dataGB = sc.nextDouble();
        int callminutes = sc.nextInt();
        sc.nextLine();
        String internationalusage = sc.nextLine();

        String devicetype = sc.nextLine();

        String rp = "";
        double basePlanCost = 0.0;
        double dataOverage = 0.0;
        double callOverage = 0.0;
        double internationalfee = 0.0;
        double df = 0.0;
        double totalcost = 0.0;
        double ps = 0.0;
        String plancategory = "";

        if (devicetype.equalsIgnoreCase("Basic")) {
            df = 0.0;
        } else if (devicetype.equalsIgnoreCase("Smartphone")) {
            df = 10.0;
        } else if (devicetype.equalsIgnoreCase("Tablet")) {
            df = 10.0;
        } else if (devicetype.equalsIgnoreCase("Hotspot")) {
            df = 20.0;
        }

        if (internationalusage.equalsIgnoreCase("None")) {
            internationalfee = 0.0;
        } else if (internationalusage.equalsIgnoreCase("Light")) {
            internationalfee = 5.0;
        } else if (internationalusage.equalsIgnoreCase("Moderate")) {
            internationalfee = 15.0;
        } else if (internationalusage.equalsIgnoreCase("Heavy")) {
            internationalfee = 30.0;
        }

        if (dataGB <= 2.0 && callminutes <= 500) {
            rp = "Basic 2GB";
            basePlanCost = 25.0;
            plancategory = "Budget";
            if (dataGB > 2.0) {
                dataOverage = (dataGB - 2.0) * 5;
            }
            if (callminutes > 500) {
                callOverage = (callminutes - 500) * 0.1;
            }
        } else if (dataGB <= 5.0 && callminutes <= 1000) {
            rp = "Standard 5GB";
            basePlanCost = 40.0;
            plancategory = "Standard";
            if (dataGB > 5.0) {
                dataOverage = (dataGB - 5.0) * 5;
            }
            if (callminutes > 1000) {
                callOverage = (callminutes - 1000) * 0.1;
            }
            if (dataGB < 5.0 || callminutes < 1000) {
                ps = 5.0;
            }
        } else if (dataGB <= 20.0 && callminutes <= 2000) {
            rp = "Premium Unlimited";
            basePlanCost = 70.0;
            plancategory = "Premium";
        } else {
            rp = "Unlimited Max";
            basePlanCost = 90.0;
            plancategory = "Unlimited";
        }

        totalcost = basePlanCost + dataOverage + callOverage + internationalfee + df;

        System.out.println("Data Usage: " + dataGB + " GB");
        System.out.println("Call Minutes: " + callminutes + " minutes");
        System.out.println("International Usage: " + internationalusage);
        System.out.println("Device Type: " + devicetype);
        System.out.println("Recommended Plan: " + rp);
        System.out.println("Base Plan Cost: $" + basePlanCost);
        System.out.println("Data Overage: $" + dataOverage);
        System.out.println("Call Overage: $" + callOverage);
        System.out.println("International Fee: $" + internationalfee);
        System.out.println("Device Fee: $" + df);
        System.out.println("Total Monthly Cost: $" + totalcost);
        System.out.println("Potential Savings: $" + ps);
        System.out.println("Plan Category: " + plancategory);

        sc.close();
    }
}