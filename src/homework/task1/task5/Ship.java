package homework.task1.task5;

import homework.task1.task5.main.Constants;
import homework.task1.task5.main.RandomGenerating;

import java.util.Arrays;

public class Ship extends Deck {
    public String[] nameArray = {"Avrora","Admiral","Titan","Bless","Bismark","Angelika","Angel","Vyaryag",
            "Nevski","Elena"};

    public double[] weightShip = new double[10];
    Ship[] ships = new Ship[10];

    public Ship(){

    }

    public Ship(int number, int height, int density, int diagonal, double weightCylinder, double weightSquare,
                double weightCone, double[] weightShip){
        super(number,height,density,diagonal, weightCylinder, weightSquare, weightCone);


        this.weightShip = weightShip;

    }

    public void menu(){
        super.menu();
    }

    public void add(){
        double weight = 0;

        RandomGenerating randomGenerating = new RandomGenerating();
        Constants constants = new Constants();

        for (int i = 0; i < ships.length; i++) {



            if (randomGenerating.generateShip() == 1){
                for (int j = 0; j < 4;) {
                    if (randomGenerating.generateShape() == 1){
                        setNumber(number);
                        number = randomGenerating.generateNumber();

                        diagonal = randomGenerating.generateDiagonal();
                        weightCylinder = getWeightCylinder();
                        if (diagonal == constants.SMALL_DIAGONAL){
                            j++;
                        }
                        else {
                            j = j + 2;
                        }
                        weight += weightCylinder;
                        
                    } else if (randomGenerating.generateShape() == 2) {


                        diagonal = getDiagonal();
                        weightSquare = getWeightSquare();
                        if (diagonal == constants.SMALL_DIAGONAL){
                            j++;
                        }
                        else {
                            j = j + 2;
                        }
                        weight += weightSquare;

                    }
                    else {


                        diagonal = getDiagonal();
                        weightCone = getWeightCone();
                        if (diagonal == constants.SMALL_DIAGONAL){
                            j++;
                        }
                        else {
                            j = j + 2;
                        }
                        weight += weightCone;


                    }
                }
            }
            else {
                for (int j = 0; j < 4;) {
                    if (randomGenerating.generateShape() == 1){


                        diagonal = getDiagonal();
                        weightCylinder = getWeightCylinder();
                        if (diagonal == constants.SMALL_DIAGONAL){
                            j++;
                        }
                        else {
                            j = j + 2;
                        }
                        weight += weightCylinder;

                    } else if (randomGenerating.generateShape() == 2) {


                        diagonal = randomGenerating.generateDiagonal();
                        weightSquare = getWeightSquare();
                        if (diagonal == constants.SMALL_DIAGONAL){
                            j++;
                        }
                        else {
                            j = j + 2;
                        }
                        weight += weightSquare;

                    }
                    else {


                        diagonal = randomGenerating.generateDiagonal();
                        weightCone = getWeightCone();
                        if (diagonal == constants.SMALL_DIAGONAL){
                            j++;
                        }
                        else {
                            j = j + 2;
                        }
                        weight += weightCone;


                    }
                }
            }
            weightShip[i] = weight;
            weight = 0;
        }
        
    }

    public void outWeight(){
        for (int i = 0; i < weightShip.length; i++) {
            System.out.println(i + 1 + "корабль - " + weightShip[i]);
        }
        menu();
    }

    public double[] getWeightShip() {
        return weightShip;
    }
    public void out() {

        System.out.println(toString());
        menu();
    }

    @Override
    public String toString() {
        return "Ship{" +
                "nameArray=" + Arrays.toString(nameArray) +
                ", weightShip=" + Arrays.toString(weightShip) +
                '}';
    }
}
