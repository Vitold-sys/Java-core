package Caller;

public class CallCenterDemo {
        public static void main(String[] args) throws Exception {
           //Create 2 queue
            PeopleQueue queue1 = new PeopleQueue("Иван","Маша","Паша","Вася","Женя");
            PeopleQueue queue2 = new PeopleQueue("Мария","Людмила","Алиса","Карина","Ольга");

            System.out.println("Работа кол центра начата");
            queue1.start();    //Start 1 queue
            queue2.start(); //Start 2 queue
            queue1.join(); //Wait for all clients to print done
            System.out.println("Все клиенты обслужены");

        }
    }
