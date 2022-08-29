package homework.task1.task10.shop;

import homework.task1.task10.constants.Generating;
import homework.task1.task10.constants.Products;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class MakingOrder extends Order<Product> implements Generating<LocalDate, Products, Integer> {

    public MakingOrder(){

    }


    public int generateDate(){
        Random rnd = new Random();
        return rnd.nextInt(1, 11);
    }


    public void addOrder() throws IOException {
        for (int i = 0; i < 6; i++) {
            list.add(i, new Product(createId(), createProduct().getProduct(), createDate()));
        }
    }

    @Override
    public LocalDate createDate() {
        LocalDate localDate = LocalDate.of(2022, 1, 1);
        localDate = localDate.plusDays(generateDate());
        localDate = localDate.plusMonths(generateDate());

        return localDate;
    }

    @Override
    public Products createProduct() {
        Random rnd = new Random();
        return switch (rnd.nextInt(1,6)){
            case 1 -> Products.BEEF;
            case 2 -> Products.BREAD;
            case 3 -> Products.MILK;
            case 4 -> Products.PORK;
            case 5 -> Products.CHEESE;
            default -> Products.MUTTON;
        };
    }

    @Override
    public Integer createId() {
        Random rnd = new Random();
        return rnd.nextInt(1, 100);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
