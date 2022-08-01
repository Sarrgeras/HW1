package homework.task1.task3;

import com.sun.source.tree.CaseLabelTree;
import homework.task1.task2.colour.Rainbow;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        menu();
    }
    public static void menu() {
        Process process = new Process();
        System.out.println("***Меню***");
        System.out.println("Выберите задание: ");
        System.out.println("Задание 1. Цикл While.");
        System.out.println("Задание 2. Цикл For.");
        System.out.println("Задание 3. Цикл Do-while.");
        System.out.println("Задание 4. Цикл Foreach.");
        System.out.println("0. Выход.");

        int ch = 0;
        Scanner in = new Scanner(System.in);
        ch = in.nextInt();
        switch (ch) {
            case 1:
                process.toStartWhile();
                break;
            case 2:
                process.toStartFor();
                break;
            case 3:
                process.toStartDoWhile();
                break;
            case 4:
                process.toStartForeach();
                break;
            case 0:
                break;
            default:
                System.out.println("Выберите верный пункт!");
        }
    }
}
