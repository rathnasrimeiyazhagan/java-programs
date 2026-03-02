import java.util.*;
public class bookfine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double dailyfine=0;
        double fine=0;
        int finecaps=0;
        int overdue=0;
        double actualfine=0;
        double totfine=0;
        double avgfine=0;
        for(int i=0;i<n;i++){
            String type=sc.next();
            int dayslate=sc.nextInt();
            if(type.equalsIgnoreCase("regular")){
                dailyfine=0.50;
                finecaps=10;
            }
            else if(type.equalsIgnoreCase("reference")){
                dailyfine=1.00;
                finecaps=20;
            }
            else if(type.equalsIgnoreCase("magazine")){
                dailyfine=0.25;
                finecaps=5;
            }
            fine=dayslate*dailyfine;
            actualfine=Math.min(fine, finecaps);
            if(dayslate>0){
                overdue++;
            }
            totfine+=fine;
            avgfine=totfine/n;

        }
    }
}
