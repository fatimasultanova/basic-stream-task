package src.main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {



    private String name ;
    private String surname ;
    private int age ;

    private Teacher teacher ;

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Student(String name, String surname, int age, Teacher teacher) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.teacher = teacher;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public static List<Student> generateFixedStudents() {
        List<String> names = Arrays.asList("Ali", "Fatma", "Mahammad", "Aysel", "Namiq", "Narmin", "Asgar", "Nigar");
        List<String> surnames = Arrays.asList("Aliyev", "Mammadov", "Huseynov", "Malikova", "Huseynli", "Mahmudov", "Nabiyev", "Rasulova");
        List<Teacher> teachers = Arrays.asList(
                new Teacher("Muellim 1", 30, "Riyaziyyat", "Kerimov"),
                new Teacher("Muellim 2", 35, "Fizika", "Aliyeva"),
                new Teacher("Muellim 3", 40, "Azerbaycan dili", "Mammadli")
        );

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            Student student = new Student(names.get(i), surnames.get(i), 18 + i);
            student.assignTeacher(teachers.get(i % teachers.size()));
            students.add(student);
        }

        return students;
    }

    public void assignTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", teacher=" + teacher +
                '}';
    }
}
