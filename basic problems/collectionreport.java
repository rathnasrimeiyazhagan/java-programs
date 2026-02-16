import java.util.Scanner;

public class collectionreport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ticket=sc.nextInt();
        int snack=sc.nextInt();
        int maintainance=sc.nextInt();
        int electricity=sc.nextInt();

        int total=ticket+snack;
        int subtotal=total-maintainance;
        int netprofit=subtotal-electricity;

        System.out.println(netprofit);
        sc.close();

    
}
}
