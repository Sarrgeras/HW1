package homework.task1.task9.port;

import homework.task1.task9.IllegalShipNumberException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ship {

    private String name;
    private int number;
    private int capacity;

    private static final List<Ship> ships = new ArrayList<>();

    public Ship() {

    }

    public Ship(String name, int number, int capacity) {
        this.name = name;
        this.number = number;
        this.capacity = capacity;
    }

    public void addShip(String name, int number, int capacity) throws IllegalShipNumberException {
        if ((verifyShipNumber(name, number, capacity)) && (verifyShipCapacity(name, number, capacity))) {
            ships.add(new Ship(name, number, capacity));
        }

    }

    private boolean verifyShipNumber(String name, int number, int capacity) throws IllegalShipNumberException {
        if (number < 0) {
            throw new IllegalShipNumberException("* Ship's number incorrect! *");
        } else {
            return true;
        }
    }

    private boolean verifyShipCapacity(String name, int number, int capacity) throws IllegalShipNumberException {
        if (capacity > 2000) {
            throw new IllegalShipNumberException("* Load capacity is too high! *");
        } else if (capacity < 0) {
            throw new IllegalShipNumberException("* Ship's capacity incorrect! *");
        } else {
            return true;
        }
    }

    public boolean scanShip(Ship ship) {
        for (Ship scanShip : ships) {
            if (scanShip.equals(ship)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ship ship = (Ship) o;
        return number == ship.number && capacity == ship.capacity && Objects.equals(name, ship.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number, capacity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
