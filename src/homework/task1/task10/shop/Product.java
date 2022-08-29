package homework.task1.task10.shop;

import java.time.LocalDate;
import java.util.Date;

public class Product {

    private int id;
    private String name;
    private LocalDate productionDate;

    public Product(){

    }

    public Product(int id, String name, LocalDate productionDate){
        this.id = id;
        this.name = name;
        this.productionDate = productionDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    @Override
    public String toString() {
        return "код товара: " + id +
                ", наименование товара: " + name +
                ", дата изготовления: " + productionDate + '.' +
                '\n';
    }
}
