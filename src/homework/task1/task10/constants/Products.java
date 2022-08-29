package homework.task1.task10.constants;

public enum Products {

    MILK ("молоко"),
    CHEESE ("сыр"),
    BEEF ("говядина"),
    PORK ("свинина"),
    MUTTON ("баранина"),
    BREAD ("хлеб");

    private final String product;

    Products(String product){
        this.product = product;
    }

    public String getProduct() {
        return product;
    }
}
