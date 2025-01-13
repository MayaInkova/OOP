package Generics;




public class Box<T> {
    private T item;

    // Метод за задаване на елемент
    public void setItem(T item) {
        this.item = item;
    }

    // Метод за получаване на елемент
    public T getItem() {
        return item;
    }

    // Пренаписване на toString за показване на съдържанието на кутията
    @Override
    public String toString() {
        return "Кутия съдържа: " + item;
    }

    public static void main(String[] args) {


        // Кутия за съхранение на цели числа
        Box<Integer> intBox = new Box<>();
        intBox.setItem(123);
        System.out.println(intBox);

        // Кутия за съхранение на низове
        Box<String> strBox = new Box<>();
        strBox.setItem("Здравей Generics!");
        System.out.println(strBox);

        // Кутия за потребителски обект
        Box<Person> personBox = new Box<>();
        personBox.setItem(new Person("Алис", 25));
        System.out.println(personBox);
    }
}

// Прост потребителски клас за демонстрация
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ", " + age + " години";
    }
}
