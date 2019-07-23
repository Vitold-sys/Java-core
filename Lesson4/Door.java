package Autoparts;

import java.util.Objects;

public class Door {
    private String door;
    private int price;
    private String markDoor;

    public Door(){

    }

    public Door(String door, int price, String markDoor) {
        this.door = door;
        this.price = price;
        this.markDoor = markDoor;
    }

    public String getDoor() {
        return door;
    }

    public int getPrice() {
        return price;
    }

    public int changeDoorPrice(){
        return price +1100;
    }

    public String getMarkDoor() {
        return markDoor;
    }

    public void setEngine(String door) {
        this.door = door;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setMarkDoor(String markDoor) {
        this.markDoor = markDoor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Door door = (Door) o;
        return price == door.price &&
                Objects.equals(door, door.door) &&
                Objects.equals(markDoor, door.markDoor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(door, price, markDoor);
    }

    @Override
    public String toString() {
        return "Door{" +
                "engine='" + door + '\'' +
                ", price=" + price +
                ", markDoor='" + markDoor + '\'' +
                '}';
    }
    }
