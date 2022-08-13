package homework.task1.task5;

import homework.task1.task5.main.Constants;
import homework.task1.task5.main.RandomGenerating;

public class Ship extends Deck {
    public String[] nameArray = {"Avrora","Admiral","Titan","Bless","Bismark","Angelika","Angel","Vyaryag",
            "Nevski","Elena"};
    public String name;

    Ship[] ships = new Ship[10];

    public Ship(){

    }

    public Ship(int number, int height, int density, int diagonal, double weightCylinder, double weightSquare,
                double weightCone, String name){
        super(number,height,density,diagonal, weightCylinder, weightSquare, weightCone);

        this.name = name;

    }

    public void add(){
        double weight = 0;

        RandomGenerating randomGenerating = new RandomGenerating();
        Constants constants = new Constants();

        for (int i = 0; i < ships.length; i++) {

            name = nameArray[i];

            if (randomGenerating.generateShip() == 1){
                for (int j = 0; j < 4;) {
                    if (randomGenerating.generateShape() == 1){
                        setNumber(number);
                        number = randomGenerating.generateNumber();
                        setWeightCylinder(weightCylinder, diagonal);
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

                        setWeightSquare(weightSquare, diagonal);
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

                        setWeightCone(weightCone, diagonal);
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

                        setWeightCylinder(weightCylinder, diagonal);
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

                        setWeightSquare(weightSquare, diagonal);
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

                        setWeightCone(weightCone, diagonal);
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
            weight = 0;
        }
        
        
        
        
    }

    public void out(){
        for (Ship ship : ships) {
            System.out.println(ship);
        }
    }
}
