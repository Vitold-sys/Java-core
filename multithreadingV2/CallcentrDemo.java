package Callerer;

import java.util.LinkedList;

public class CallcentrDemo {

    public static void main(String[] args) throws Exception {
        //Create 2 queue
        Queue person1 = new Queue("Иван","Андреев",1);
        Queue person2 = new Queue("Паша","Эдуардов",2);
        Queue person3 = new Queue("Саша","Викторов",3);
        Queue person4 = new Queue("Маша","Семенуй",4);
        Queue person5 = new Queue("Вито","Скалетто",5);
        Queue person6 = new Queue("Лена","Васильев",6);

        Thread operator1 = new Thread(new Operator());
        operator1.setName("Мария");
        Thread operator2 = new Thread(new Operator());
        operator2.setName("Алиса");
        Thread operator3 = new Thread(new Operator());
        operator3.setName("Ольга");


        System.out.println("Работа кол центра началась:");
        LinkedList<Queue> list1 = new LinkedList<>();
        list1.add(person1);
        list1.add(person2);
        list1.add(person3);
        list1.add(person4);
        list1.add(person5);
        list1.add(person6);

        for(Queue p : list1){

            System.out.println("В очереди находятся: " + p.getSurname()+ " " + p.getName());
        }

        operator1.start();    //Start 1 queue
        operator2.start(); //Start 2 queue
        operator3.start();
        operator3.join();//Wait for all clients to print done

        System.out.println("Все клиенты обслужены");

    }
}
