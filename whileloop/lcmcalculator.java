import java.util.*;
public class lcmcalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int temp1=a;
        int temp2=b;
        int rem=1;
        int lcm=1;
        while(b!=0){
            rem=a%b;
            a=b;
            b=rem;
        }
        int gcd=a;
        lcm=(temp1*temp2)/gcd;
        System.out.println("LCM of "+temp1+" and "+temp2+" = "+lcm);
        sc.close();

    }
}
