import java.util.Scanner;
public class calendar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int days=sc.nextInt();
        int startday=sc.nextInt();
        int count =0;
        System.out.println("Calendar grid: ");
        System.out.print("Mon Tue Wed Thu Fri Sat Sun ");
        System.out.println();
        for(int i=0;i<startday;i++){
            System.out.print(" ");
            count++;
        }
        for(int i=1;i<=days;i++){
            System.out.print(i+" ");
            if(count%7==0){
                System.out.println();
            }
            count++;
        }
    }
}
