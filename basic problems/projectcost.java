import java.util.Scanner;

public class projectcost {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours=sc.nextInt();
        int rate=sc.nextInt();
        int design=sc.nextInt();
        int testing=sc.nextInt();
        int advance=sc.nextInt();

        int total=(hours*rate)+design+testing;
        int projectcost=total-advance;
        System.out.println(projectcost);
        sc.close();
    
}
}