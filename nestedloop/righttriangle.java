import java.util.Scanner;
public class righttriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ch=sc.next();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(ch.equalsIgnoreCase("number")){
                    System.out.print(j);
                }
                else if(ch.equalsIgnoreCase("star")){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
