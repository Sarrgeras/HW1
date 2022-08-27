package homework.task1.task6;

public class Cat extends Animal {

    public int age;

    public String wool;

    public Cat(){

    }

    public Cat(String food, String location, int age, String wool){
        super(food, location);
        this.age = age;
        this.wool = wool;
    }

    @Override
    public void makeNoise() {
        System.out.println("Кот издает шум!");
    }

    @Override
    public void sleep() {
        System.out.println("Кот ест!");
    }

    @Override
    public void eat() {
        System.out.println("Кот ест!");
    }

    @Override
    public String toString() {
        return "Возраст - " + age + ", Ареал обитания - " + getLocation()
                + ", Чем питается - " + getFood() + ", Шерсть - " + wool + "." + '\'';
    }
}
