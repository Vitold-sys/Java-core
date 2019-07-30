package Autoparts.lesson04;

import java.util.Objects;

public class Gearbox {
    private int Gearbox;
    private int price;
    private String gearboxModel;

    public Gearbox(int gearbox, int price, String gearboxModel) {
        Gearbox = gearbox;
        this.price = price;
        this.gearboxModel = gearboxModel;
    }

    public int getGearbox() {
        return Gearbox;
    }

    public void setGearbox(int gearbox) {
        Gearbox = gearbox;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getGearboxModel() {
        return gearboxModel;
    }

    public void setGearboxModel(String gearboxModel) {
        this.gearboxModel = gearboxModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gearbox gearbox = (Gearbox) o;
        return Gearbox == gearbox.Gearbox &&
                price == gearbox.price &&
                Objects.equals(gearboxModel, gearbox.gearboxModel);
    }


    @Override
    public int hashCode() {
        return Objects.hash(Gearbox, price, gearboxModel);
    }

    @Override
    public String toString() {
        return "Gearbox{" +
                "Gearbox=" + Gearbox +
                ", price=" + price +
                ", gearboxModel='" + gearboxModel + '\'' +
                '}';
    }
}
