import java.util.*;
public class ticketbooking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int baseprice = 0;
        int cusdis = 0;
        double indtp = 0;
        double originaltot = 0;
        double finaltot = 0;

        for(int i = 0; i < n; i++){

            String seattype = sc.next();
            String custype = sc.next();

            if(seattype.equalsIgnoreCase("regular")){
                baseprice = 12;
            }
            else if(seattype.equalsIgnoreCase("premium")){
                baseprice = 18;
            }
            else if(seattype.equalsIgnoreCase("recliner")){
                baseprice = 25;
            }

            if(custype.equalsIgnoreCase("adult")){
                cusdis = 0;
            }
            else if(custype.equalsIgnoreCase("child")){
                cusdis = 30;
            }
            else if(custype.equalsIgnoreCase("senior")){
                cusdis = 25;
            }

            indtp = baseprice * (1 - cusdis / 100.0);

            originaltot += baseprice;
            finaltot += indtp;

            System.out.println("Ticket " + (i+1) + ": " + seattype + " - " + custype);
            System.out.println("Base Price: $" + (double)baseprice);
            System.out.println("Discount: " + cusdis + "%");
            System.out.println("Final Price: $" + indtp);
            System.out.println();
        }

        if(n >= 5){
            finaltot = finaltot - (finaltot * 0.10);
        }

        double totdis = originaltot - finaltot;

        System.out.println("Total Tickets: " + n);
        System.out.println("Original Total: $" + originaltot);
        System.out.println("Total Discount: $" + totdis);
        System.out.println("Final Total: $" + finaltot);

        if(n >= 5){
            System.out.println("Group Discount Applied: Yes");
        }
        else{
            System.out.println("Group Discount Applied: No");
        }

        sc.close();
    }
}