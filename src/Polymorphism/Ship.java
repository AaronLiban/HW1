package Polymorphism;

public class Ship {
    private String ship;
    private String year;

    public Ship() {

    }
    public Ship(String ship, String year){
        this.ship = ship;
        this.year = year;
    }

    public String getShip() {
        return ship;
    }

    public String getYear() {
        return year;
    }

    public void setShip(String ship) {
        this.ship = ship;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String toString() {
        return "Polymorphism.Ship Name: " + getShip() + "\nYear Built: " + getYear();
    }
}

