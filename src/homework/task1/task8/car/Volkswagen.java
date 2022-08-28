package homework.task1.task8.car;

import java.util.Objects;

public class Volkswagen<T> extends Car<String> {

    private T companyRunner;

    public Volkswagen(){

    }

    public Volkswagen(String carClass, String carModel, String carRelease, String carDoorCount, String carRoofForm){
        super(carClass, carModel, carRelease, carDoorCount, carRoofForm);
    }

    public Volkswagen(String carClass, String carModel, String carRelease, String carDoorCount,
                      String carRoofForm, T companyRunner){
        super(carClass, carModel, carRelease, carDoorCount, carRoofForm);

        this.companyRunner = companyRunner;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Volkswagen<?> Volkswagen = (Volkswagen<?>) o;
        return Objects.equals(companyRunner, Volkswagen.companyRunner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), companyRunner);
    }

    @Override
    public String toString() {
        return "Volkswagen." + super.toString() +
                "Основатель компании: " + companyRunner + ".";
    }

    public T getCompanyRunner() {
        return companyRunner;
    }

    public void setCompanyRunner(T companyRunner) {
        this.companyRunner = companyRunner;
    }


}
