import java.util.*;
public class renewaltracker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int renfees=0;
        int discounts=0;
        String priority="";
        double finalfee=0;
        int count=0;
        double totrev=0;
        double avg=0;
        for(int i=0;i<n;i++){
            String name=sc.next();
            String memtype=sc.next();
            int daysuntilexpiry=sc.nextInt();

            if(memtype.equalsIgnoreCase("basic")){
                renfees=50;
            }
            else if(memtype.equalsIgnoreCase("premium")){
                renfees=100;
            }
            else if(memtype.equalsIgnoreCase("vip")){
                renfees=200;
            }
            if(daysuntilexpiry>=45){
                discounts=20;
            }
            else if(daysuntilexpiry>30 &&daysuntilexpiry<=44){
                discounts=15;
            }
            else if(daysuntilexpiry>=15 && daysuntilexpiry<=29){
                discounts=10;
            }
            else if(daysuntilexpiry<15){
                discounts=0;
            }
            if(daysuntilexpiry<=10){
                priority="Urgent";
            }
            else if(daysuntilexpiry>10 &&daysuntilexpiry<=30){
                priority="High";
            }
            else if(daysuntilexpiry>30){
                priority="Normal";
            }
            finalfee=renfees*(1-discounts/100.0);
            if(daysuntilexpiry<10){
                count++;
            }
            totrev+=finalfee;
            System.out.println("Member: "+name);
            System.out.println("Membership: "+memtype);
            System.out.println("Days until expiry: "+daysuntilexpiry);
            System.out.println("Renewal fee: "+renfees);
            System.out.println("Discount: "+discounts);
            System.out.println("Final fee: "+finalfee);
            System.out.println("Priority: "+priority);
            System.out.println("");
        
    }
    avg=totrev/n;
    System.out.println("Total members: "+n);
    System.out.println("Urgent renewals: "+count);
    System.out.println("Total renewal revenue: "+totrev);
    System.out.println("Average renewal fee: "+String.format("$%.2f",avg));
        sc.close();

}
}
