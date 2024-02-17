package Polymorphism;

public class CruiseShip extends Ship {
    private int passengers;

    public CruiseShip() {

    }
    public CruiseShip(String ship, String year, int passengers) {
        super(ship, year);
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Polymorphism.Ship Name: " + getShip() + "\nMax number of passengers: " + getPassengers();
    }
}
