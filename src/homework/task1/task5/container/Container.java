package homework.task1.task5.container;

import homework.task1.task5.Deck;
import homework.task1.task5.Port;
import homework.task1.task5.main.RandomGenerating;

public class Container extends Port {
    public int number;
    public int height;
    public int density;
    public int diagonal;



    public Container(){

    }

    public Container(int number, int height, int density, int diagonal){
        this.number = number;
        this.height = height;
        this.density = density;
        this.diagonal = diagonal;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        RandomGenerating randomGenerating = new RandomGenerating();
        number = randomGenerating.generateNumber();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        RandomGenerating randomGenerating = new RandomGenerating();
        height = randomGenerating.generateHeight();
    }

    public int getDensity() {
        return density;
    }

    public void setDensity(int density) {
        RandomGenerating randomGenerating = new RandomGenerating();
        density = randomGenerating.generateDensity();
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        RandomGenerating randomGenerating = new RandomGenerating();
        diagonal = randomGenerating.generateDiagonal();
    }



}
