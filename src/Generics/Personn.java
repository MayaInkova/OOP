package Generics;

public class Personn {
    private String name;
    private int age;

    public Personn(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ", " + age + " години";
    }
}

