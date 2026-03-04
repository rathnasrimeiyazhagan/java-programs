import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int first=0;
        int sec=1;
        int c=0;
        int i=0;
        System.out.print(first+" ");
        System.out.print(sec+" ");
        while(i<n-2){
            c=first+sec;
            first=sec;
            sec=c;
            i++;
        System.out.print(c+" ");
        }
        sc.close();
    }
}
