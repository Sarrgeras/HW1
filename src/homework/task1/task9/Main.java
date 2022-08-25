package homework.task1.task9;

import homework.task1.task9.port.Dock;
import homework.task1.task9.port.Ship;

public class Main {
    /*
        Я не понял, нужно ли было еще логику прописывать, что бы исключения не останавливали процесс,
     *  поэтому просто, что бы увидеть блок try/catch в классе Main, нужно закомментить добавление 2го и 3го корабля
         =-)
     */
    public static void main(String[] args) throws IllegalShipNumberException {
        Ship ship = new Ship();
        ship.addShip("Aurora", 1, 1900);
        ship.addShip("Bismark", -5, 1800);
        ship.addShip("Challenger", 4, 2300);
        ship.addShip("Continental", 123, 1600);
        ship.addShip("Elena", 122, 1999);
        Dock dock = new Dock();
        try {
            dock.getShip("Aurora", 1, 1900);
        } catch (ShipNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.err.println("=-)");
        }
        try {
            dock.getShip("Aurora", 1234, 1900);
        } catch (ShipNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.err.println("=-)");
        }
    }

}
