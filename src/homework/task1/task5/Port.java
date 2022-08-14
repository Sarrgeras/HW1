package homework.task1.task5;

import homework.task1.task2.colour.Rainbow;

import java.util.Scanner;

public class Port {

    public String name;

    public void menu(){
        Ship ship = new Ship();
        System.out.println("***Меню***");
        System.out.println("Выберите пункт: ");
        System.out.println("1. Вывести только массы.");
        System.out.println("2. Вывести общие массы всех кораблей");
        System.out.println("0. Выход.");

        int ch = 0;
        Scanner in = new Scanner(System.in);
        ch = in.nextInt();
        switch (ch) {
            case 1:
                ship.add();
                ship.outWeight();
                break;
            case 2:
                ship.add();
                ship.out();
                break;
            case 0:
                break;
            default:
                System.out.println("Выберите верный пункт!");
        }
    }

}
