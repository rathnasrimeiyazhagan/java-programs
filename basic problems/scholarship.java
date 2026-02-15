import java.util.Scanner;

public class scholarship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float tuitionFees = sc.nextFloat();
        float scholarship = sc.nextFloat();
        float examFee = sc.nextFloat();
        float libraryFee = sc.nextFloat();

        float scholarshipAmt = tuitionFees * scholarship / 100;
        float afterScholarship = tuitionFees - scholarshipAmt;

        float finalFee = afterScholarship + examFee + libraryFee;

        System.out.println("Final Payable Fee = " + finalFee);
    }
}
