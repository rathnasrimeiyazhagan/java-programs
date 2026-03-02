import java.util.Scanner;

public class pricediscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int dis = 0;
        double subtotal = 0;
        double originalprice = 0;
        int totitems = 0;
        double finaltot = 0;
        double totaldis = 0;
        double savingsper = 0;

        for (int i = 0; i < n; i++) {

            String name = sc.next();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();

            subtotal = price * quantity;

            if (quantity >= 2 && quantity <= 4) {
                dis = 10;
            } else if (quantity >= 5 && quantity <= 9) {
                dis = 15;
            } else if (quantity >= 10) {
                dis = 20;
            } else {
                dis = 0;
            }

            double discountAmount = subtotal * dis / 100.0;
            double discountedPrice = subtotal - discountAmount;

            originalprice += subtotal;
            finaltot += discountedPrice;
            totitems += quantity;

            System.out.println("Product: " + name);
            System.out.println("Unit price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + dis + "%");
            System.out.println("Subtotal: $" + discountedPrice);
            System.out.println();
        }

        totaldis = originalprice - finaltot;

        if (originalprice != 0) {
            savingsper = (totaldis / originalprice) * 100;
        }

        System.out.println("Total items: " + totitems);
        System.out.println("Original cost: $" + originalprice);
        System.out.println("Total discount: $" + totaldis);
        System.out.println("Final total: $" + finaltot);
        System.out.println("Savings: " + savingsper + "%");

        sc.close();
    }
}