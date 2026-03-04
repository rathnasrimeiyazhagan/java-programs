import java.util.Scanner;
public class sumofevennum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int sum=0;
        int i=a;
        while(i<=b){
            if(i%2==0){
                sum+=i;
            }
            i++;
        }
        System.out.println("Sum of even numbers from "+ a+" to "+ b+":"+ sum);
        sc.close();
    }
}
