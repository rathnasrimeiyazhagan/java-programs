import java.util.*;
public class digitsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int ld=0;
        int sum=0;
        while(n!=0){
            ld=n%10;
            sum+=ld;
            n/=10;
        }
        System.out.println("Number: "+temp);
        System.out.println("Sum of the digits: "+sum);
        sc.close();
    }
}
