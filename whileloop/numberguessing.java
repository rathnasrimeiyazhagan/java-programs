import java.util.*;
public class numberguessing {
    public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    int secnum=sc.nextInt();
    int count=0;
    int n=1;
    while(n!=0){
        System.out.print("Guess the number(1100): ");
        int num=sc.nextInt();
        count++;
        if(num>secnum){
            System.out.println("Too High");
        }
        else if(num<secnum){
            System.out.println("Too Low");
        }
        else if(num==secnum){
            System.out.print("Correct! ");
            System.out.println("Attempts: "+count);
            break;
        }
        
        
    }
    sc.close();
}
}
