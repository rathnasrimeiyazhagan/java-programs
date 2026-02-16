import java.util.Scanner;

public class transportfee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance=sc.nextInt();
        int rate=sc.nextInt();
        int maintainance=sc.nextInt();
        int allowance=sc.nextInt();
        int subsidy=sc.nextInt();

        int total=(distance*rate)+maintainance+allowance;
        int transportfee=total-subsidy;
        System.out.println(transportfee);
        sc.close();

}
}
