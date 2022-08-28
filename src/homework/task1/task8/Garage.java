package homework.task1.task8;

import homework.task1.task8.car.Car;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Garage {

    private Map<Car<String>, Integer> cars = new HashMap<>();

    public void driveInGarage(Car<String> car, int key){
        if (!cars.containsKey(car)) {
            cars.put(car, key);
        } else {
            cars.replace(car, cars.get(car) + key);
        }
        System.out.println("Приехал " + car);;
    }

    public void driveOutGarage(Car<String> car, int key){
        if(cars.containsKey(car)){
            cars.replace(car, cars.get(car) - key);
            System.out.println("Уехал " + car);
        }
        else {
            cars.replace(car, 0);
        }
    }

    public Integer countCarsInGarage(Car<String> car){
        return cars.get(car);
    }

    public Map<Car<String>, Integer> getCars() {
        return cars;
    }

    public void setCars(Map<Car<String>, Integer> car) {
        this.cars = car;
    }


}
