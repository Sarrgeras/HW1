package homework.task1.task2.colour;

import homework.task1.task2.start.Main;

import java.util.Scanner;

public class Rainbow {
    public final String RED = "Красный";
    public final String ORANGE = "Оранжевый";
    public final String YELLOW = "Желтый";
    public final String GREEN = "Зеленый";
    public final String SKY_BLUE = "Голубой";
    public final String BLUE = "Синий";
    public final String VIOLET = "Фиолетовый";

    String [][] colours = {{RED, ORANGE, YELLOW, GREEN, SKY_BLUE, BLUE, VIOLET} ,{"1", "2", "3", "4", "5", "6", "7"}};

    public void chooseRed(){
        System.out.println(RED);
    }
    public void chooseOrange(){
        System.out.println(ORANGE);
    }
    public void chooseYellow(){
        System.out.println(YELLOW);

    }
    public void chooseGreen(){
        System.out.println(GREEN);

    }
    public void chooseSkyBlue(){
        System.out.println(SKY_BLUE);

    }
    public void chooseBlue(){
        System.out.println(BLUE);

    }

    public void chooseViolet(){
        System.out.println(VIOLET);

    }

    public void chooseSemiColour(int firstColour, int secondColour){
        Main main = new Main();

        for (int i = 0; i < colours.length; i++){

            for (int j = 0; j < colours.length; j++){
                if (Integer.parseInt(colours[1][i]) == firstColour){
                    if (Integer.parseInt(colours[1][j]) == secondColour){
                        System.out.println(colours[0][i] + "-" + colours[0][j]);

                    }

                }
            }
        }
    }

    public void outAll(){
        System.out.println(RED);
        System.out.println(ORANGE);
        System.out.println(YELLOW);
        System.out.println(GREEN);
        System.out.println(BLUE);
        System.out.println(SKY_BLUE);
        System.out.println(VIOLET);
    }

}
