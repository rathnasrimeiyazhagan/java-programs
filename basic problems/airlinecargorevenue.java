import java.util.Scanner;
public class airlinecargorevenue {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        int rate = sc.nextInt();
        int priority = sc.nextInt();
        int insurance = sc.nextInt();
        int handling = sc.nextInt();
        int fuel = sc.nextInt();
        int revenue = (weight * rate) + priority + insurance - handling - fuel;
        System.out.println(revenue);
        sc.close();

     
    }
}


