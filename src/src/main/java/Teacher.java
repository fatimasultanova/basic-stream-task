package src.main.java;

public class Teacher   {
    private String name ;

    private int age ;
    private String  role ;
    private String surname ;


    public Teacher(String name, int age, String role, String surname) {
        this.name = name;
        this.age = age;
        this.role = role;
        this.surname = surname;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 1 && age <=150){
        this.age = age;}

        else{
            throw new IllegalArgumentException("Yaş 1 və 150 arasında ola bilər!!!");
        }

    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", role='" + role + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
