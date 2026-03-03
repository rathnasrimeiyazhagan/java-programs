import java.util.*;
public class farecalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double discharges=0;
        int surcharges=0;
        double totalfare=0;
        double totaldis=0;
        double totalrev=0;

        for(int i=0;i<n;i++){
            double distance=sc.nextDouble();
            String time=sc.next();

            double basefare=3.00;
            if(time.equalsIgnoreCase("morning")){
                basefare=3.00;
                discharges=distance*1.00;
                surcharges=0;
            }
             else if(time.equalsIgnoreCase("afternoon")){
                basefare=3.00;
                discharges=distance*1.00;
                surcharges=0;
            }
             else if(time.equalsIgnoreCase("evening")){
                basefare=3.00;
                discharges=distance*1.00;
                surcharges=3;
            }
             else if(time.equalsIgnoreCase("night")){
                basefare=3.00;
                discharges=distance*1.00;
                surcharges=5;
            }
            totalfare=basefare+discharges+surcharges;
            totaldis+=distance;
            totalrev+=totalfare;
            System.out.println("Ride "+i+1);
            System.out.println("Distance: "+distance+"km");
            System.out.println("Time: "+time);
            System.out.println("base fare: $"+basefare);
            System.out.println("Distance charge: $"+discharges);
            System.out.println("Time surcharges: $"+surcharges);
            System.out.println("Total fare: $"+totalfare);
            System.out.println();
        }
        double avgfare=0;
        avgfare=totalrev/n;
        System.out.println("Total rides: "+n);
        System.out.println("Total distance: "+totaldis);
        System.out.println("Total revenue: $"+totalrev);
        System.out.println("Average fare: $"+avgfare);
        sc.close();
    }
}
