package homework.task1.task7;

import homework.task1.task7.robots.*;

import java.util.Random;

public class Factory implements CreateRobots, CreateName<String> {

    private static final int SIZE = 10;

    public static class GenerateRobots<T>{
        public static Bodies generateBody(){
            Random random = new Random();
            int numberHead = random.nextInt(3);
            return switch (numberHead) {
                case 0 -> Bodies.ATTACKING_BODY;
                case 1 -> Bodies.ENGINEERING_BODY;
                default -> Bodies.PROTECTED_BODY;
            };
        }

        public static Heads generateHead(){
            Random random = new Random();
            int numberHead = random.nextInt(3);
            return switch (numberHead) {
                case 0 -> Heads.SINGLE_TASKING_HEAD;
                case 1 -> Heads.MULTITASKING_HEAD;
                default -> Heads.FLAGSHIP_HEAD;
            };
        }

        public static <T extends String> String generateName(){


            String rus = "абвгдеёжзийклмнопрстуфхцчъыьэюя";
            String eng = "abcdefghijklmnopqrstuvwxyz";
            String dig = "0123456789";
            String nameRobot = "";
            String symbols = rus + rus.toUpperCase() + eng + eng.toUpperCase() + dig;

            char c;

            char[] name = new char[SIZE];
            Random rnd = new Random();
            for (int i = 0; i < name.length; i++) {

                nameRobot = nameRobot + symbols.charAt(rnd.nextInt(symbols.length()));

            }
            return nameRobot;
        }

    }

    @Override
    public String createName() {
        return GenerateRobots.generateName();
    }

    @Override
    public Bodies createBodies() {
        return GenerateRobots.generateBody();
    }

    @Override
    public Heads createHeads() {
        return GenerateRobots.generateHead();
    }
}
