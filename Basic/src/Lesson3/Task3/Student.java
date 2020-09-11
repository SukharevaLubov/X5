package Lesson3.Task3;

public class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;

    public Student(String firstName, String lastName, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.averageMark = averageMark;
    }

    public int getScholarship() {
       int Scholarship;
       if(this.averageMark == 5) {
           Scholarship = 100;
        } else Scholarship = 80;
       return Scholarship;
    }
}
