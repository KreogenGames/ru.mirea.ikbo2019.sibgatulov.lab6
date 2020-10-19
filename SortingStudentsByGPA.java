public class SortingStudentsByGPA extends Student implements Comparable<Student> {

    public SortingStudentsByGPA(String name, int id, int points) {
        super(name, id, points);
    }

    @Override
    public int compareTo(Student o) {
        return this.points.compareTo(o.points);
    }
}