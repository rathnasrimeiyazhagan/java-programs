import java.util.*;
public class binarytodec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int binary=sc.nextInt();
        int ld=0;
        int pow=1;
        int res=0;
        while(binary>0){
            ld=binary%10;
            res=res+ld*pow;
            pow=pow*2;
            binary/=10;
        }
        System.out.println("Decimal: "+res);
        sc.close();
    }
}
