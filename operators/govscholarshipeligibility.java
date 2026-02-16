import java.util.Scanner;

public class govscholarshipeligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int familyIncome = sc.nextInt();
        int percentage = sc.nextInt();

        if (familyIncome < 200000 && percentage >= 75) {
            System.out.println("Scholarship Granted");
        } else {
            System.out.println("Not Granted");
        }

        sc.close();
    }
    
}
