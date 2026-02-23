import java.util.Scanner;

public class vechicleinsurance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        sc.nextLine();
        String vechicletype = sc.nextLine();
        String drivingrec = sc.nextLine();
        String coveragelevel = sc.nextLine();

        double bp = 0;

        if (coveragelevel.equalsIgnoreCase("basic")) {
            bp = 500;
        } 
        else if (coveragelevel.equalsIgnoreCase("standard")) {
            bp = 800;
        } 
        else if (coveragelevel.equalsIgnoreCase("comprehensive")) {
            bp = 1500;
        }

        double agefactor = 0;

        if (age >= 16 && age <= 21) {
            agefactor = 1.8;
        } 
        else if (age <= 25) {
            agefactor = 1.5;
        } 
        else if (age <= 40) {
            agefactor = 1.0;
        } 
        else if (age <= 60) {
            agefactor = 0.9;
        } 
        else {
            agefactor = 1.1;
        }

        double riskfactor = 0;

        if (vechicletype.equalsIgnoreCase("sedan")) {
            riskfactor = 1.0;
        } 
        else if (vechicletype.equalsIgnoreCase("suv")) {
            riskfactor = 1.2;
        } 
        else if (vechicletype.equalsIgnoreCase("sports")) {
            riskfactor = 1.5;
        } 
        else if (vechicletype.equalsIgnoreCase("truck")) {
            riskfactor = 1.1;
        }

        int recadj = 0;

        if (drivingrec.equalsIgnoreCase("clean")) {
            recadj = -10;
        } 
        else if (drivingrec.equalsIgnoreCase("minor-violations")) {
            recadj = 25;
        } 
        else if (drivingrec.equalsIgnoreCase("major-violations")) {
            recadj = 50;
        }

        double adjpremium = bp * agefactor * riskfactor;
        double finalpremium = adjpremium * (1 + recadj / 100.0);
        double monthlypremium = finalpremium / 12;

        String rc;

        if (agefactor >= 1.5 || riskfactor >= 1.5 || recadj >= 50) {
            rc = "High";
        } 
        else if (agefactor <= 1.0 && riskfactor <= 1.1 && recadj <= 0) {
            rc = "Low";
        } 
        else {
            rc = "Medium";
        }

        System.out.println("Driver Age: " + age);
        System.out.println("Vehicle Type: " + 
            vechicletype.substring(0,1).toUpperCase() + vechicletype.substring(1).toLowerCase());
        System.out.println("Driving Record: " + 
            drivingrec.substring(0,1).toUpperCase() + drivingrec.substring(1).toLowerCase());
        System.out.println("Coverage Level: " + 
            coveragelevel.substring(0,1).toUpperCase() + coveragelevel.substring(1).toLowerCase());
        System.out.println("Base Premium: $" + bp);
        System.out.println("Age Factor: " + agefactor + "x");
        System.out.println("Vehicle Risk Factor: " + riskfactor + "x");
        System.out.println("Record Adjustment: " + recadj + "%");
        System.out.println("Monthly Premium: $" + monthlypremium);
        System.out.println("Annual Premium: $" + finalpremium);
        System.out.println("Risk Category: " + rc);

        sc.close();
    }
}