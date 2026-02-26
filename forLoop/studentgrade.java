import java.util.Scanner;

public class studentgrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int sum = 0;
        int highest = 0;
        int pass = 0;
        int fail = 0;

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score = sc.nextInt();
    
            char grade='a';
            String status="";

            if (score >= 85 && score <= 100) {
                grade = 'A';
            } else if (score >= 70 && score <= 84) {
                grade = 'B';
            } else if (score >= 60 && score <= 69) {
                grade = 'C';
            } else if (score >= 50 && score <= 59) {
                grade = 'D';
            } else if (score >= 0 && score <= 49) {
                grade = 'F';
            }
            sum += score;

            if (score >= 60) {
                status = "Pass";
                pass++;
            } else if (score < 60) {
                status = "Fail";
                fail++;
            }
            highest = Math.max(highest, score);

            System.out.println("Student: " + name);
            System.out.println("Score: " + score);
            System.out.println("Letter grade: " + grade);
            System.out.println("Status: " + status);
            System.out.println();
        }
        double avg = (double) sum / n;
        System.out.println("Total students: " + n);
        System.out.println("Class average: " + avg);
        System.out.println("Highest score: " + highest);
        System.out.println("Students passed: " + pass);
        System.out.println("Students failed: " + fail);
        sc.close();

    }
}
