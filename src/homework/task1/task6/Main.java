package homework.task1.task6;

import java.util.ArrayList;
import java.util.Random;


public class Main {

    public String generateFood(){
        Random rnd = new Random();
        int ch = rnd.nextInt(1,5);
        return switch (ch){
            case 1 -> "мясо";
            case 2 -> "растительность";
            case 3 -> "живность";
            case 4 -> "рыба";
            default -> "Сбой.";
        };
    }

    public String generateLocation(){
        Random rnd = new Random();
        int ch = rnd.nextInt(1,5);
        return switch (ch){
            case 1 -> "смешанный лес";
            case 2 -> "тайга";
            case 3 -> "степи";
            case 4 -> "тропики";
            default -> "Сбой.";
        };
    }

    public static void main(String[] args) {
        Main main = new Main();
        Veterinarian veterinarian = new Veterinarian();
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(0, new Cat(main.generateFood(), main.generateLocation(), 7, "гладкая"));
        animals.add(1, new Dog(main.generateFood(), main.generateLocation(), 3, "жесткая"));
        animals.add(2, new Horse(main.generateFood(), main.generateLocation(), 11, "прямая"));
        for (int i = 0; i < animals.size(); i++) {
            Veterinarian.treatAnimal(animals, i);
        }
    }


}
