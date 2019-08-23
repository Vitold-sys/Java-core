package Callerer;


import java.util.LinkedList;

public class Operator extends Thread {
    Queue person1 = new Queue("Иван", "Андреев", 1);
    Queue person2 = new Queue("Паша", "Эдуардов", 2);
    Queue person3 = new Queue("Саша", "Викторов", 3);
    Queue person4 = new Queue("Маша", "Семенуй", 4);
    Queue person5 = new Queue("Вито", "Скалетто", 5);
    Queue person6 = new Queue("Лена", "Васильев", 6);

    @Override
    public synchronized void run() {

        LinkedList<Queue> list1 = new LinkedList<>();
        list1.add(person1);
        list1.add(person2);
        list1.add(person3);
        list1.add(person4);
        list1.add(person5);
        list1.add(person6);

       for (Queue p : list1) {
           for (int z = 0; p.getN() < 2; p.getN()) {
                System.out.println("Вас обслуживает оператор: " + Operator.currentThread().getName());
                System.out.println("Обслужен клиент: " + p.getName() + " "+ p.getSurname());
            }
            try {
                sleep(500); // Waiting for 0.5 sec
            } catch (Exception e) {
            }
        }
    }
}

