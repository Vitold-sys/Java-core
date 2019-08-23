package Callerer;

import java.util.Objects;

public class Queue {
    String name;
    String surname;
    int n;

    public Queue(String name, String surname, int n) {
        this.name = name;
        this.surname = surname;
        this.n = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Queue queue = (Queue) o;
        return n == queue.n &&
                Objects.equals(name, queue.name) &&
                Objects.equals(surname, queue.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, n);
    }

}
