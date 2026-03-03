import java.util.*;
public class parkingfee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int hourlyrate = 0;
        double fee = 0;
        int dailycap = 0;
        double finalfee = 0;
        int count = 0;
        double totalrev = 0;
        double avgfee = 0;

        for(int i = 0; i < n; i++){

            String type = sc.next();
            double hoursparked = sc.nextDouble();

            if(type.equalsIgnoreCase("car")){
                hourlyrate = 3;
                dailycap = 30;
            }
            else if(type.equalsIgnoreCase("motorcycle")){
                hourlyrate = 2;
                dailycap = 20;
            }
            else if(type.equalsIgnoreCase("truck")){
                hourlyrate = 5;
                dailycap = 60;
            }
            else if(type.equalsIgnoreCase("bus")){
                hourlyrate = 7;
                dailycap = 100;
            }

            fee = hoursparked * hourlyrate;
            finalfee = Math.min(fee, dailycap);

            if(hoursparked > 8){
                count++;
            }

            totalrev += finalfee;

            System.out.println("Vehicle " + (i+1) + ": " + type);
            System.out.println("Hours Parked: " + hoursparked);
            System.out.println("Hourly Rate: $" + (double)hourlyrate);
            System.out.println("Parking Fee: $" + finalfee);

            if(fee > dailycap){
                System.out.println("Cap Applied: Yes");
            }
            else{
                System.out.println("Cap Applied: No");
            }

            System.out.println();
        }

        avgfee = totalrev / n;

        System.out.println("Total Vehicles: " + n);
        System.out.println("Total Revenue: $" + totalrev);
        System.out.println("Average Fee:"+String.format("$%.2f",avgfee));
        System.out.println("Peak Hour Vehicles (>8 hours): " + count);

        sc.close();
    }
}