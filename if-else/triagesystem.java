import java.util.Scanner;

public class triagesystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int heartRate = sc.nextInt();
        sc.nextLine();
        String bp = sc.nextLine();
        double temperature = sc.nextDouble();
        sc.nextLine();
        String severity = sc.nextLine();

        String[] parts = bp.split("/");
        int systolic = Integer.parseInt(parts[0]);
        int diastolic = Integer.parseInt(parts[1]);

        String priority;
        int waitTime;
        String action;

        if (heartRate < 50 || heartRate > 130 ||
            systolic > 180 || systolic < 90 ||
            temperature > 103 || temperature < 96 ||
            severity.equalsIgnoreCase("Life-Threatening")) {

            priority = "Critical";
            waitTime = 0;
            action = "Immediate Emergency Care";
        }
        else if ((heartRate >= 50 && heartRate <= 60) ||
                 (heartRate >= 110 && heartRate <= 130) ||
                 (systolic >= 160 && systolic <= 180) ||
                 (systolic >= 90 && systolic <= 100) ||
                 (temperature >= 101 && temperature <= 103) ||
                 (temperature >= 96 && temperature <= 97) ||
                 severity.equalsIgnoreCase("Severe")) {

            priority = "Urgent";
            waitTime = 20;
            action = "Priority Medical Attention";
        }
        else if (severity.equalsIgnoreCase("Moderate")) {

            priority = "Standard";
            waitTime = 45;
            action = "Medical Evaluation Required";
        }
        else {

            priority = "Non-Urgent";
            waitTime = 90;
            action = "Routine Checkup";
        }

        System.out.println("Heart Rate: " + heartRate + " bpm");
        System.out.println("Blood Pressure: " + bp);
        System.out.println("Temperature: " + temperature + "°F");
        System.out.println("Symptom Severity: " + severity);
        System.out.println("Triage Priority: " + priority);
        System.out.println("Estimated Wait Time: " + waitTime + " minutes");
        System.out.println("Recommended Action: " + action);

        sc.close();
    }
}