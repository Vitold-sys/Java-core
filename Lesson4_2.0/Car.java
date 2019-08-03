package Autoparts.lesson04;

import java.util.Objects;

public class Car extends Vehicle implements Info{
    private Door door;
    private Engine engine;
    private Wheel wheel;
    private Body body;
    private Gearbox gearbox;
    private static String carFirm = "Mercedes-benz";
    private static String carModel = "AMG";

    public Car() {
    }

    public Car(Door door, Engine engine, Wheel wheel, Body body, Gearbox gearbox) {
        this.door = door;
        this.engine = engine;
        this.wheel = wheel;
        this.body = body;
        this.gearbox = gearbox;
    }
    //Method from abstract class Vehicle
    public void typeOfVihicle() {
        System.out.println("Раздел автомобили");
    }
    //Method from abstract class Vehicle
    public void getInfo() {
        System.out.println("Подсчет стоимости автомобиля!");
        }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Gearbox getGearbox() {
        return gearbox;
    }

    public void setGearbox(Gearbox gearbox) {
        this.gearbox = gearbox;
    }

    public static String getCarFirm() {
        return carFirm;
    }

    public static void setCarFirm(String carFirm) {
        Car.carFirm = carFirm;
    }

    public static String getCarModel() {
        return carModel;
    }

    public static void setCarModel(String carModel) {
        Car.carModel = carModel;
    }
//Method from interface Info
    public void gasEngine (){
        System.out.println("Машина с бензиновым двигателем");
    }

    //Method from interface KindOfPart
    public void kindOfPart(){
        System.out.println("Стоимость оригинальных запчастей: ");

    }
    //Method from interface KindOfPart
    public void kindOfPart1() {
        System.out.println("Стоимость запчастей - аналогов: ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(door, car.door) &&
                Objects.equals(engine, car.engine) &&
                Objects.equals(wheel, car.wheel) &&
                Objects.equals(body, car.body) &&
                Objects.equals(gearbox, car.gearbox);
    }

    @Override
    public int hashCode() {
        return Objects.hash(door, engine, wheel, body, gearbox);
    }

    @Override
    public String toString() {
        return "Car{" +
                "door=" + door +
                ", engine=" + engine +
                ", wheel=" + wheel +
                ", body=" + body +
                ", chassis=" + gearbox +
                '}';
    }
}
