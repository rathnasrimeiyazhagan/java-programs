import java.util.*;
public class reversenum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int rev=0;
        int ld=0;
        while(n!=0){
            ld=n%10;
            rev=rev*10+ld;
            n/=10;
        }
        System.out.println("Original: "+temp);
        System.out.println("Reversed: "+rev);
        sc.close();
    }
}
