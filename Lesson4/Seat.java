package Autoparts;

import java.util.Objects;

public class Seat {
    private String seat;
    private int price;
    private String markSeat;

    public Seat(){

    }

    public Seat(String seat, int price, String markSeat) {
        this.seat = seat;
        this.price = price;
        this.markSeat = markSeat;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String engine) {
        this.seat = engine;
    }

    public int getPrice() {
        return price;
    }
    public int changeSeatPrice(){
        return price +1000;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMarkSeat() {
        return markSeat;
    }

    public void setMarkSeat(String markSeat) {
        this.markSeat = markSeat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seat seat = (Seat) o;
        return price == seat.price &&
                Objects.equals(seat, seat.seat) &&
                Objects.equals(markSeat, seat.markSeat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seat, price, markSeat);
    }

    @Override
    public String toString() {
        return "Seat{" +
                "engine='" + seat + '\'' +
                ", price=" + price +
                ", markSeat='" + markSeat + '\'' +
                '}';
    }
}
