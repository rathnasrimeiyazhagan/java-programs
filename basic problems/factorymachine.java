import java.util.Scanner;

public class factorymachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rodsperhour=sc.nextInt();
        int hoursworked=sc.nextInt();
        int overtime=sc.nextInt();
        int rejected=sc.nextInt();

        int finalproduction=(rodsperhour*hoursworked)+overtime-rejected;
        System.out.println(finalproduction);
        sc.close();
    
}
}
