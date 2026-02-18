import java.util.Scanner;
public class insurancecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age=sc.nextInt();
        sc.nextLine();
        String status=sc.nextLine().toLowerCase();
        String conditions=sc.nextLine().toLowerCase();
        String tier=sc.nextLine().toLowerCase();

        double bp=0;
        double rs=0;

        if(tier.equals("basic")){
            if(age>=18 && age<=30){
                bp=200;
            }
            else if(age>=31 && age<=50){
                bp=250;
            }
            else if(age>=51 && age<=65){
                bp=350;
            }
            else if(age>=66){
                bp=400;
            } 
        }
        else if(tier.equals("standard")){
            if(age>=18 && age<=30){
                bp=300;
            }
            else if(age>=31 && age<=50){
                bp=350;
            }
            else if(age>=51 && age<=65){
                bp=450;
            }
            else if(age>=66){
                bp=550;
            } 
        }
        else if(tier.equals("premium")){
            if(age>=18 && age<=30){
                bp=500;
            }
            else if(age>=31 && age<=50){
                bp=600;
            }
            else if(age>=51 && age<=65){
                bp=700;
            }
            else if(age>=66){
                bp=800;
            } 
        }

        if(status.equals("smoker")){
            rs=bp*0.40;
        }
        else if(conditions.equals("yes")){
            rs=bp*0.30;
        }
        else if(conditions.equals("smoker")&&status.equals("yes")){
            rs=bp*0.70;
        }
        double total=bp+rs;

        System.out.println("Age :"+age);
        System.out.println("Smoking status: "+status);
        System.out.println("pre-existing conditions: "+conditions);
        System.out.println("coverage tier: "+tier);
        System.out.println("base premium : "+bp);
        System.out.println("risk surcharge: "+rs);
        System.out.println("total monthly premium: "+total);



 sc.close();   
}
}
