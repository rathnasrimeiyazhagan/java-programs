import java.util.Scanner;
public class multable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int range=sc.nextInt();
        System.out.println("Multiplication table of "+num+":");
        int i=1;
        do{
            System.out.println(num+ " x "+i+" = "+ num*i);
            i++;
        }
        while(i<=range);
        sc.close();
    }
}
