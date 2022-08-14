package homework.task1.task5;

import homework.task1.task5.container.Container;
import homework.task1.task5.main.RandomGenerating;

public class Deck extends Container {

    public double weightCylinder;
    public double weightSquare;
    public double weightCone;

    public Deck(){

    }

    public Deck(int number, int height, int density, int diagonal, double weightCylinder, double weightSquare,
                double weightCone){
        super(number, height, density, density);
        this.weightCylinder = weightCylinder;
        this.weightSquare = weightSquare;
        this.weightCone = weightCone;



    }


    public double doWeightCone(){
        int number = 0;
        int height = 0;
        int density = 0;
        diagonal = 0;
        RandomGenerating randomGenerating = new RandomGenerating();
        Container container = new Container(number, height, density, diagonal);

        weightCone = (Math.PI * Math.pow((double) randomGenerating.generateDiagonal() / 2, 2) / 3)
                * randomGenerating.generateHeight() * randomGenerating.generateDensity();

        return weightCone;
    }

    public double doWeightSquare(){
        int number = 0;
        int height = 0;
        int density = 0;
        diagonal = 0;
        Container container = new Container(number, height, density, diagonal);
        RandomGenerating randomGenerating = new RandomGenerating();

        weightSquare = Math.pow(randomGenerating.generateHeight(), 3) * randomGenerating.generateDensity();
        return  weightSquare;
    }

    public double doWeightCylinder() {
        int number = 0;
        int height = 0;
        int density = 0;
        diagonal = 0;
        RandomGenerating randomGenerating = new RandomGenerating();
        Container container = new Container(number, height, density, diagonal);


        weightCylinder = Math.PI * Math.pow((double) randomGenerating.generateDiagonal() / 2, 2)
                * randomGenerating.generateHeight() * randomGenerating.generateDensity();
        return weightCylinder;
    }

    public double getWeightCylinder() {
        doWeightCylinder();
        return weightCylinder;
    }

    public void setWeightCylinder(double weightCylinder, int diagonal) {
        int number = 0;
        int height = 0;
        int density = 0;
        diagonal = 0;
        Container container = new Container(number, height, density, diagonal);
        container.setNumber(number);
        container.setHeight(height);
        container.setDensity(density);
        container.setDiagonal(diagonal);

        weightCylinder = Math.PI * Math.pow((double) container.getDiagonal() / 2, 2) * container.getHeight()
                * container.getDensity();
    }

    public double getWeightSquare() {
        doWeightSquare();
        return weightSquare;
    }

    public void setWeightSquare(double weightSquare, int diagonal){
        int number = 0;
        int height = 0;
        int density = 0;
        diagonal = 0;
        Container container = new Container(number, height, density, diagonal);
        container.setNumber(number);
        container.setHeight(height);
        container.setDensity(density);
        container.setDiagonal(diagonal);

        weightSquare = Math.pow(container.getHeight(), 3) * container.getDensity();
    }

    public double getWeightCone() {
        doWeightCone();
        return weightCone;
    }

   /* public void setWeightCone(double weightCone, int diagonal){
        int number = 0;
        int height = 0;
        int density = 0;
        diagonal = 0;
        Container container = new Container(number, height, density, diagonal);
        container.setNumber(number);
        container.setHeight(height);
        container.setDensity(density);
        container.setDiagonal(diagonal);

        weightCone = (Math.PI * Math.pow((double) container.getDiagonal() / 2, 2) / 3) * container.getHeight()
                * container.getDensity();
    }*/



}
