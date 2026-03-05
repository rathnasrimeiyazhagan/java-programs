import java.util.*;

public class menudrivencalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Calculator menu: ");
        System.out.println("1. Add ");
        System.out.println("2. Subtract ");
        System.out.println("3. Multiply");
        System.out.println("4. Divide ");
        System.out.println("5. Exit ");
        int choice;

        do{
            System.out.print("Choice: ");
            choice=sc.nextInt();
            
            
            if(choice>=1&&choice<=4){
            System.out.print("Enter two numbers: ");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int res=0;
            switch(choice){
                case 1:
                    res=a+b;
                    break;
                case 2:
                    res=a-b;
                    break;
                case 3:
                    res=a*b;
                    break;
                case 4:
                    if(b!=0){
                        res=a/b;
                       
                    }
                    else{
                        System.out.println("Cannot divide by zero");
                        continue;
                    }
                     break;
                }
                System.out.println("Result: "+res);
            }
                  
            else if(choice==5){
                    System.out.println("Goodbye!");
                }
            
        }
        while(choice!=5);
        sc.close();
    }
}
