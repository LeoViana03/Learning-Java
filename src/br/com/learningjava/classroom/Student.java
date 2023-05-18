package br.com.learningjava.classroom;

public class Student {

    public Student(String name, int age, char gender, String register) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.register = register;

        presentation();
    }

    String name;
    int age;
    char gender;
    String register;

    public void presentation() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Register: " + register);
    }

    public boolean majority() {
        boolean majority = age >= 18;
        return majority;
    }

}
