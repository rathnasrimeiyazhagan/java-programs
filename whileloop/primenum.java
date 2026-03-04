import java.util.*;

public class primenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println(n + " is not prime");
            sc.close();
            return;
        }

        int i = 2;
        int prime = 1;

        while (i < n) { 
            if (n % i == 0) {
                prime = 0;
                break;
            }
            i++;
        }

        if (prime==1) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }

        sc.close();
    }
}