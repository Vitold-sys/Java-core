package Autoparts;

import java.util.Objects;

public class Engine {
    private String engine;
    public int price;
    private String markEngine;

    public Engine(){

    }

    public Engine(String engine, int price, String markEngine) {
        this.engine = engine;
        this.price = price;
        this.markEngine = markEngine;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getPrice() {
        return price;
    }
    public int changeEnginePrice(){
        return price +1000;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMarkEngine() {
        return markEngine;
    }

    public void setMarkEngine(String markEngine) {
        this.markEngine = markEngine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine1 = (Engine) o;
        return price == engine1.price &&
                Objects.equals(engine, engine1.engine) &&
                Objects.equals(markEngine, engine1.markEngine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engine, price, markEngine);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engine='" + engine + '\'' +
                ", price=" + price +
                ", markEngine='" + markEngine + '\'' +
                '}';
    }
}
