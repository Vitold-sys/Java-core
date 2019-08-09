package Lesson8;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hashset {
    public static void main(String[] args) {
        Book book1=new Book("Jerome", "Jerom", "K.", "Three Men In a Boat");
        Book book2=new Book("Wilde", "Oscar ", "Soul", "The Fisherman and His Soul");
        Book book3=new Book("Escott", "John", "Gampovich", "Forrest Gump");
        Book book4=new Book("Jerome", "Jerom", "K.", "Three Men In a Boat");
        Book book5=new Book("Wilde", "Oscar ", "Soul", "The Fisherman and His Soul");
        Book book6=new Book("Escott", "John", "Gampovich", "Forrest Gump");
        Book book7=new Book("Jerome", "Jerom", "K.", "Three Men In a Boat");
        Book book8=new Book("Wilde", "Oscar ", "Soul", "The Fisherman and His Soul");
        Book book9=new Book("Escott", "John", "Gampovich", "Forrest Gump");
        Book book10=new Book("Jerome", "Jerom", "K.", "Three Men In a Boat");
        Book book11=new Book("Wilde", "Oscar ", "Soul", "The Fisherman and His Soul");
        Book book12=new Book("Escott", "John", "Gampovich", "Forrest Gump");
        Book book13=new Book("Jerome", "Jerom", "K.", "Three Men In a Boat");
        Book book14=new Book("Wilde", "Oscar ", "Soul", "The Fisherman and His Soul");
        Book book15=new Book("Escott", "John", "Gampovich", "Forrest Gump");
        Book book16=new Book("Escott", "John", "Gampovich", "Forrest Gump");
        Book book17=new Book("Jerome", "Jerom", "K.", "Three Men In a Boat");
        Book book18=new Book("Wilde", "Oscar ", "Soul", "The Fisherman and His Soul");
        Book book19=new Book("Escott", "John", "Gampovich", "Forrest Gump");
        Book book20=new Book("Escott", "John", "Gampovich", "Forrest Gump");
        Book book21=new Book("Jerome", "Jerom", "K.", "Three Men In a Boat");
        Book book22=new Book("Wilde", "Oscar ", "Soul", "The Fisherman and His Soul");
        Book book23=new Book("Escott", "John", "Gampovich", "Forrest Gump");
        Book book24=new Book("Escott", "John", "Gampovich", "Forrest Gump");
        Book book25=new Book("Jerome", "Jerom", "K.", "Three Men In a Boat");

        HashSet<Book> books= new LinkedHashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);
        books.add(book9);
        books.add(book10);
        books.add(book11);
        books.add(book12);
        books.add(book13);
        books.add(book14);
        books.add(book15);
        books.add(book16);
        books.add(book17);
        books.add(book18);
        books.add(book19);
        books.add(book20);
        books.add(book21);
        books.add(book22);
        books.add(book23);
        books.add(book24);
        books.add(book25);


        System.out.println("Books:"+ books.contains("T"));
        for(Book p : books){

            System.out.println("Books:" + p.getBookname());
        }
        for(Book z : books){
            System.out.println(z.getSur());
        }
    }
}
 
