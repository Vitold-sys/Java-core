package Lesson8;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        TreeSet studentlist = new TreeSet(new StudentComparator());
        Student student1 = new Student("Ivanov", "Ivan", "Ivanovich", 1, 4);
        Student student2 = new Student("Iva", "Iva", "Ivano", 2, 8);
        Student student3 = new Student("Jerom", "Ivano", "Ivich", 3, 6);
        Student student4 = new Student("Ivanov", "Jero", "Iich", 4, 8);
        Student student5 = new Student("Oscav", "Ivan", "Iva", 5, 9);
        Student student6 = new Student("Oscarov", "Ivan", "Jerom", 6, 7);
        Student student7 = new Student("Ivanoq", "Ierom", "Gampovich", 7, 8);
        Student student8 = new Student("Ivav", "Ivan", "Oscarvich", 8, 8);
        Student student9 = new Student("Inov", "Oscar", "Gampovichich", 9, 5);
        Student student10 = new Student("Oscar", "Ivan", "Soulich", 10, 10);

        studentlist.add(student1);
        studentlist.add(student2);
        studentlist.add(student3);
        studentlist.add(student4);
        studentlist.add(student5);
        studentlist.add(student6);
        studentlist.add(student7);
        studentlist.add(student8);
        studentlist.add(student9);
        studentlist.add(student10);


        for (Object a : studentlist) {
            System.out.println("Surname: " + a.toString());
        }
        
    }
}

