package lesson7;

public class Person {
    private String name;
    private int age;

    Person() {
        name = "Dude";
        age = 29;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void move() {
        System.out.printf("%s двигается\n", name);
    }

    public void talk() {
        System.out.printf("%s говорит\n", name);
    }
}
