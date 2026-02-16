import java.util.Scanner;

public class fuelcost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double distance = sc.nextDouble();
        double mileage = sc.nextDouble();
        double fuelprice = sc.nextDouble();
        double tollcharge = sc.nextDouble();

        double fuelneeded = distance / mileage;
        double fuelcost = fuelneeded * fuelprice;
        double totaltripcost = fuelcost + tollcharge;

        System.out.println(totaltripcost);
        sc.close();

    }
}
