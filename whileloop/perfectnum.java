import java.util.Scanner;
public class perfectnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        int i=1;
        while(i<=n/2){
           if(n%i==0){
            sum+=i;
           }
           i++;
        }
        if(temp==sum){
            System.out.println(temp+" is a perfect number!");
        }
        else{
            System.out.println(temp+" is not a perfect number");
        }
        sc.close();
    }
}
