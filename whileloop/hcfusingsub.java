import java.util.*;
public class hcfusingsub {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int temp1=a;
        int temp2=b;

        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else if(b>a){
                b=b-a;
            }    
            }
            System.out.println("HCF of " + temp1+ " and " + temp2 + " = " + a);
            sc.close();
    }
}
