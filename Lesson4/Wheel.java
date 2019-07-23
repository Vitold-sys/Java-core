package Autoparts;

public class Wheel {
    private String wheel;
    private int price;
    private String markWheel;

    public Wheel(){

    }

    public Wheel(String wheel, int price, String markWheel) {
        this.wheel = wheel;
        this.price = price;
        this.markWheel = markWheel;
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String engine) {
        this.wheel = engine;
    }

    public int getPrice() {
        return price;
    }
    public int changeWheelPrice(){
        return price +200;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMarkWheel() {
        return markWheel;
    }

    public void setMarkWheel(String markWheel) {
        this.markWheel = markWheel;
    }
}
