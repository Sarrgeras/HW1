package homework.task1.task5.main;

import homework.task1.task5.container.Container;

import java.util.Random;

public class RandomGenerating {

    public int generateDensity(){
        Random rnd = new Random();
        Constants constants = new Constants();

        return rnd.nextInt(constants.SMALL_DENSITY_WATER, constants.BIG_DENSITY_WATER);
    }

    public int generateHeight(){
        Random rnd = new Random();
        Constants constants = new Constants();

        return rnd.nextInt(constants.MIN_HEIGHT, constants.MAX_HEIGHT);
    }

    public int generateNumber(){
        Random rnd = new Random();
        Constants constants = new Constants();

        return rnd.nextInt(0, 1000);
    }

    public int generateDiagonal(){
        Constants constants = new Constants();
        Random rnd = new Random();
        int rndNumber = rnd.nextInt(1,3);
        return switch (rndNumber){
            case 1 -> constants.SMALL_DIAGONAL;
            case 2 -> constants.BIG_DIAGONAL;
            default -> 0;
        };
    }

    public int generateShape(){

        Random rnd = new Random();
        int rndNumber = rnd.nextInt(1,4);
        return switch (rndNumber){
            case 1 -> 1;
            case 2 -> 2;
            case 3 -> 3;
            default -> 0;
        };
    }

    public int generateShip(){
        Random rnd = new Random();
        int rndNumber = rnd.nextInt(1,3);
        return switch (rndNumber){
            case 1 -> 1;
            case 2 -> 2;
            default -> 0;
        };
    }

}
