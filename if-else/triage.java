import java.util.Scanner;

public class triage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hr = sc.nextInt();          
        String bp = sc.next();          
        double temp = sc.nextDouble();  
        sc.nextLine();
        String sym = sc.nextLine();     

        String[] parts = bp.split("/");
        int sys = Integer.parseInt(parts[0]);
        int dia = Integer.parseInt(parts[1]);

        String priority = "";
        String action = "";
        int wait = 0;

    
        if (hr < 50 || hr > 130 ||
            sys > 180 || sys < 90 ||
            temp > 103 || temp < 96 ||
            sym.equalsIgnoreCase("Life-Threatening")) {

            priority = "Critical";
            wait = 0;
            action = "Immediate Medical Attention";

        } 

        else if ((hr >= 50 && hr <= 60) || (hr >= 110 && hr <= 130) ||
                 (sys >= 160 && sys <= 180) || (sys >= 90 && sys <= 100) ||
                 (temp >= 101 && temp <= 103) || (temp >= 96 && temp <= 97) ||
                 sym.equalsIgnoreCase("Severe") ||
                 sym.equalsIgnoreCase("Moderate")) {

            priority = "Urgent";
            wait = 20;
            action = "Priority Medical Attention";

        } 

        else if (sym.equalsIgnoreCase("Moderate")) {
            priority = "Standard";
            wait = 45;
            action = "Standard Medical Checkup";
        } 
        
        else {
            priority = "Non-Urgent";
            wait = 90;
            action = "Routine Checkup";
        }

        System.out.println("Heart Rate: " + hr + " bpm");
        System.out.println("Blood Pressure: " + bp);
        System.out.println("Temperature: " + temp + "°F");
        System.out.println("Symptom Severity: " + sym);
        System.out.println("Triage Priority: " + priority);
        System.out.println("Estimated Wait Time: " + wait + " minutes");
        System.out.println("Recommended Action: " + action);
    }
}
