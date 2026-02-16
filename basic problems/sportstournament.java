import java.util.Scanner;    
    public class sportstournament {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int registration = sc.nextInt();
        int broadcast = sc.nextInt();
        int sponsor = sc.nextInt();
        int prize = sc.nextInt();
        int rent = sc.nextInt();
        int advertising = sc.nextInt();

        int remainingFund = registration + broadcast + sponsor - prize - rent - advertising;

        System.out.println(remainingFund);
        sc.close();

    }
}

    

