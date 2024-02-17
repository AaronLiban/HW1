package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];

        Ship baseShip = new Ship();
        baseShip.setShip("Santa Maria");
        baseShip.setYear("1460");
        ships[0] = baseShip;

        CargoShip cargoShip = new CargoShip();
        cargoShip.setShip("Nina");
        cargoShip.setYear("1492");
        cargoShip.setCargoCapacity(10);
        ships[1] = cargoShip;

        CruiseShip cruiseShip = new CruiseShip();
        cruiseShip.setShip("Pinta");
        cruiseShip.setYear("1441");
        cruiseShip.setPassengers(74);
        ships[2] = cruiseShip;

        for (Ship element : ships) {
            System.out.println(element);
        }
    }
}