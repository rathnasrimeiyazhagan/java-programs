import java.util.*;
public class powercalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int e=sc.nextInt();
        int prod=1;
        int i=0;
        while(i<e){
            prod=prod*b;
            i++;
        }
        System.out.println(prod);
        sc.close();
    }
}
