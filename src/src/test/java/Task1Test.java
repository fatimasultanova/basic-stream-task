package src.test.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.main.java.Student;
import src.main.java.Task1;

import java.util.Arrays;
import java.util.List;


public class Task1Test {

    @Test
    public void testFindEvenNumbers() {
        List<Integer> input = Arrays.asList(3, 9, 8, 18, 120, 78, 34, 22, 11, 3, 5, 8, 10, 4, 5, 5, 25, 35, 67);
        List<Integer> expectedOutput = Arrays.asList(8, 18, 120, 78, 34, 22, 8, 10, 4);
        List<Integer> actualOutput = Task1.findEvenNumbers(input);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testFindOddNumbers() {
        List<Integer> input = Arrays.asList(3, 9, 8, 18, 120, 78, 34, 22, 11, 3, 5, 8, 10, 4, 5, 5, 25, 35, 67);
        List<Integer> expectedOutput = Arrays.asList(3, 9, 11, 3, 5, 5, 5, 25, 35, 67);
        List<Integer> actualOutput = Task1.findOddNumbers(input);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testFindStringsStartingWithS() {
        List<String> input = Arrays.asList("Java", "SysTem", "Hello", "World", "Lock", "syNchronIzed", "DeadLoCK", "VolATile", "fInal", "test", "DivAcademY", "PaTtern");
        List<String> expectedOutput = Arrays.asList("SysTem", "syNchronIzed");
        List<String> actualOutput = Task1.findStringsStartingWithS(input);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testFindMaxInt() {
        List<Integer> input = Arrays.asList(3, 9, 8, 18, 120, 78, 34, 22, 11, 3, 5, 8, 10, 4, 5, 5, 25, 35, 67);
        Integer expectedOutput = 120;
        Integer actualOutput = Task1.findMaxInt(input);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testFindMinInt() {
        List<Integer> input = Arrays.asList(3, 9, 8, 18, 120, 78, 34, 22, 11, 3, 5, 8, 10, 4, 5, 5, 25, 35, 67);
        Integer expectedOutput = 3;
        Integer actualOutput = Task1.findMinInt(input);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testFindSum() {
        List<Integer> input = Arrays.asList(3, 9, 8, 18, 120, 78, 34, 22, 11, 3, 5, 8, 10, 4, 5, 5, 25, 35, 67);
        Integer expectedOutput = 470;
        Integer actualOutput = Task1.findSum(input);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testFindAverage() {
        List<Integer> input = Arrays.asList(3, 9, 8, 18, 120, 78, 34, 22, 11, 3, 5, 8, 10, 4, 5, 5, 25, 35, 67);
        Double expectedOutput = 24.736842105263158;
        Double actualOutput = Task1.findAverage(input);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testFindLongestString() {
        List<String> input = Arrays.asList("Java", "SysTem", "Hello", "World", "Lock", "syNchronIzed", "DeadLoCK", "VolATile", "fInal", "test", "DivAcademY", "PaTtern");
        String expectedOutput = "syNchronIzed";
        String actualOutput = Task1.findLongestString(input);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testCountStringsWithLetterO() {
        List<String> input = Arrays.asList("Java", "SysTem", "Hello", "World", "Lock", "syNchronIzed", "DeadLoCK", "VolATile", "fInal", "test", "DivAcademY", "PaTtern");
        long expectedOutput = 6;
        long actualOutput = Task1.countStringsWithLetterO(input);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testFindDistinctElements() {
        List<Integer> input = Arrays.asList(3, 9, 8, 18, 120, 78, 34, 22, 11, 3, 5, 8, 10, 4, 5, 5, 25, 35, 67);
        List<Integer> expectedOutput = Arrays.asList(3, 9, 8, 18, 120, 78, 34, 22, 11, 5, 10, 4, 25, 35, 67);
        List<Integer> actualOutput = Task1.findDistinctElements(input);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testFindStudentsWithAge() {
        List<Student> students = Student.generateFixedStudents();
        List<Student> studentsWithAge20 = Task1.findStudentsWithAge(students);
        Assertions.assertEquals(1, studentsWithAge20.size());
        Assertions.assertEquals(20, studentsWithAge20.get(0).getAge());
    }

    @Test
    public void testFindStudentsWithName() {
        List<Student> students = Student.generateFixedStudents();
        List<Student> studentsWithNameAli = Task1.findStudentsWithName(students);
        Assertions.assertEquals(1, studentsWithNameAli.size());
        Assertions.assertEquals("Ali", studentsWithNameAli.get(0).getName());
    }

    @Test
    public void testFindStudentsWithSurname() {
        List<Student> students = Student.generateFixedStudents();
        List<Student> studentsWithSurnameMalikova = Task1.findStudentsWithSurname(students);
        Assertions.assertEquals(1, studentsWithSurnameMalikova.size());
        Assertions.assertEquals("Malikova", studentsWithSurnameMalikova.get(0).getSurname());
    }

    @Test
    public void testFindStudentsWithTeacher() {
        List<Student> students = Student.generateFixedStudents();
        List<Student> studentsWithTeacherMuellim2 = Task1.findStudentsWithTeacher(students);
        Assertions.assertEquals(3, studentsWithTeacherMuellim2.size());
        for (Student student : studentsWithTeacherMuellim2) {
            Assertions.assertEquals("Muellim 2", student.getTeacher().getName());
        }
    }

    @Test
    public void testFindStudentsInRange() {
        List<Student> students = Student.generateFixedStudents();
        List<Student> studentsInRange = Task1.findStudentsInRange(students);
        for (Student student : studentsInRange) {
            int age = student.getAge();
            Assertions.assertTrue(age >= 22 && age <= 27);
        }
    }

    @Test
    public void testGetStudentNames() {
        List<Student> students = Student.generateFixedStudents();
        List<String> studentNames = Task1.getStudentNames(students);
        Assertions.assertEquals(8, studentNames.size());
        Assertions.assertEquals("Ali", studentNames.get(0));
        Assertions.assertEquals("Nigar", studentNames.get(7));
    }

    @Test
    public void testGetStudentsFullNameWithTeacher() {
        List<Student> students = Student.generateFixedStudents();
        List<String> studentsFullNameWithTeacher = Task1.getStudentsFullNameWithTeacher(students);
        Assertions.assertEquals(8, studentsFullNameWithTeacher.size());
        Assertions.assertEquals("Ali Aliyev - Muellim 1", studentsFullNameWithTeacher.get(0));
        Assertions.assertEquals("Nigar Rasulova - Muellim 2", studentsFullNameWithTeacher.get(7));
    }

}
