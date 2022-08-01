package homework.task1.task3;

public class Process {
    Cat cat = new Cat();
    public void toStartWhile(){
        int counter = 0;
        while (counter < 10){
            System.out.println("---" + "\n" + cat.name + "\n" + cat.age + "\n" + "---");
            counter++;
        }

    }

    public void toStartFor(){
        for (int i = 0; i < 10 ; i++) {
            cat.setAge(cat.getAge());
            cat.setName(cat.getName());
        }
    }

    public void toStartDoWhile(){
        int counter = 0;
        Cat[] cats = new Cat[10];
        do {
            cats[counter] = new Cat(cat.getAge(), cat.getName());
            counter++;
        }while (counter < 10);
        counter = 0;
        do {
            System.out.println(cats[counter]);
            counter++;
        }while (counter < 10);
    }

    public void toStartForeach(){
        Cat[] catsForeach = new Cat[5];
        for (int i = 0; i < catsForeach.length; i++) {
            catsForeach[i] = new Cat(cat.getAge(), cat.getName());
        }
        for (Cat i: catsForeach) {
            System.out.println(i);
        }
    }
}
