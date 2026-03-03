import java.util.*;
public class ordersystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int totalitem = 0;
        double subtotal = 0;
        double tax = 0;
        double sercharge = 0;
        double grandtot = 0;

        for(int i = 0; i < n; i++){

            String name = sc.next();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();

            double itemsubtotal = price * quantity;

            subtotal += itemsubtotal;
            totalitem += quantity;

            System.out.println("Item: " + name);
            System.out.printf("Price: $%.2f x %d\n", price, quantity);
            System.out.printf("Subtotal: $%.2f\n", itemsubtotal);
            System.out.println();
        }

        tax = subtotal * 0.08;
        sercharge = subtotal * 0.10;
        grandtot = subtotal + tax + sercharge;

        System.out.println("Total Items: " + totalitem);
        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Tax (8%%): $%.2f\n", tax);
        System.out.printf("Service Charge (10%%): $%.2f\n", sercharge);
        System.out.printf("Grand Total: $%.2f\n", grandtot);

        sc.close();
    }
}