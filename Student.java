public class Student implements Comparable<Student> {

    protected final String name;
    protected final Integer id;
    protected final Integer points;

    public Student(String name, int id, int points) {
        this.name = name;
        this.id = id;
        this.points = points;
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return "Student: " + this.name + ". ID: " + this.id + ". Points: " + this.points + ".";
    }
}