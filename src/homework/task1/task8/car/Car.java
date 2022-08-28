package homework.task1.task8.car;

import java.util.Objects;

public abstract class Car<T> {
    private T carClass;
    private T carModel;
    private T carRelease;
    private T carDoorCount;
    private T carRoofForm;

    Car(){

    }

    Car(T carClass, T carModel, T carRelease, T carDoorCount, T carRoofForm){
        this.carClass = carClass;
        this.carModel = carModel;
        this.carRelease = carRelease;
        this.carDoorCount = carDoorCount;
        this.carRoofForm = carRoofForm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car<?> car = (Car<?>) o;
        return Objects.equals(carClass, car.carClass)
                && Objects.equals(carModel, car.carModel)
                && Objects.equals(carRelease, car.carRelease)
                && Objects.equals(carDoorCount, car.carDoorCount)
                && Objects.equals(carRoofForm, car.carRoofForm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carClass, carModel, carRelease, carDoorCount, carRoofForm);
    }

    @Override
    public String toString() {
        return "Автомобиль: " +
                "Класс авто: " + carClass +
                ", Модель: " + carModel +
                ", Год выпуска: " + carRelease +
                ", Количество дверей: " + carDoorCount +
                ", Вид крыши: " + carRoofForm +
                '.';
    }

    public T getCarClass() {
        return carClass;
    }

    public void setCarClass(T carClass) {
        this.carClass = carClass;
    }

    public T getCarModel() {
        return carModel;
    }

    public void setCarModel(T carModel) {
        this.carModel = carModel;
    }

    public T getCarRelease() {
        return carRelease;
    }

    public void setCarRelease(T carRelease) {
        this.carRelease = carRelease;
    }

    public T getCarDoorCount() {
        return carDoorCount;
    }

    public void setCarDoorCount(T carDoorCount) {
        this.carDoorCount = carDoorCount;
    }

    public T getCarRoofForm() {
        return carRoofForm;
    }

    public void setCarRoofForm(T carRoofForm) {
        this.carRoofForm = carRoofForm;
    }
}
