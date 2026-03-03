import java.util.*;
public class dataanalyzer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String status="";
        double high=0;
        double low=1000000;
        int hot=0;
        int cold=0;
        double tottemp=0;
        double avg=0;
        int hh=0;
        int lh=0;
        for(int i=0;i<n;i++){
            int hour=sc.nextInt();
            double temp=sc.nextDouble();

            if(temp>=40 || temp<0){
                status="Extreme";
            }
            else if(temp>=32 &&temp<40){
                status="Hot";
                hot++;
            }
            else if(temp>=0 &&temp<10){
                status="Cold";
                cold++;
            }
            else if(temp>=10 &&temp<32){
                status="Normal";
            }
            if(temp>high){
                high=temp;
                hh=hour;
            }
            if(temp<low){
                low=temp;
                lh=hour;
            }
            tottemp+=temp;
            System.out.println("Hour "+hour+": "+temp);
            System.out.println("Status: "+status);
            System.out.println();
            
            
        }
        avg=tottemp/n;
        System.out.println("Total readings: "+n);
        System.out.println("Average temperature: "+String.format("%.2f",avg)+"C");
        System.out.println("Higest Temperature: "+high+" at hour "+hh);
        System.out.println("Lowest temperature: "+low+" at hour "+lh);
        System.out.println("Hot hours: "+hot);
        System.out.println("Cold hours: "+cold);
       sc.close();

    }
}

