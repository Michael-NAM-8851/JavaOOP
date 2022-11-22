import model.*;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("test", 10, "male", 123);

        System.out.printf("name:%s\nage:%d\ngender:%s\nid:%d", student.getName(),student.getAge(), student.getGender(), student.getId());

    }
}