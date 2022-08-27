package homework.task1.task6;

import homework.task1.task5.main.RandomGenerating;

import java.util.Random;

public class Animal {
    private String food;
    private String location;

    public Animal(){

    }

    public Animal(String food, String location){
        this.food = food;
        this.location = location;
    }

    public void makeNoise(){
        System.out.println("Животное издает шум!");
    }
    public void sleep(){
        System.out.println("Животное спит!");
    }
    public void eat(){
        System.out.println("Животное ест!");
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
