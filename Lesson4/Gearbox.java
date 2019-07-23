package Autoparts;

import java.util.Objects;

public class Gearbox {
    private String gearbox;
    private int price;
    private String markGearbox;

    public Gearbox(){

    }
    public Gearbox(String gearbox, int price, String markGearbox) {
        this.gearbox = gearbox;
        this.price = price;
        this.markGearbox = markGearbox;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String engine) {
        this.gearbox = engine;
    }

    public int getPrice() {
        return price;
    }
    public int changeGearboxPrice(){
        return price +4000;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMarkGearbox() {
        return markGearbox;
    }

    public void setMarkGearbox(String markGearbox) {
        this.markGearbox = markGearbox;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gearbox gearbox = (Gearbox) o;
        return price == gearbox.price &&
                Objects.equals(gearbox, gearbox.gearbox) &&
                Objects.equals(markGearbox, gearbox.markGearbox);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gearbox, price, markGearbox);
    }

    @Override
    public String toString() {
        return "Gearbox{" +
                "engine='" + gearbox + '\'' +
                ", price=" + price +
                ", markGearbox='" + markGearbox + '\'' +
                '}';
    }
}
