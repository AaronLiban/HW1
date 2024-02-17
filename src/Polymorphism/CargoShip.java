package Polymorphism;

public class CargoShip extends Ship {
    private int cargoCapacity;

    public CargoShip() {

    }
    public CargoShip(String ship, String year, int cargoCapacity) {
        super(ship, year);
        this.cargoCapacity = cargoCapacity;
    }
    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String toString() {
        return "Polymorphism.Ship Name: " + getShip() + "\nPolymorphism.Ship cargo capacity: " + getCargoCapacity();
    }
}
