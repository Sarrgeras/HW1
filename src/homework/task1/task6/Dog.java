package homework.task1.task6;

public class Dog extends Animal {

    public int age;

    public String wool;

    public Dog(){

    }

    public Dog(String food, String location, int age, String wool){
        super(food, location);
        this.age = age;
        this.wool = wool;
    }

    @Override
    public void makeNoise() {
        System.out.println("Собака издает шум!");
    }

    @Override
    public void sleep() {
        System.out.println("Собака спит!");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест!");
    }

    @Override
    public String toString() {
        return "Возраст - " + age + ", Ареал обитания - " + getLocation()
                + ", Чем питается - " + getFood() + ", Шерсть - " + wool + "." + '\'';
    }
}
