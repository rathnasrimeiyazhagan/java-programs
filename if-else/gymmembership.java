import java.util.Scanner;

public class gymmembership {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String tier = sc.nextLine();
        int contractmonths = sc.nextInt();
        sc.nextLine();
        String accesslevel = sc.nextLine();
        String addones = sc.nextLine();

        int monthlyfee = 0;

        if (tier.equalsIgnoreCase("basic")) {
            monthlyfee = 40;
        } 
        else if (tier.equalsIgnoreCase("premium")) {
            monthlyfee = 80;
        } 
        else if (tier.equalsIgnoreCase("elite")) {
            monthlyfee = 120;
        } 
        else if (tier.equalsIgnoreCase("vip")) {
            monthlyfee = 150;
        }

        int contractdis = 0;

        if (contractmonths == 1) {
            contractdis = 0;
        } 
        else if (contractmonths == 6) {
            contractdis = 10;
        } 
        else if (contractmonths == 12) {
            contractdis = 15;
        } 
        else if (contractmonths == 24) {
            contractdis = 25;
        }

        int accessfee = 0;

        if (accesslevel.equalsIgnoreCase("single-location")) {
            accessfee = 0;
        } 
        else if (accesslevel.equalsIgnoreCase("regional")) {
            accessfee = 20;
        } 
        else if (accesslevel.equalsIgnoreCase("nationwide")) {
            accessfee = 50;
        }

        int addonfee = 0;

        if (addones.equalsIgnoreCase("none")) {
            addonfee = 0;
        } 
        else if (addones.equalsIgnoreCase("personal-training")) {
            addonfee = 100;
        } 
        else if (addones.equalsIgnoreCase("classes")) {
            addonfee = 50;
        } 
        else if (addones.equalsIgnoreCase("full-package")) {
            addonfee = 200;
        }

        double discountedbase = monthlyfee * (1 - contractdis / 100.0);
        double monthlytotal = discountedbase + accessfee + addonfee;
        double contracttotal = monthlytotal * contractmonths;

        double normalTotal = (monthlyfee + accessfee + addonfee) * contractmonths;
        double savings = normalTotal - contracttotal;

        String category = "";

        if (monthlytotal >= 50 && monthlytotal <= 100) {
            category = "Budget";
        } 
        else if (monthlytotal > 100 && monthlytotal <= 150) {
            category = "Standard";
        } 
        else if (monthlytotal > 150 && monthlytotal <= 200) {
            category = "Premium";
        } 
        else if (monthlytotal > 200 && monthlytotal <= 250) {
            category = "Luxury";
        }

        System.out.println("Membership Tier: " + tier);
        System.out.println("Contract length: " + contractmonths + " months");
        System.out.println("Access level: " + accesslevel);
        System.out.println("Add-ons: " + addones);
        System.out.println("Base Monthly fee: $" + monthlyfee);
        System.out.println("Contract Discount: " + contractdis + "%");
        System.out.println("Access Fee: $" + accessfee);
        System.out.println("Add-on Fee: $" + addonfee);
        System.out.println("Monthly total: $" + monthlytotal);
        System.out.println("Contract total: $" + contracttotal);
        System.out.println("Savings vs Month-to-Month: $" + savings);
        System.out.println("Membership category: " + category);

        sc.close();
    }
}