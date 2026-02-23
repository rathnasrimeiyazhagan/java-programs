import java.util.Scanner;
public class fooddelivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dist = sc.nextDouble(); sc.nextLine();
        double order = sc.nextDouble(); sc.nextLine();
        String slot = sc.nextLine();
        String weather = sc.nextLine();

        double base = 3.0;
        double distt = dist * 1.0; 
        double peak = 0;
        double weatherr = 0;
        double discount = 0;
        double finalfee = 0;
        int esttime = 0;
        String priority = "";

        
        if(slot.equalsIgnoreCase("Breakfast")){
            peak = 0;
        } else if(slot.equalsIgnoreCase("Lunch")){
            peak = 2.5;
        } else if(slot.equalsIgnoreCase("Dinner")){
            peak = 2.0;
        } else if(slot.equalsIgnoreCase("Late-Night")){
            peak = 1.5;
        } else{
            peak = 0;
        }

     
        if(weather.equalsIgnoreCase("Clear")){
            weatherr = 0;
        } else if(weather.equalsIgnoreCase("Rain")){
            weatherr = 2.0;
        } else if(weather.equalsIgnoreCase("Snow")){
            weatherr = 3.0;
        } else if(weather.equalsIgnoreCase("Storm")){
            weatherr = 5.0;
        } else{
            weatherr = 0;
        }

        if(order >= 30 && order <= 49.99){
            discount = 1.0;
        } else if(order >= 50 && order <= 74.99){
            discount = 3.0;
        } else if(order >= 75){
            discount = 5.0;
        } else{
            discount = 0;
        }

        
        finalfee = base + distt + peak + weatherr - discount;
        if(finalfee < 2.99){
            finalfee = 2.99;
        } else{
            finalfee = finalfee;
        }

        
        esttime = (int)(dist * 8);
        if(slot.equalsIgnoreCase("Lunch") || slot.equalsIgnoreCase("Dinner")){
            esttime = esttime + 10;
        } else{
            esttime = esttime;
        }
        if(weather.equalsIgnoreCase("Rain")){
            esttime = esttime + 5;
        } else if(weather.equalsIgnoreCase("Snow")){
            esttime = esttime + 10;
        } else if(weather.equalsIgnoreCase("Storm")){
            esttime = esttime + 15;
        } else{
            esttime = esttime;
        }

 
        if(order > 60){
            priority = "Express";
        } else if(slot.equalsIgnoreCase("Dinner") || slot.equalsIgnoreCase("Lunch")){
            priority = "High";
        } else{
            priority = "Standard";
        }

        System.out.println("Delivery Distance: " + dist + " miles");
        System.out.println("Order Value: $" + order);
        System.out.println("Time Slot: " + slot);
        System.out.println("Weather Condition: " + weather);
        System.out.println("Base Delivery Fee: $" + base);
        System.out.println("Distance Surcharge: $" + distt);
        System.out.println("Peak Time Surcharge: $" + peak);
        System.out.println("Weather Surcharge: $" + weatherr);
        System.out.println("Order Value Discount: $" + discount);
        System.out.println("Final Delivery Fee: $" + finalfee);
        System.out.println("Estimated Delivery Time: " + esttime + " minutes");
        System.out.println("Service Priority: " + priority);

        sc.close();
    }
}