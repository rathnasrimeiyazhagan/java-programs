import java.util.Scanner;
public class strongnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int ld=0;
        int sum=0;
        while(n!=0){
            ld=n%10;
            int fact=1;
            for(int i=1;i<=ld;i++){
                fact*=i; 
            }
            sum+=fact;
            
            n/=10;
        }
        if(temp==sum){
            System.out.println(temp+" is a strong number");
        }
        else{
            System.out.println(temp+" is not a strong number");
        }
        sc.close();
    }
}
