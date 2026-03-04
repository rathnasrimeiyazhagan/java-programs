import java.util.*;
public class sumcalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=1;
        int sum=0;
        int count=0;
        while(n!=0){
            System.out.print("Enter number (0 to stop): ");
            int num=sc.nextInt();
            if(num==0){
                break;
            }
            else{
                sum+=num;
                count++;
            }
            n++;
        }
        System.out.println("Total sum: "+sum);
        System.out.println("Count: "+count);
        sc.close();
    }
}
