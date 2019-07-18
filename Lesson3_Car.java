package Myfirstapp;

import java.util.Random;

public class Car {
    long id;
    int price;
    int weight;
    String model;
//конструктор дефолт
    public Car() {
        System.out.println("CarCarCar");
    }
//конструктор с параметром
    public Car(long id, String model, int weight, int price) {
    }
//Метод вызывающий рандомную машину
    public long getRando(int id) {
        long r =  id;
        System.out.println(r);
        return r;
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
