package homework.task1.task4;

import homework.task1.task2.colour.Rainbow;

import java.util.Random;

public class Symbols {

    private final int SIZE = 7;
    private final int INT_SIZE = 10;
    String rus = "абвгдеёжзийклмнопрстуфхцчъыьэюя";
    String eng = "abcdefghijklmnopqrstuvwxyz";

    String dig = "0123456789";
    String number = "";
    String words = "";
    String symbols = rus + rus.toUpperCase() + eng + eng.toUpperCase();

    public String getWords(){
        char c;
        words = "";
        char[] name = new char[SIZE];
        Random rnd = new Random();
        for (int i = 0; i < 7; i++) {

            words = words + symbols.charAt(rnd.nextInt(symbols.length()));

        }

        return words;
    }

    public String getNumber(){
        int[] numbers = new int[INT_SIZE];
        Random rnd = new Random();
        number = "";
        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = i;

        }

        for (int i = 0; i < 7; i++) {

            if (i != 1){
                number = number + (int)(0 + Math.random()*9);
            }
            else{
                number =  number + '.';
            }
        }

        return number;
    }
}
