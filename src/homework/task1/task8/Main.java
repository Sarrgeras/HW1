package homework.task1.task8;

import homework.task1.task8.car.*;

public class Main {

    public static void main(String[] args) {
        Car<String> mercedes = new Mercedes<String>("Купе", "gdfg", "2012",
                "3", "кабриолет", "Karl Benz" );
        Car<String> mitsubishi = new Mitsubishi<String>("седан", "evo6", "2019",
                "5", "литая", "Yatoro Ivasaki" );
        Car<String> nissan = new Nissan<>("Джип", "patrol", "2007",
                "5", "литая", "Yoshisuke Aikawa" );
        Car<String> volkswagen = new Volkswagen<>("Хэтчбек", "golf", "2017",
                "5", "литая", "Ferdinand Porshe" );

        Garage garage = new Garage();
        garage.driveInGarage(mercedes, 1);
        garage.driveInGarage(mercedes, 1);
        garage.driveInGarage(mitsubishi, 2);
        garage.driveInGarage(nissan, 3);
        garage.driveInGarage(volkswagen, 4);
        garage.driveOutGarage(mitsubishi, 1);
        System.out.println(garage.countCarsInGarage(mercedes) + " автомобиля " + mercedes);

    }

}
