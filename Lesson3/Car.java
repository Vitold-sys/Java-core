package Myfirstapp;

import java.util.ArrayList;
import java.util.Arrays;

public class Car {
    long id;
    int price;
    int weight;
    String model;
    private static final String LegkovYshka = "LegkovYshka";
    private static final String Dzip = "Dzip";
    private static final String Gryzovikkkkk = "Gryzovikkkkk";
//конструктор дефолт
    public Car() {
        System.out.println("CarCarCar");
    }
//конструктор с параметром
    public Car(long id, String model, int weight, int price) {
    }
//Метод вызывающий рандомную машину
public static void generateRandomModel() {
    ArrayList<String> aListRandomCar = new ArrayList<String>();

    aListRandomCar.add(LegkovYshka);
    aListRandomCar.add(Dzip);
    aListRandomCar.add(Gryzovikkkkk);

    int resultRandomCar = (int) (Math.random() * aListRandomCar.size());

    System.out.println(aListRandomCar.get(resultRandomCar));
}
//Метод
    public static void check(int weight){
        switch (weight) {
            case 1500:
                System.out.println("LegkovYshka");
                break;
            case 2000:
                System.out.println("Dzip");
                break;
            case 3500:
                System.out.println("Gryzovikkkkk");
                break;

        }
    }


}
