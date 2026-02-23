import java.util.Scanner;
public class parkingfee {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String z=sc.nextLine();
        double h=sc.nextDouble();
        sc.nextLine();
        String v=sc.nextLine();
        String m=sc.nextLine();

        double br=5;
        double zp=0;
        double vs=0;
        double md=0;
        double rf=0;
        double ff=0;
        double dc=0;
        String dcA="No";
        String rc="";

        if(z.equalsIgnoreCase("Downtown")){
            zp=50;
            dc=150;
            rc="Premium";
        } else if(z.equalsIgnoreCase("Business-District")){
            zp=30;
            dc=120;
            rc="Premium";
        } else if(z.equalsIgnoreCase("Residential")){
            zp=0;
            dc=60;
            rc="Standard";
        } else if(z.equalsIgnoreCase("Airport")){
            zp=100;
            dc=180;
            rc="Luxury";
        }

        if(v.equalsIgnoreCase("Motorcycle")){vs=-2;}
        else if(v.equalsIgnoreCase("Compact")){vs=0;}
        else if(v.equalsIgnoreCase("Sedan")){vs=0;}
        else if(v.equalsIgnoreCase("SUV")){vs=3;}
        else if(v.equalsIgnoreCase("Oversized")){vs=5;}

        if(m.equalsIgnoreCase("None"))
            {md=0;}
        else if(m.equalsIgnoreCase("Monthly"))
            {
                md=20;}
        else if(m.equalsIgnoreCase("Annual")){
            md=25;}
        else if(m.equalsIgnoreCase("VIP")){
            md=30;}

        rf=(br*(1+zp/100)+vs)*h;
        ff=rf*(1-md/100);

        if(h>=24){
            if(ff>dc)
                {ff=dc; dcA="Yes";}
        }

        System.out.println("Location Zone: "+z);
        System.out.println("Parking Duration: "+h+" hours");
        System.out.println("Vehicle Type: "+v);
        System.out.println("Membership Status: "+m);
        System.out.println("Base Hourly Rate: $"+br);
        System.out.println("Zone Premium: "+(int)zp+"%");
        System.out.println("Vehicle Size Surcharge: $"+vs);
        System.out.println("Membership Discount: "+(int)md+"%");
        System.out.println("Total Parking Fee: $"+Math.round(ff*100.0)/100.0);
        System.out.println("Daily Cap Applied: "+dcA);
        System.out.println("Rate Category: "+rc);

        sc.close();
    }
}