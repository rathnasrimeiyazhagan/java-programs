import java.util.*;
public class gradesheet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int std=sc.nextInt();
        int sub=sc.nextInt();
        double avg=0;
        int total=0;
        System.out.println("Grade sheet: ");
        System.out.print("Student ");
        for(int i=1;i<=sub;i++){
            
            System.out.print("Sub "+i+" ");
        }
        System.out.println("Average");
        for(int i=0;i<std;i++){
            String name=sc.next();
            System.out.print(name+" ");
            for(int j=0;j<sub;j++){
                int marks=sc.nextInt();
                System.out.print(marks+" "); 
                total+=marks;
            }
            
            avg=(double)total/sub;
        System.out.printf("%.2f",avg);
        avg=0;
        total=0;
        System.out.println();
        }
        
        sc.close();
    }
}
