import java.util.Arrays;

public class Weather {
    public static void main(String[] args) {

        // The instructions for this workbook are on Learn the Part (Workbook 6.11)
        double[] celsius = { 12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0 };
        double[] fahrenheit = celsiusToFarenhit(celsius);

        printTemperatures(celsius, "Celsius");
        printTemperatures(fahrenheit, "Farenheit");

    }

    public static double[] celsiusToFarenhit(double[] celsius) {
        double[] fahrenheit = new double[celsius.length];

        for (int i = 0; i < celsius.length; i++) {
            fahrenheit[i] = (celsius[i] / 5 * 9) + 32;
        }

        return fahrenheit;
    }

    public static void printTemperatures(double[] temps, String type) {
        System.out.print(type + ": ");
        for (int i = 0; i < temps.length; i++) {
            System.out.print(temps[i] + " ");
        }
        System.out.println("");
    }

}
