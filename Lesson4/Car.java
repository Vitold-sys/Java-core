package Autoparts;

import java.util.Objects;

public class Car {
    public static void main(String[] args) {

        Engine amg = new Engine("AMG Engine", 10000, "MercedesEngine");
        System.out.println("Название запчасти: " + amg.getEngine()+ ", Цена: " + amg.getPrice());
        Door amgFront = new Door("AMG Door", 2000, "MercedesDoor");
        System.out.println("Название запчасти: " + amgFront.getDoor()+ ", Цена: " + amgFront.getPrice());
        Wheel amgWheel = new Wheel("AMG Wheel", 600, "MercedesWheel");
        System.out.println("Название запчасти: " + amgWheel.getWheel()+ ", Цена: " + amgWheel.getPrice());
        Gearbox amgGearbox = new Gearbox("AMG Gearbox", 4000, "MercedesGearbox");
        System.out.println("Название запчасти: " + amgGearbox.getGearbox()+ ", Цена: " + amgGearbox.getPrice());
        Seat amgSeat = new Seat("AMG Seat", 300, "MercedesSeat");
        System.out.println("Название запчасти: " + amgSeat.getSeat()+ ", Цена: " + amgSeat.getPrice());
        System.out.println("Cтоимость машины: " + (amg.getPrice() + amgFront.getPrice() + amgGearbox.getPrice()+amgSeat.getPrice()+amgWheel.getPrice()));

        System.out.println("Название запчасти: " + amg.getEngine()+ ", Цена в следующем году: " + amg.changeEnginePrice());
        System.out.println("Название запчасти: " + amgFront.getDoor()+ ", Цена в следующем году: " + amgFront.changeDoorPrice());
        System.out.println("Название запчасти: " + amgWheel.getWheel()+ ", Цена в следующем году: " + amgWheel.changeWheelPrice());
        System.out.println("Название запчасти: " + amgGearbox.getGearbox()+ ", Цена в следующем году: " + amgGearbox.changeGearboxPrice());
        System.out.println("Название запчасти: " + amgSeat.getSeat()+ ", Цена в следующем году: " + amgSeat.changeSeatPrice());
        System.out.println("Cтоимость машины в следующем году: " + (amg.changeEnginePrice() + amgFront.changeDoorPrice() + amgWheel.changeWheelPrice()+amgGearbox.changeGearboxPrice()+amgSeat.changeSeatPrice()));
        }
    }

