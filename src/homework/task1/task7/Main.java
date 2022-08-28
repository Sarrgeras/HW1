package homework.task1.task7;

import homework.task1.task7.robots.Robot;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Factory nameFactory = new Factory();
        Factory firstFactory = new Factory();
        Factory secondFactory = new Factory();
        List<Robot<String>> robots = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            robots.add(i ,new Robot<String>(nameFactory.createName(), firstFactory.createBodies(), secondFactory.createHeads()));
        }

        for (Robot<String> robot: robots) {
            System.out.println(robot);
        }
    }
}
