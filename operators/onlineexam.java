import java.util.Scanner;
public class onlineexam{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int theoryMarks = sc.nextInt();
        int practicalMarks = sc.nextInt();

        int average = (theoryMarks + practicalMarks) / 2;

        if (theoryMarks >= 50 && practicalMarks >= 50 && average >= 60) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        sc.close();
    }

    }
