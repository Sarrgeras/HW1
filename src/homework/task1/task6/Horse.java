package homework.task1.task6;

public class Horse extends Animal{

    public int age;

    public String wool;

    public Horse(){

    }

    public Horse(String food, String location, int age, String wool){
        super(food, location);
        this.age = age;
        this.wool = wool;
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь издает шум!");
    }

    @Override
    public void sleep() {
        System.out.println("Лошадь спит!");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест!");
    }

    @Override
    public String toString() {
        return "Возраст - " + age + ", Ареал обитания - " + getLocation()
                + ", Чем питается - " + getFood() + ", Шерсть - " + wool + "." + '\'';
    }
}
