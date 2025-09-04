package model;

import java.util.ArrayList;

public class CarDealership {
    private ArrayList<Car> carDealership;

    public CarDealership() {
        carDealership = new ArrayList<>();
    }

    public Car getCar(int index) {
        return new Car(carDealership.get(index));
    }

    public void setCar(Car car, int index) {
        carDealership.set(index, new Car(car));
    }

    public void addCar(Car car) {
        carDealership.add(new Car(car));
    }

}