package ch.tbz;

public class Main {

    public static void main(String[] args) {
        boolean testResult = test_calculate_price();
        if (testResult) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }
    }

    static double calculatePrice(double basePrice, double specialPrice, double extraPrice, int extras, double discount) {
        double addonDiscount;
        double result;

        if (extras >= 5) {
            addonDiscount = 15;
        } else if (extras >= 3) {
            addonDiscount = 10;
        } else {
            addonDiscount = 0;
        }

        if (discount > addonDiscount) {
            addonDiscount = discount;
        }

        result = basePrice / 100.0 * (100 - discount) + specialPrice
                + extraPrice / 100.0 * (100 - addonDiscount);

        return result;
    }

    static boolean test_calculate_price() {
        boolean testOk = true;

        double basePrice = 100.0;
        double specialPrice = 50.0;
        double extraPrice = 20.0;
        int extras = 4;
        double discount = 12.0;
        double expectedPrice = 155.6;
        double result = calculatePrice(basePrice, specialPrice, extraPrice, extras, discount);

        if (result != expectedPrice) {
            System.out.println("Preis stimmt nicht ueberein");
            testOk = false;
        }

        if (testOk) {
            System.out.println("Preis stimmt ueberein");
        }

        return testOk;
    }

}
