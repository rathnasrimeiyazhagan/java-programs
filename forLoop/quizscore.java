import java.util.*;
public class quizscore {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int score=0;
        String status="";
        int pass=0;
        int fail=0;
        int totalscore=0;
        double classavg=0;
        int highestscore=0;
        for(int i=0;i<n;i++){
            String name=sc.next();
            int correctans=sc.nextInt();
            int wrongans=sc.nextInt();
            int unattempted=sc.nextInt();

            score=(correctans*4)-(wrongans*3)+(unattempted*0);
            if(score>=32){
                status="Pass";
                pass++;
            }
            else{
                status="Fail";
                fail++;
            }
            totalscore+=score;
           
            System.out.println("Student: "+name);
            System.out.println("Correct: "+correctans);
            System.out.println("Wrong: "+wrongans);
            System.out.println("Unattempted: "+unattempted);
            System.out.println("Score: "+score);
            System.out.println("Result: "+status);

            if(totalscore>highestscore){
                highestscore=totalscore;
            }
        }
        classavg=totalscore/n;
        System.out.println("Total students: "+totalscore);
        System.out.println("Pass count: "+pass);
        System.out.println("Fail count: "+fail);
        System.out.println("Class average: "+classavg);
        System.out.println("Highest score: "+highestscore);
        sc.close();
    }
}
