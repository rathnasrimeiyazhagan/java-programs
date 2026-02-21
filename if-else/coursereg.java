import java.util.Scanner;
public class coursereg {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    String studentstatus=sc.nextLine();
    int credithrs=sc.nextInt();
    sc.nextLine();
    String programtype=sc.nextLine();
    String residency=sc.nextLine();

    int basetuition=0;
    if(programtype.equalsIgnoreCase("undergraduate")){
        basetuition=350;
    }
    else if(programtype.equalsIgnoreCase("graduate")){
        basetuition=550;
    }
    else if(programtype.equalsIgnoreCase("professional")){
        basetuition=800;
    }

    double resmul=0;
    if(residency.equalsIgnoreCase("in-state")){
        resmul=1.0;
    }
    else if(residency.equalsIgnoreCase("out-of-state")){
        resmul=2.5;
    }
    else if(residency.equalsIgnoreCase("international")){
        resmul=3.0;
    }

    int programfee=0;
    if(studentstatus.equalsIgnoreCase("full-time")){
        if(programtype.equalsIgnoreCase("undergraduate")){
            programfee=500;
        }
        else if(programtype.equalsIgnoreCase("graduate")){
            programfee=750;
        }
        else if(programtype.equalsIgnoreCase("professional")){
            programfee=1200;
        }
    }
    else if(studentstatus.equalsIgnoreCase("part-time")){
        if(programtype.equalsIgnoreCase("undergraduate")){
            programfee=300;
        }
        else if(programtype.equalsIgnoreCase("graduate")){
            programfee=750;
        }
        else if(programtype.equalsIgnoreCase("professional")){
            programfee=900;
        }
    }
    else if(studentstatus.equalsIgnoreCase("continuing-education")){
        if(programtype.equalsIgnoreCase("undergraduate")){
            programfee=150;
        }
        else if(programtype.equalsIgnoreCase("graduate")){
            programfee=150;
        }
        else if(programtype.equalsIgnoreCase("professional")){
            programfee=150;
        }
    }
    int activityfee=0;
    if(studentstatus.equalsIgnoreCase("full-time")){
        activityfee=200;
    }
    else if(studentstatus.equalsIgnoreCase("part-time")){
        activityfee=100;
    }
    else if(studentstatus.equalsIgnoreCase("continuing-education")){
        activityfee=50;
    }
    double tc=credithrs*basetuition*resmul;
    double totalfee=tc+programfee+activityfee;
    
    String category="";
    if(studentstatus.equalsIgnoreCase("full-time")&&residency.equalsIgnoreCase("in-state")){
        category="Standard";
    }
    else if(residency.equalsIgnoreCase("out-of-state")||residency.equalsIgnoreCase("international")){
        category="Premium";
    }
    else if(residency.equalsIgnoreCase("continuing-education")){
        category="Reduced";
    }
    System.out.println("Student status: "+studentstatus);
    System.out.println("Credit hours: "+credithrs);
    System.out.println("Program type: "+programtype);
    System.out.println("Residency: "+residency);
    System.out.println("Base Tuition per credit: $"+basetuition);
    System.out.println("Residency Multiplier: "+resmul+"x");
    System.out.println("Program fee: $"+programfee);
    System.out.println("Student activity fee: $"+activityfee);
    System.out.println("Total registration fee: $"+totalfee);
    System.out.println("Fee category: "+category);


    sc.close();

}
}
