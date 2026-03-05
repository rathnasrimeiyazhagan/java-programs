import java.util.*;
public class pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int i=1;
        do{
           int j=0;
         do{
            System.out.print(i+" ");
            j++;
         }
         while(j<i);
        i++;
        System.out.println();
    }
        while(i<=n);
        sc.close();
    }
}

