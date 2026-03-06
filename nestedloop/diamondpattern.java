import java.util.Scanner;
public class diamondpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int middle=n/2+1;
        if(n>=3&&n<=15){
            for(int i=1;i<=middle;i++){
                for(int j=1;j<=(2*i-1);j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=middle-1;i>=1;i--){
                for(int j=1;j<=(2*i-1);j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
