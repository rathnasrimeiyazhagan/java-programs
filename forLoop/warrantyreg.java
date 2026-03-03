import java.util.*;
public class warrantyreg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int warranty=0;
        String status="";
        int ex=0;
        int exsoon=0;
        int active=0;
        int remmonths=0;
        for(int i=0;i<n;i++){
            String productid=sc.next();
            String producttype=sc.next();
            int months=sc.nextInt();

            if(producttype.equalsIgnoreCase("electronics")){
                warranty=12;
            }
            else if(producttype.equalsIgnoreCase("appliance")){
                warranty=24;
            }
            else if(producttype.equalsIgnoreCase("computer")){
                warranty=36;
            }

            remmonths=warranty-months;
            if(remmonths==0){
                status="Expired";
                ex++;
            }
            else if(remmonths>=1&& remmonths<=3){
                status="Expiring soon";
                exsoon++;
            }
            else if(remmonths>3){
                status="Active";
                active++;
            }

            

            System.out.println("ProductID: "+productid);
            System.out.println("Type: "+producttype);
            System.out.println("Warranty period: "+warranty+" months");
            System.out.println("Months used: "+months);
            System.out.println("Remaining: "+remmonths+" months");
            System.out.println("Status: "+status);
            System.out.println();
    
        }
        System.out.println("Total products: "+n);
        System.out.println("Active warranties: "+active);
        System.out.println("Expiring soon: "+exsoon);
        System.out.println("Expired warranties: "+ex);
        sc.close();
    }
}
