import java.util.Scanner;

public class foodOrdering {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String ot = sc.nextLine();     
        String ls = sc.nextLine();     
        double ov = sc.nextDouble();  
        sc.nextLine();                 
        String ts = sc.nextLine();     

        int bd = 0;    
        int adj = 0;   
        double sf = 0; 
        String kp = ""; 
        int pt = 0;

    
        if (ls.equalsIgnoreCase("Gold")) {
            bd = 15;
        } 
        else if (ls.equalsIgnoreCase("Silver")) {
            bd = 10;
        } 
        else if (ls.equalsIgnoreCase("Bronze")) {
            bd = 5;
        } 
        else {
            bd = 0;
        }

        
        if (ts.equalsIgnoreCase("Late-Night")) {
            adj = 5;
        } 
        else {
            adj = 0;
        }

        int td = bd + adj;  
        if (ot.equalsIgnoreCase("Delivery")) {
            sf = ov * 0.10;
        } 
        else if (ot.equalsIgnoreCase("Takeout")) {
            sf = ov * 0.03;
        } 
        else {
            sf = 0;
        }

        double dv = ov * (1 - td / 100.0);
        double fa = dv + sf;

        if (ts.equalsIgnoreCase("Peak") && ot.equalsIgnoreCase("Delivery")) {
            kp = "High";
        } 
        else if (ts.equalsIgnoreCase("Regular")) {
            kp = "Medium";
        } 
        else {
            kp = "Low";
        }

        
        if (ot.equalsIgnoreCase("Delivery")) {
            if (kp.equals("High")) {
                pt = 30;
            } else if (kp.equals("Medium")) {
                pt = 35;
            } else {
                pt = 40;
            }
        }
        else if (ot.equalsIgnoreCase("Dine-In")) {
            if (kp.equals("High")) {
                pt = 20;
            } else if (kp.equals("Medium")) {
                pt = 25;
            } else {
                pt = 30;
            }
        }
        else { 
            if (kp.equals("High")) {
                pt = 15;
            } else if (kp.equals("Medium")) {
                pt = 20;
            } else {
                pt = 25;
            }
        }


        System.out.println("Order Type: " + ot);
        System.out.println("Loyalty Status: " + ls);
        System.out.println("Order Value: $" + ov);
        System.out.println("Time Slot: " + ts);
        System.out.println("Base Discount: " + bd + "%");
        System.out.println("Time-Based Adjustment: " + adj + "%");
        System.out.println("Service Fee: $" + sf);
        System.out.println("Final Amount: $" + fa);
        System.out.println("Kitchen Priority: " + kp);
        System.out.println("Estimated Prep Time: " + pt + " minutes");

        sc.close();
    }
}