import java.util.Scanner;
public class creditcardpurchase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int creditLimit = sc.nextInt();
        int purchaseAmount = sc.nextInt();
        int cardBlocked = sc.nextInt(); 

        if (purchaseAmount <= creditLimit && cardBlocked == 0) {
            System.out.println("Approved");
        } else {
            System.out.println("Declined");
        }

        sc.close();
    
}
}
