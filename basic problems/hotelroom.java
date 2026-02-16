import java.util.Scanner;

public class hotelroom {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rooms=sc.nextInt();
        int price=sc.nextInt();
        int service=sc.nextInt();
        int commission=sc.nextInt();

        int revenue=(rooms*price)+service;
        int totalrevenue=revenue-commission;
        System.out.println(totalrevenue);
        sc.close();

    
}
}
