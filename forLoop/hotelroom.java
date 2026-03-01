import java.util.*;

public class hotelroom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double sumocc = 0;
        double highocc = 0;
        int peakday = 0;
        int fullcap = 0;

        for (int i = 0; i < n; i++) {

            int day = sc.nextInt();
            int roomsocc = sc.nextInt();
            int totalrooms = sc.nextInt();

            double occrate = (roomsocc * 100.0) / totalrooms;

            String status;

            if (occrate < 60) {
                status = "Low";
            }
            else if (occrate < 80) {
                status = "Moderate";
            }
            else if (occrate < 100) {
                status = "High";
            }
            else {
                status = "Full";
                fullcap++;
            }

            sumocc += occrate;

            if (occrate > highocc) {
                highocc = occrate;
                peakday = day;
            }

            System.out.println("Day: " + day);
            System.out.println("Rooms occupied: " + roomsocc);
            System.out.println("Total rooms: " + totalrooms);
            System.out.println("Occupancy rate: " + occrate);
            System.out.println("Status: " + status);
            System.out.println();
        }

        double avgocc = sumocc / n;

        System.out.println("Total days analyzed: " + n);
        System.out.println("Average occupancy rate: " + avgocc);
        System.out.println("Peak occupancy day: " + peakday);
        System.out.println("Days at full capacity: " + fullcap);

        sc.close();
    }
}