import java.util.Scanner;

public class ShippingFeeCalculator {
    public static double calculateBaseFee(double weight) {
        if (weight <= 5) {
            return 20000;
        } else if (weight <= 20) {
            return 50000;
        } else {
            return 100000;
        }
    }

    public static double calculateDistanceFee(double distance) {
        double fee = 0;
        if (distance <= 5) {
            fee += distance * 2000;
        } else if (distance <= 20) {
            fee += 5 * 2000;
            fee += (distance - 5) * 1500;
        } else {
            fee += 5 * 2000;
            fee += 15 * 1500;
            fee += (distance - 20) * 1000;
        }
        return fee;
    }

    public static double getDiscountRate(int customerType) {
        switch (customerType) {
            case 1: return 0.0;
            case 2: return 0.1;
            case 3: return 0.2;
            default: return 0.0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double distance = sc.nextDouble();
        int customerType = sc.nextInt();
        double baseFee = calculateBaseFee(weight);
        double distanceFee = calculateDistanceFee(distance);
        double discount = getDiscountRate(customerType);
        double totalFee = (baseFee + distanceFee) * (1 - discount);
        System.out.printf("%.0f\n", totalFee);
        sc.close();
    }
}
