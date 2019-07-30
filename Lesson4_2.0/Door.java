package Autoparts.lesson04;

import java.util.Objects;

public class Door {
    private int idDoor;
    private int price;
    private String doorModel;

    public Door(){
    }

    public Door(int idDoor, int price, String doorModel) {
        this.idDoor = idDoor;
        this.price = price;
        this.doorModel = doorModel;
    }

    public int getIdDoor() {
        return idDoor;
    }

    public void setIdDoor(int idDoor) {
        this.idDoor = idDoor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDoorModel() {
        return doorModel;
    }

    public void setDoorModel(String doorModel) {
        this.doorModel = doorModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Door door = (Door) o;
        return idDoor == door.idDoor &&
                price == door.price &&
                Objects.equals(doorModel, door.doorModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDoor, price, doorModel);
    }

    @Override
    public String toString() {
        return "Door{" +
                "idDoor=" + idDoor +
                ", price=" + price +
                ", doorModel='" + doorModel + '\'' +
                '}';
    }
}
