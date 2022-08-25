package homework.task1.task9.port;

import homework.task1.task9.ShipNotFoundException;

public class Dock {

    public Ship getShip(String name, int number, int capacity) throws ShipNotFoundException{
        Ship ship = new Ship(name, number, capacity);
        if (ship.scanShip(ship)){
            return ship;
        }
        else {
            throw new ShipNotFoundException("* Ship is not found! *");
        }
    }

}
