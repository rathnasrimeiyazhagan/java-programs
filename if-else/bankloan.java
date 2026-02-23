import java.util.*;

public class bankloan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cs = sc.nextInt();
        double ai = sc.nextDouble();
        double dti = sc.nextDouble();
        sc.nextLine();
        String lt = sc.nextLine();

        String ct, dt;
        String dec = "Rejected";
        double max = 0.0;

       
        if (cs >= 750) ct = "E";
        else if (cs >= 700) ct = "G";
        else if (cs >= 650) ct = "F";
        else ct = "P";

       
        if (dti <= 30) dt = "L";
        else if (dti <= 40) dt = "M";
        else dt = "H";

       
        if (cs < 600 || dti > 50) {
            dec = "Rejected";
            max = 0.0;
        }
        else {

            if (lt.equalsIgnoreCase("Home")) {

                if (ct.equals("E")) {
                    if (dt.equals("L")) {
                        dec = "Approved";
                        max = ai * 4;
                    } else {
                        dec = "Needs Review";
                        max = ai * 3;
                    }
                }
                else if (ct.equals("G") || ct.equals("F")) {
                    if (dt.equals("M") || dt.equals("L")) {
                        dec = "Needs Review";
                        max = ai * 3;
                    }
                }

            }

            else if (lt.equalsIgnoreCase("Personal")) {

                if (ct.equals("E")) {
                    if (dt.equals("L")) {
                        dec = "Approved";
                        max = ai * 1;
                    } else {
                        dec = "Needs Review";
                        max = ai * 0.5;
                    }
                }
                else if (ct.equals("F")) {
                    if (dt.equals("M") || dt.equals("L")) {
                        dec = "Needs Review";
                        max = ai * 0.5;
                    }
                }

            }

            else if (lt.equalsIgnoreCase("Business")) {

                if (ct.equals("E") || ct.equals("G")) {
                    if (dt.equals("L") || dt.equals("M")) {
                        dec = "Approved";
                        max = ai * 3;
                    } else {
                        dec = "Needs Review";
                        max = ai * 3;
                    }
                }

            }
        }

        System.out.println("Credit Score: " + cs);
        System.out.println("Annual Income: $" + ai);
        System.out.println("Debt-to-Income Ratio: " + dti + "%");
        System.out.println("Loan Type: " + lt);
        System.out.println("Decision: " + dec);
        System.out.println("Maximum Loan Amount: $" + max);

        sc.close();
    }
}
