import java.util.Scanner;

public class gymtrainersalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base=sc.nextInt();
        int sessions=sc.nextInt();
        int paypersession=sc.nextInt();
        int bonus=sc.nextInt();
        int maintainance=sc.nextInt();

        int salary=base+(sessions*paypersession);
        int subtotal=salary+bonus;
        int finalsalary=subtotal-maintainance;

        System.out.println(finalsalary); 
        sc.close();
}
}