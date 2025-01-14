package Generics;

public class Animal {
    private String species;
    private int age;

    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }

    @Override
    public String toString() {
        return species + ", на " + age + " години";
    }
}

