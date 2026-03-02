import java.util.*;
public class electricitybill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double price=0;
        String category="";
        int totalunits=0;
        double totalrevenue=0;
        for(int i=0;i<n;i++){
            String cusid=sc.next();
            int units=sc.nextInt();

            if(units>0 && units<=100){
                price=units*0.10;
            }
            else if(units>100 && units<=200){
                price=units*0.13;
            }
            else if(units>200 && units<=300){
                price=units*0.16;
            }
            else if(units>300){
                price=units*0.20;
            }
            if(units<=200){
                category="Low usage";
            }
            else if(units>200 && units<=300){
                category="Medium usage";
            }
            else if(units>300){
                category="High usage";
            }

            totalunits+=units;
            totalrevenue+=price;

            System.out.println("Consumer ID: "+cusid);
            System.out.println("Units consumed: "+units);
            System.out.println("Bill amount: $"+price);
            System.out.println("Category: "+category);
            System.out.println();
        }
        double avgbill=totalrevenue/n;
        System.out.println("Total consumers: "+n);
        System.out.println("Total units consumed: "+totalunits);
        System.out.println("Total revenue: $"+totalrevenue);
        System.out.printf("Average bill:"+String.format("$%.2f")+avgbill);
        sc.close();

    }
}
