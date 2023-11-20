package src.main.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(3, 9, 8, 18, 120, 78, 34, 22, 11, 3, 5, 8, 10, 4, 5, 5, 25, 35, 67);
        List<String> strings = Arrays.asList("Java", "SysTem", "Hello", "World", "Lock", "syNchronIzed", "DeadLoCK", "VolATile", "fInal", "test", "DivAcademY", "PaTtern");

        List<Student> studentList = Student.generateFixedStudents();
//listler bu şekilde olacaqdır


    }

    public static List<Integer> findEvenNumbers(List<Integer> list) { //listdəki cüt ededleri  filter istifade ederek tapın
        return list.stream()
                .filter(val -> val % 2 == 0)     //bu hisseni tamamlayın
                .collect(Collectors.toList());

    }

    public static List<Integer> findOddNumbers(List<Integer> list) {//listdəki tək ededleri  filter istifade ederek tapın
        return list.stream()
                .filter(val -> val % 2 == 1).
                collect(Collectors.toList());
    }

    public static List<String> findStringsStartingWithS(List<String> list) {//Listdəki 's' və ya 'S' (boyuk kick ferqi yoxdur) ilə başlayan sözləri tapın
        return list.stream()
                .filter(val -> val.startsWith("S") || val.startsWith("s"))
                .collect(Collectors.toList());
    }

    public static Integer findMaxInt(List<Integer> list) { //listdəki en boyuk ededi tapin
        return list.stream()
                .max(Comparator.comparing(Integer::intValue))
                .orElse(null);
    }

    public static Integer findMinInt(List<Integer> list) { //listdeki en kicik ededi tapın
        return list.stream()
                .min(Comparator.comparing(Integer::intValue))
                .orElse(null);
    }

    public static Integer findSum(List<Integer> list) { //listdeki ededlerin cemini tapın
        return list.stream()
                .reduce(Integer::sum).get();
    }

    public static double findAverage(List<Integer> list) { // listdəki bütün ededlerin ortalamasını tapın
        Integer integer = list.stream()
                .reduce(Integer::sum).get();
        return (double) integer / list.size();
    }

    public static String findLongestString(List<String> list) { //lisdəki en uzun sözü tapın
        return list.stream()
                .max(Comparator.comparing(String::length))
                .orElse("");
    }

    public static long countStringsWithLetterO(List<String> list) { //listdeki neçe sözdə 'o' hərfi olduğunu tapın
        return ((long) list.stream()
                .filter(val -> val.contains("o") || val.contains("O"))
                .toArray().length);

    }

    public static List<Integer> findDistinctElements(List<Integer> list) { // təkrarlanmayan ededleri çıxışa verin (qeyd meselen 1 2 3 4 4 3 3  bele bir list verilibse 1 2 3 4 cixisa verilmelidir)
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }


    public static List<Student> findStudentsWithAge(List<Student> students) {  // yaşı 20 olan studentleri tapın
        return students.stream()
                .filter(student -> student.getAge() == 20) // bu hisseni tamamlayin
                .collect(Collectors.toList());
    }

    public static List<Student> findStudentsWithName(List<Student> students) { //adı Ali olan studentleri tapın
        return students.stream()
                .filter(student -> student.getName().equalsIgnoreCase("ali"))
                .collect(Collectors.toList());
    }

    public static List<Student> findStudentsWithSurname(List<Student> students) { // soyadı Malikova olan studentleri tapin
        return students.stream()
                .filter(student -> student.getSurname().equalsIgnoreCase("Malikova"))
                .collect(Collectors.toList());
    }

    public static List<Student> findStudentsWithTeacher(List<Student> students) { // muelliminin adı "Muellim 2" olan studentleri tapın
        return students.stream()
                .filter(student -> student.getTeacher().getName().equalsIgnoreCase("Muellim 2")) // bu hisseni tamamlayin
                .collect(Collectors.toList());
    }

    public static List<Student> findStudentsInRange(List<Student> students) { // yaşları 22 ilə 27 arası olan studentleri tapın
        return students.stream()
                .filter(student -> student.getAge() > 22 && student.getAge() < 27)
                .collect(Collectors.toList());
    }


    public static List<String> getStudentNames(List<Student> students) {  // bütün studentlerin adlarını yazdırın
        return students.stream()
                .map(Student::getName)
                .collect(Collectors.toList());
    }


    public static List<String> getStudentsFullNameWithTeacher(List<Student> students) { // bütün telebelerin adları və soyadlarını + müelliminin adini yazdırın
        return students.stream()
                .map(student -> student.getName() + " " + student.getSurname() +" - " + student.getTeacher().getName()).
                collect(Collectors.toList());

    }
}



