import java.util.*;

public class scholarshipeligibility{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double gpa = sc.nextDouble();
        double income = sc.nextDouble();
        int extra = sc.nextInt();
        sc.nextLine(); 
        String stype = sc.nextLine();

        System.out.println("GPA: " + gpa);
        System.out.println("Family Income: $" + income);
        System.out.println("Extracurricular Score: " + extra);
        System.out.println("Scholarship Type: " + stype);

        boolean eligible = false;
        double award = 0;
        String category = "None";

        if (gpa >= 2.5) {

            if (stype.equals("Merit")) {
                if (gpa >= 3.8 && extra >= 80) {
                    award = 25000;
                    category = "Full";
                    eligible = true;
                } else if (gpa >= 3.5 && extra >= 70) {
                    award = 15000;
                    category = "Partial";
                    eligible = true;
                } else if (gpa >= 3.0 && extra >= 60) {
                    award = 8000;
                    category = "Minimal";
                    eligible = true;
                }
            }

            else if (stype.equals("Need-Based")) {
                if (income <= 30000 && gpa >= 3.5) {
                    award = 30000;
                    category = "Full";
                    eligible = true;
                } else if (income <= 50000 && gpa >= 3.0) {
                    award = 18000;
                    category = "Partial";
                    eligible = true;
                } else if (income <= 70000 && gpa >= 2.8) {
                    award = 10000;
                    category = "Minimal";
                    eligible = true;
                }
            }

            else if (stype.equals("Sports")) {
                if (extra >= 85 && gpa >= 3.0) {
                    award = 22000;
                    category = "Full";
                    eligible = true;
                } else if (extra >= 75 && gpa >= 2.8) {
                    award = 20000;
                    category = "Partial";
                    eligible = true;
                } else if (extra >= 65 && gpa >= 2.5) {
                    award = 12000;
                    category = "Minimal";
                    eligible = true;
                }
            }
        }

        if (eligible) {
            System.out.println("Eligibility: Eligible");
            System.out.println("Award Amount: $" + award);
            System.out.println("Award Category: " + category);
        } else {
            System.out.println("Eligibility: Not Eligible");
        }

        sc.close();
    }
}
