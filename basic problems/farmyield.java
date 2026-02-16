import java.util.Scanner;

public class farmyield {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yieldperacre=sc.nextInt();
        int acres=sc.nextInt();
        int extra=sc.nextInt();
        int damaged=sc.nextInt();

        int total=(yieldperacre*acres)+extra;
        int marketable=total-damaged;
        System.out.println(marketable);
        sc.close();

    
}
}
