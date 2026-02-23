import java.util.Scanner;

public class licencepricing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int usercount = sc.nextInt();
        sc.nextLine();
        String licensetype = sc.nextLine();
        String supportlevel = sc.nextLine();
        int contractyears = sc.nextInt();

        int baseprice = 0;

        if (licensetype.equalsIgnoreCase("standard")) {
            baseprice = 60;
        }
        else if (licensetype.equalsIgnoreCase("professional")) {
            baseprice = 120;
        }
        else if (licensetype.equalsIgnoreCase("enterprise")) {
            baseprice = 200;
        }

        int voldiscount = 0;

        if (usercount >= 1 && usercount <= 50) {
            voldiscount = 0;
        }
        else if (usercount <= 200) {
            voldiscount = 15;
        }
        else if (usercount <= 500) {
            voldiscount = 20;
        }
        else if (usercount <= 1000) {
            voldiscount = 25;
        }
        else {
            voldiscount = 35;
        }

        int supportfee = 0;

        if (supportlevel.equalsIgnoreCase("basic")) {
            supportfee = 10;
        }
        else if (supportlevel.equalsIgnoreCase("priority")) {
            supportfee = 30;
        }
        else if (supportlevel.equalsIgnoreCase("premium")) {
            supportfee = 80;
        }

        int multiyeardis = 0;

        if (contractyears == 1) {
            multiyeardis = 0;
        }
        else if (contractyears == 2) {
            multiyeardis = 5;
        }
        else if (contractyears == 3) {
            multiyeardis = 10;
        }
        else if (contractyears == 5) {
            multiyeardis = 20;
        }

        double disbase = baseprice * (1 - voldiscount / 100.0);
        double annualperuser = (disbase + supportfee) * (1 - multiyeardis / 100.0);
        double totalannual = annualperuser * usercount;
        double contractvalue = totalannual * contractyears;

        String pricingtier = "";

        if (usercount < 200) {
            pricingtier = "Small Business";
        }
        else if (usercount <= 1000) {
            pricingtier = "Mid-Market";
        }
        else {
            pricingtier = "Enterprise";
        }

        System.out.println("User Count: " + usercount);
        System.out.println("License Type: " + licensetype);
        System.out.println("Support Level: " + supportlevel);
        System.out.println("Contract Duration: " + contractyears + " years");
        System.out.println("Base Price Per User: $" + (double) baseprice);
        System.out.println("Volume Discount: " + voldiscount + "%");
        System.out.println("Support Fee Per User: $" + (double) supportfee);
        System.out.println("Multi-Year Discount: " + multiyeardis + "%");
        System.out.println("Annual Cost Per User: $" + annualperuser);
        System.out.println("Total Annual Cost: $" + totalannual);
        System.out.println("Total Contract Value: $" + contractvalue);
        System.out.println("Pricing Tier: " + pricingtier);

        sc.close();
    }
}