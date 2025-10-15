public class ShippingFeeCalculator {

    public static double calculateTotalFee(double weight, double distance, int customerType) {
        double baseFee;
        double distanceFee;
        double discountRate;
        double totalFee;

        if (weight <= 5) {
            baseFee = 20000;
        } else if (weight <= 20) {
            baseFee = 50000;
        } else {
            baseFee = 100000;
        }

        if (distance <= 5) {
            distanceFee = distance * 2000;
        } else if (distance <= 20) {
            distanceFee = 5 * 2000 + (distance - 5) * 1500;
        } else {
            distanceFee = 5 * 2000 + 15 * 1500 + (distance - 20) * 1000;
        }

        if (customerType == 1) {
            discountRate = 0.0;
        } else if (customerType == 2) {
            discountRate = 0.1;
        } else {
            discountRate = 0.2;
        }

        totalFee = (baseFee + distanceFee) * (1 - discountRate);
        return totalFee;
    }

    public static void main(String[] args) {
        double result = calculateTotalFee(10, 25, 2);
        System.out.printf("%.0f\n", result);
    }
}
