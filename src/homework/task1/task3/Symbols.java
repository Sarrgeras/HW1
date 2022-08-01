package homework.task1.task3;

import homework.task1.task2.colour.Rainbow;

import java.util.Random;

public class Symbols {

    private final int SIZE = 5;
    String rus = "абвгдеёжзийклмнопрстуфхцчъыьэюя";
    String eng = "abcdefghijklmnopqrstuvwxyz";
    String dig = "0123456789";
    String nameCat = "";
    String symbols = rus + rus.toUpperCase() + eng + eng.toUpperCase() + dig;

    public String getSymbols(){
        char c;

        char[] name = new char[SIZE];
        Random rnd = new Random();
        for (int i = 0; i < name.length; i++) {

            nameCat = nameCat + symbols.charAt(rnd.nextInt(symbols.length()));

        }
        return nameCat;
    }
}
