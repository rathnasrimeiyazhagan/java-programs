import java.util.Scanner;

public class weeklywage {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int daysworked=sc.nextInt();
        int wageperday=sc.nextInt();
        int overtimebonus=sc.nextInt();
        int maintainance=sc.nextInt();

        int base=daysworked*wageperday;
        int bonus=base+overtimebonus;
        int deduct=bonus-maintainance;

        System.out.println(deduct);
        sc.close();

}
}