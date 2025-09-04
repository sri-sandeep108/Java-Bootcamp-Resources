import java.util.Scanner;

import model.*;
import model.Car.BodyType;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String make = promptForMake(scanner);
        String model = promptForModel(scanner);
        BodyType bodyType = promptForBodyType(scanner);
        int year = promptForYear(scanner);
        double price = promptForPrice(scanner);

        Car newCar = new Car(make, model, bodyType, year, price);

        CarDealership dealership = new CarDealership();
        dealership.addCar(newCar);

        System.out.println("Car added to the dealership: " + newCar.getMake() + " " + newCar.getModel());
        scanner.close();
    }

    public static boolean isNullorBlank(String input) {
        return input == null || input.isBlank();
    }

    public static boolean invalidYear(int year) {
        return year < Car.MIN_YEAR;
    }

    public static boolean invalidPrice(double price) {
        return price < Car.MIN_PRICE || price > Car.MAX_PRICE;
    }

    public static boolean invalidBodyType(String bodyType) {
        bodyType = bodyType.toUpperCase();
        try {
            Car.BodyType.valueOf(bodyType);
        } catch (IllegalArgumentException e) {
            return true;
        }
        return false;
    }

    public static BodyType promptForBodyType(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid car body type: ");
            String bodyType = scanner.nextLine();
            if (invalidBodyType(bodyType))
                continue;
            return Car.BodyType.valueOf(bodyType.toUpperCase());
        }
    }

    public static String promptForMake(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid car make: ");
            String make = scanner.nextLine();
            if (isNullorBlank(make))
                continue;
            return make;
        }
    }

    public static String promptForModel(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid car model: ");
            String model = scanner.nextLine();
            if (isNullorBlank(model))
                continue;
            return model;
        }
    }

    public static int promptForYear(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid production year: ");
            if (!scanner.hasNextInt()) {
                scanner.next();
                continue;
            }
            int year = scanner.nextInt();
            if (invalidYear(year))
                continue;
            return year;

        }
    }

    public static double promptForPrice(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid car price: ");
            if (!scanner.hasNextDouble()) {
                scanner.next();
                continue;
            }
            double price = scanner.nextInt();
            if (invalidPrice(price))
                continue;
            return price;
        }
    }
}
