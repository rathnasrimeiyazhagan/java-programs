
    import java.util.Scanner;
    public class grocery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float sales = sc.nextFloat();
        float discount = sc.nextFloat();
        float gst = sc.nextFloat();

        float discountamount = sales * discount / 100;
        float afterdiscount = sales - discountamount;

        float gstAmount = afterdiscount * gst / 100;
        float finalRevenue = afterdiscount + gstAmount;

        System.out.println("Final Revenue = " + finalRevenue);
    }
}


