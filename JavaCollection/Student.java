package Lesson8;

import java.util.Objects;

public class Student {
    private String sur;
    private String nam;
    private String otch;
    private int id;
    private int mark;

    public Student(String sur, String nam, String otch, int id, int mark) {
        this.sur = sur;
        this.nam = nam;
        this.otch = otch;
        this.id = id;
        this.mark = mark;
    }

    public String getSur() {
        return sur;
    }

    public void setSur(String sur) {
        this.sur = sur;
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    public String getOtch() {
        return otch;
    }

    public void setOtch(String otch) {
        this.otch = otch;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                mark == student.mark &&
                Objects.equals(sur, student.sur) &&
                Objects.equals(nam, student.nam) &&
                Objects.equals(otch, student.otch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sur, nam, otch, id, mark);
    }
}

