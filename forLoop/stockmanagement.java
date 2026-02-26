import java.util.*;
public class stockmanagement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int lowstockitems=0;
        int criticalitems=0;
        int total=0;
        for(int i=0;i<n;i++){
            String product=sc.next();
            int currentstock=sc.nextInt();
            int minstock=sc.nextInt();

            String status="";
            if(currentstock>=minstock){
                status="Adequate";
            }
            else if(currentstock<minstock&&currentstock>=minstock/2){
                status="Low stock";
                lowstockitems++;
            }
            else if(currentstock<minstock/2){
                status="Critical";
                criticalitems++;
            }
           double quantity=0;
            if(status.equals("Adequate")){
                quantity=0;
            }
            else if(status.equals("Low stock")){
                quantity=(int)(minstock-currentstock)+minstock/2;
            }
            else if(status.equals("Critical")){
                quantity=(int)(minstock-currentstock)+minstock*1.5;
            }

            total+=quantity;
            System.out.println("Product: "+product);
            System.out.println("Current stock: "+currentstock);
            System.out.println("Minimum stock: "+minstock);
            System.out.println("Status: "+status);
            System.out.println("Reorder quantity: "+(int)quantity);
            System.out.println();

        }
        System.out.println("Total products: "+n);
        System.out.println("Low stock items: "+lowstockitems);
        System.out.println("Critical items: "+criticalitems);
        System.out.println("Total reorder quantity: "+total);

        sc.close();
    }
}
