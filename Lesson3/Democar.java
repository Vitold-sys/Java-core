package Myfirstapp;

import java.util.Objects;

public class Democar {
    int price;
    int weight;
    String model;

    public static void main(String[] args) {
        Car kia = new Car(1, "Kia Stinger", 1500, 10000);
        Car vw = new Car(2, "VW Arteon", 1700, 12000);
        Car skoda = new Car(3, "Skoda Octavia WRC", 1600, 14000);
        Car jeep = new Car(4, "Jeep Wrangler", 2100, 16000);
        Car scania = new Car(5, "Scania Prof", 4000, 20000);
        kia.check(1500);
        jeep.check(2000);
        scania.check(3500);
        new Car().generateRandomModel();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Democar democar = (Democar) o;
        return price == democar.price &&
                weight == democar.weight &&
                Objects.equals(model, democar.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, weight, model);
    }

    @Override
    public String toString() {
        return "Democar{" +
                "price=" + price +
                ", weight=" + weight +
                ", model='" + model + '\'' +
                '}';
    }
}
