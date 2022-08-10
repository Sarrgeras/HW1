package homework.task1.task5.main;

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



}
