package Lesson3.Task3;

public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[2];
        students[0] = new Aspirant("Петя", "Иванов", 4.6);
        students[1] = new Student("Алеша", "Попович", 5);

        for(Student arr : students) {
            System.out.println(arr.firstName + " " + arr.lastName + " стипендия " + arr.getScholarship());

        }

    }
}
