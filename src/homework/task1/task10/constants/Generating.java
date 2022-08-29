package homework.task1.task10.constants;

import homework.task1.task10.shop.MakingOrder;

public interface Generating<T, K, V> {
    T createDate();
    K createProduct();
    V createId();

}
