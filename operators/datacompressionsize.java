import java.util.Scanner;

public class datacompressionsize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fileSize = sc.nextInt();
        int compressionCycles = sc.nextInt();

        int size = fileSize >> compressionCycles;

        System.out.println("Compressed Size = " + size);

        sc.close();
    }
    
}
