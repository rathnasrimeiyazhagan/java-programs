import java.util.*;
public class passwordval {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String originalpw=sc.next();
        int att=3;
        while(att>0){
            att--;
            System.out.println("Enter password: ");
            String password=sc.next();
            if(originalpw.equals(password)){
                System.out.println("Access granted!");
                break;
            }
            else {
                if(att==0){
                    System.out.println("Account locked!");
                    
                }
                else{
                    System.out.println("Incorrect! Attempts remaining "+att);
                }
                
            }
            

        }
        sc.close();
    }
}
