package lesson10;

public class SubstituteTeacher extends Person{
    private String schedule;

    public SubstituteTeacher(String name, String lastName, int year, String schedule) {
        super(name, lastName, year);
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
}
