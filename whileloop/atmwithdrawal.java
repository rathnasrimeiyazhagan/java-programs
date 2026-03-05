import java.util.*;
public class atmwithdrawal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Balance: ");
        int bal=sc.nextInt();
        int rembal=0;
        do{
            System.out.print("Enter withdrawal amount: ");
            int wd=sc.nextInt();
            if(wd<bal){
                if(wd<=100){
                    System.out.println("Invalid amount! Try again.");
                }else{
                    rembal=bal-wd;
                System.out.println("Withdrawal success! Remaining balance: "+rembal);
                break;
                }
                
            }
            else{
                System.out.println("Insufficient funds! Try again.");
            }
        }
        while(bal!=0);
        sc.close();

        
    }
}
