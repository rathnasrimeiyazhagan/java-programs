import java.util.*;
public class eligibilitychecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String status = "";
        int eligible = 0;
        int rejected = 0;
        double elgibilityrate = 0;

        for(int i = 0; i < n; i++){

            String name = sc.next();
            int age = sc.nextInt();
            double weight = sc.nextDouble();
            double hemoglobin = sc.nextDouble();

            System.out.println("Donor: " + name);
            System.out.println("Age: " + age + " years");
            System.out.println("Weight: " + weight + " kg");
            System.out.println("Hemoglobin: " + hemoglobin + " g/dL");

            if(age < 18){
                status = "Not Eligible";
                rejected++;
                System.out.println("Status: " + status);
                System.out.println("Reason: Age below 18 years");
            }
            else if(age > 65){
                status = "Not Eligible";
                rejected++;
                System.out.println("Status: " + status);
                System.out.println("Reason: Age above 65 years");
            }
            else if(weight < 50){
                status = "Not Eligible";
                rejected++;
                System.out.println("Status: " + status);
                System.out.println("Reason: Weight below 50 kg");
            }
            else if(hemoglobin < 12.5){
                status = "Not Eligible";
                rejected++;
                System.out.println("Status: " + status);
                System.out.println("Reason: Hemoglobin below 12.5 g/dL");
            }
            else{
                status = "Eligible";
                eligible++;
                System.out.println("Status: " + status);
            }

            System.out.println();
        }

        elgibilityrate = (eligible * 100.0) / n;

        System.out.println("Total Donors: " + n);
        System.out.println("Eligible Donors: " + eligible);
        System.out.println("Rejected Donors: " + rejected);
        System.out.printf("Eligibility Rate: %.2f", elgibilityrate+ "%");

        sc.close();
    }
}