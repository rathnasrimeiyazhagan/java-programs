import java.util.Scanner;
public class ecommercediscount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String loyalty=sc.nextLine().toLowerCase();
        double cartvalue=sc.nextDouble();
        sc.nextLine();
        String productcategory=sc.nextLine().toLowerCase();
        String membership=sc.nextLine().toLowerCase();

        int bd=0;
        int ad=0;

        if(loyalty.equals("bronze")){
            bd=5;
        }
        else if(loyalty.equals("silver")){
            bd=8;
        }
        else if(loyalty.equals("gold")){
            bd=12;
        }
        else if(loyalty.equals("platinum")){
            bd=15;
        }

        if(cartvalue>=500 && cartvalue<=999){
            ad=3;
        }
        else if(cartvalue>=1000 && cartvalue<=1999){
            ad=5;
        }
        else if(cartvalue>=2000){
            ad=7;
        }

        if(productcategory.equals("electronics")){
            if(membership.equals("prime")){
                ad = ad + 5;
            }
        }
        else if(productcategory.equals("fashion")){
            ad = ad + 3;
        }
        else if(productcategory.equals("books")){
            if(membership.equals("prime")){
                ad = ad + 5;
            }
        }
        else if(productcategory.equals("groceries")){
            if(cartvalue>300){
                ad = ad + 2;
            }
        }
        int totaldisconut=bd+ad;
        double finalprice=cartvalue*(1-totaldisconut/100);
        double savings=cartvalue-finalprice;

        System.out.println("Loyalty Tier: " + loyalty);
        System.out.println("Cart Value: $" + cartvalue);
        System.out.println("Product Category: " + productcategory);
        System.out.println("Membership: " + membership);
        System.out.println("Base Discount: " + bd + "%");
        System.out.println("Additional Discount: " + ad + "%");
        System.out.println("Total Discount: " + totaldisconut + "%");
        System.out.println("Final Price: $" + finalprice);
        System.out.println("Savings: $" + savings);


        sc.close();

    }

}
