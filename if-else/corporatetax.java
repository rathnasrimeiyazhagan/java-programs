import java.util.Scanner;

public class corporatetax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double ar = sc.nextDouble();
        sc.nextLine();
        String bt = sc.nextLine();
        double de = sc.nextDouble();
        double tc = sc.nextDouble();

        double ti = ar - de;
        int tr = 0;

        if (bt.equalsIgnoreCase("C-Corp")) {

            if (ti < 500000) {
                tr = 21;
            } else if (ti <= 1000000) {
                tr = 24;
            } else if (ti <= 2000000) {
                tr = 28;
            } else {
                tr = 30;
            }

        } else if (bt.equalsIgnoreCase("S-Corp")) {

            if (ti < 500000) {
                tr = 20;
            } else if (ti <= 1000000) {
                tr = 25;
            } else {
                tr = 28;
            }

        } else if (bt.equalsIgnoreCase("LLC")) {

            if (ti < 200000) {
                tr = 15;
            } else if (ti <= 500000) {
                tr = 18;
            } else {
                tr = 22;
            }

        } else if (bt.equalsIgnoreCase("Partnership")) {

            if (ti < 300000) {
                tr = 18;
            } else if (ti <= 800000) {
                tr = 22;
            } else {
                tr = 26;
            }
        }

        double gt = ti * tr / 100.0;
        double nt = gt - tc;

        if (nt < 0) {
            nt = 0;
        }

        double er = (nt / ar) * 100;

        System.out.println("Annual Revenue: $" + ar);
        System.out.println("Business Type: " + bt);
        System.out.println("Deductible Expenses: $" + de);
        System.out.println("Tax Credits: $" + tc);
        System.out.println("Taxable Income: $" + ti);
        System.out.println("Tax Rate: " + tr + "%");
        System.out.println("Gross Tax: $" + gt);
        System.out.println("Net Tax After Credits: $" + nt);
        System.out.printf("Effective Tax Rate: %.2f%%", er);

        sc.close();
    }
}