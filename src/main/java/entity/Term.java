package entity;

import java.util.ArrayList;
import java.util.Objects;

public class Term {
    private int id;
    private String name;
    private String duration;
    private int status;
    private ArrayList<Discipline> disciplines = new ArrayList<>();

    public Term() {
    }

    public Term(int id, String name, String duration) {
        this.id = id;
        this.name = name;
        this.duration = duration;
    }
    public void addDiscipline (Discipline discipline){
        disciplines.add(discipline);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public ArrayList<Discipline> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(ArrayList<Discipline> disciplines) {
        this.disciplines = disciplines;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Term)) return false;
        Term term = (Term) o;
        return getId() == term.getId() && getStatus() == term.getStatus() && Objects.equals(getName(), term.getName()) && Objects.equals(getDuration(), term.getDuration()) && Objects.equals(getDisciplines(), term.getDisciplines());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getDuration(), getStatus(), getDisciplines());
    }

    @Override
    public String toString() {
        return "Term{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", duration='" + duration + '\'' +
                ", status=" + status +
                ", disciplines=" + disciplines +
                '}';
    }

}
