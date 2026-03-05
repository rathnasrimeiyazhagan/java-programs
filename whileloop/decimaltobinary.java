import java.util.*;
public class decimaltobinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dec=sc.nextInt();
        int a=0;
        int binary=0;
        int rev=1;
        while(dec>0){
            a=dec%2;
            binary=binary+a*rev;
            rev=rev*10;
            dec/=2;
        }
        System.out.println("Binary: "+binary);
    }
}
