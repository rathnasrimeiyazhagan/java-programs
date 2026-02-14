import java.util.Scanner;

public class Mobiledata {
    public static void main(String[] args){ 
        Scanner scan = new Scanner(System.in);

        float basecost = scan.nextFloat();
        float extragb = scan.nextFloat();
        float ratepergb = scan.nextFloat();
        float tax = scan.nextFloat();

        float extraCost = extragb * ratepergb;
        float subtotal = basecost + extraCost;
        float taxAmount = subtotal * tax / 100;
        float bill = subtotal + taxAmount;

        System.out.println("Total Bill = " + bill);
    }
}
