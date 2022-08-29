package homework.task1.task10.shop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order<T> {
    List<T> list = new ArrayList<>();
    private LocalDate orderDate;
    private int identifier;

    public Order(){

    }

    public Order(List<T> list, LocalDate orderDate, int identifier){
        this.list = list;
        this.orderDate = orderDate;
        this.identifier = identifier;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return  list + "Выпуск чека:" + orderDate + '.' + '\t' + "Код чека: " + identifier + '.';
    }
}
