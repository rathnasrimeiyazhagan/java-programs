import java.util.Scanner;
public class restaurantbill {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int total=scan.nextInt();
        int service=scan.nextInt();
        int gst=scan.nextInt();
        int noofpeople=scan.nextInt();

        service=total*service/100;
        gst=(total+service)*gst/100;
        int subtotal=total+service+gst;
        float amtperperson=(float)subtotal/noofpeople;

        System.out.println(amtperperson);
        scan.close();

    }
    
}
