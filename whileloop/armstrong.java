import java.util.*;
public class armstrong{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int temp2=n;
        int ld=0;
        int count=0;
        while(n!=0){
            ld=n%10;
            count++;
            n/=10;
        }
        
        int sum=0;
        int ld2=0;
        while(temp!=0){
            ld2=temp%10;
            int pow=1;
            for(int i=0;i<count;i++){
                pow=pow*ld2;
            }
            sum+=pow;
            temp/=10;
        }
        if(temp2==sum){
            System.out.println(temp2+" is an armstrong number");
        }
        else{
             System.out.println(temp2+" is not an armstrong number");
        }
        sc.close();
    }
}