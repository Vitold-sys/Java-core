package Lesson8;

import java.util.Arrays;
import java.util.LinkedList;

class Lesson8 {
    public static void main(String[] args) {
      /*  Book book1=new Book("Three Men In a Boat");
        Book book2=new Book( "The Fisherman and His Soul");
        Book book3=new Book("Forrest Gump");
        */
        Book book1=new Book("Jerome", "Jerom", "K.", "Three Men In a Boat");
        Book book2=new Book("Wilde", "Oscar ", "Soul", "The Fisherman and His Soul");
        Book book3=new Book("Escott", "John", "Gampovich", "Forrest Gump");


        LinkedList<Book> list1 = new LinkedList<>();
        list1.add(book1);
        list1.add(book2);
        list1.add(book3);
        list1.remove(1);//remove second book
        System.out.println(list1);

        for(Book p : list1){

            System.out.println(p.getBookname());//Print all book names
        }
    }
}
 
