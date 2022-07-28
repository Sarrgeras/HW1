package homework.task1.task2.start;

import homework.task1.task2.colour.Rainbow;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        menu();
    }
    public static void menu(){
        Rainbow rainbow = new Rainbow();
        System.out.println("***Меню***");
        System.out.println("Выберите цвет: ");
        System.out.println("1. Красный.");
        System.out.println("2. Оранжевый.");
        System.out.println("3. Желтый");
        System.out.println("4. Зеленый");
        System.out.println("5. Голубой.");
        System.out.println("6. Синий.");
        System.out.println("7. Фиолетовый.");
        System.out.println("8. Выбрать что-то между цветами.");
        System.out.println("9. Показать все цвета.");
        System.out.println("0. Выход.");

        int ch = 0;
        Scanner in = new Scanner(System.in);
        ch = in.nextInt();
        switch (ch) {
            case 1:
                rainbow.chooseRed();
                break;
            case 2:
                rainbow.chooseOrange();
                break;
            case 3:
                rainbow.chooseYellow();
                break;
            case 4:
                rainbow.chooseGreen();
                break;
            case 5:
                rainbow.chooseSkyBlue();
                break;
            case 6:
                rainbow.chooseBlue();
                break;
            case 7:
                rainbow.chooseViolet();
                break;
            case 8:
                System.out.println("Выберите 2 цвета: ");
                System.out.println("1. Красный.");
                System.out.println("2. Оранжевый.");
                System.out.println("3. Желтый");
                System.out.println("4. Зеленый");
                System.out.println("5. Голубой.");
                System.out.println("6. Синий.");
                System.out.println("7. Фиолетовый.");
                int firstColour = 0;
                firstColour = in.nextInt();
                int secondColour = 0;
                secondColour = in.nextInt();
                rainbow.chooseSemiColour(firstColour,secondColour);
                break;
            case 9:
                break;
            case 0:
                break;
            default:
                System.out.println("Выберите верный пункт!");
        }
    }
}
