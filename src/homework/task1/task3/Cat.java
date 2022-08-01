package homework.task1.task3;

import java.util.Objects;

public class Cat {
    public int age = 1;
    public String name = "Кот";

    public Cat(){

    }
    public Cat(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age = (int) (1 + Math.random() * 28);
    }

    public void setAge(int age) {
        System.out.println(age);
    }

    public String getName() {
        Symbols smb = new Symbols();

        return name = smb.getSymbols();
    }

    public void setName(String name) {
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
