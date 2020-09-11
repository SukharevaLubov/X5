package Lesson3.Task3;

public class Aspirant extends Student{
    String scienceWork;

    public Aspirant(String firstName, String lastName, double averageMark) {
        super(firstName, lastName, averageMark);
    }

    public int getScholarship() {
        int Scholarship;
        if(this.averageMark == 5) {
            Scholarship = 200;
        } else Scholarship = 180;
        return Scholarship;
    }
}
