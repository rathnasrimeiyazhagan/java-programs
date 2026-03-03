import java.util.*;

public class fitnesstracker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int calbur = 0;
        String intensity = "";
        int totaldur = 0;
        double totalcal = 0;
        double avgcal = 0;
        String level = "";

        for (int i = 0; i < n; i++) {

            String type = sc.next();
            int duration = sc.nextInt();

            if (type.equalsIgnoreCase("running")) {
                calbur = 10;
                intensity = "High";
            }
            else if (type.equalsIgnoreCase("swimming")) {
                calbur = 12;
                intensity = "High";
            }
            else if (type.equalsIgnoreCase("cycling")) {
                calbur = 8;
                intensity = "Moderate";
            }
            else if (type.equalsIgnoreCase("gym")) {
                calbur = 7;
                intensity = "Moderate";
            }
            else if (type.equalsIgnoreCase("walking")) {
                calbur = 4;
                intensity = "Low";
            }

            int calories = calbur * duration;

            totaldur += duration;
            totalcal += calories;

            System.out.println("Session " + (i + 1) + ": " + type);
            System.out.println("Duration: " + duration + " minutes");
            System.out.println("Calories Burned: " + calories);
            System.out.println("Intensity: " + intensity);
            System.out.println();
        }

        avgcal = totalcal / n;

        if (totalcal <= 300) {
            level = "Beginner";
        }
        else if (totalcal > 300 && totalcal < 1000) {
            level = "Intermediate";
        }
        else {
            level = "Advanced";
        }

        System.out.println("Total Workouts: " + n);
        System.out.println("Total Duration: " + totaldur + " minutes");
        System.out.println("Total Calories Burned: " + (int)totalcal);
        System.out.println("Average Calories per Session: " + avgcal);
        System.out.println("Fitness Level: " + level);

        sc.close();
    }
}