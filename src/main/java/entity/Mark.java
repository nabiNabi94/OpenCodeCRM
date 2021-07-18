package entity;

import java.util.Objects;

public class Mark {
    private int id;
    private Student student;
    private Term term;
    private Discipline discipline;
    private int mark;

    public Mark(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Term getTerm() {
        return term;
    }

    public void setTerm(Term term) {
        this.term = term;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
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
        if (!(o instanceof Mark)) return false;
        Mark mark1 = (Mark) o;
        return getId() == mark1.getId() && getMark() == mark1.getMark() && Objects.equals(getStudent(), mark1.getStudent()) && Objects.equals(getTerm(), mark1.getTerm()) && Objects.equals(getDiscipline(), mark1.getDiscipline());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getStudent(), getTerm(), getDiscipline(), getMark());
    }

    @Override
    public String toString() {
        return "Mark{" +
                "id=" + id +
                ", student=" + student +
                ", term=" + term +
                ", discipline=" + discipline +
                ", mark=" + mark +
                '}';
    }
}
