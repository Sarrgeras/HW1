package homework.task1.task10;

import homework.task1.task10.shop.MakingCheck;
import homework.task1.task10.shop.MakingOrder;
import homework.task1.task10.shop.Order;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        MakingCheck makingCheck = new MakingCheck();
        makingCheck.addOrder();
        System.out.println(makingCheck.toString().replaceAll("\\p{P}", ""));
        makingCheck.addLine();
    }

}

