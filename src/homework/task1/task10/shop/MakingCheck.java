package homework.task1.task10.shop;

import java.io.*;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MakingCheck extends MakingOrder{



    public LocalDate createDateOrder() {
        return super.createDate();
    }


    public Integer createIdentity() {
        return super.createId();
    }

    @Override
    public void addOrder() throws IOException {
        super.addOrder();
        List<Order<Product>> orderList = new ArrayList<>();
        LocalDate date = createDateOrder();
        int id = createIdentity();
        orderList.add(0, new Order<Product>(list, date, id));
        File file = new File("D://Java prjccts//HW1//src//homework//task1//task10//resources//check.txt");
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))){
            bufferedWriter.append(orderList.toString().replaceAll("\\p{P}", ""));
        }
    }

    public void addLine() throws IOException{
        File file = new File("D://Java prjccts//HW1//src//homework//task1//task10//resources//check.txt");
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))){
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            char[] buffer = new char[8096];
            bufferedReader.read(buffer);
            String str = new String(buffer);

            bufferedWriter.append("код товара");
            bufferedWriter.append(str);
        }    }

    @Override
    public String toString() {
        return super.toString();
    }
}
