import java.util.Scanner;

public class deliveryservice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int deliveries=sc.nextInt();
        int payout=sc.nextInt();
        int incentive=sc.nextInt();
        int fuelcost=sc.nextInt();

        int total=(deliveries*payout)+incentive;
        int netearnings=total-fuelcost;
        System.out.println(netearnings);
        sc.close();
    }

}
