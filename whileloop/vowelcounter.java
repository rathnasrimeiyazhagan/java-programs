import java.util.*;

public class vowelcounter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        int count=0;
        int i=0;
        do{
                char ch=text.charAt(i);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
                        count++;
            }
            i++;
        }
    while(i<text.length());
    System.out.println("Vowel count: "+count);
    sc.close();
}
}

