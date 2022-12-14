package model;

public class Student {
    String name;
    int age;
    String gender;
    int id;

    public Student(String name, int age, String gender, int id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getId() {
        return id;
    }
}
