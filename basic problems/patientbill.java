import java.util.Scanner;
public class patientbill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int roomcharge=sc.nextInt();
        int days=sc.nextInt();
        int medicine=sc.nextInt();
        int labfees=sc.nextInt();
        int insurance=sc.nextInt();

        int bill=(roomcharge*days)+medicine+labfees;
        int finalbill=bill-insurance;
        System.out.println(finalbill);
        sc.close();
    
}
}
