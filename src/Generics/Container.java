package Generics;


public class Container<T> {
    private T item;

    // Метод за задаване на елемент в контейнера
    public void setItem(T item) {
        this.item = item;
    }

    // Метод за получаване на елемент от контейнера
    public T getItem() {
        return item;
    }

    // Пренаписване на toString за показване на съдържанието на контейнера
    @Override
    public String toString() {
        return "Контейнерът съдържа: " + item;
    }

    public static void main(String[] args) {


        // Контейнер за цели числа
        Container<Integer> intContainer = new Container<>();
        intContainer.setItem(123);
        System.out.println(intContainer);

        // Контейнер за текстове
        Container<String> strContainer = new Container<>();
        strContainer.setItem("Здравей Generics!");
        System.out.println(strContainer);

        // Контейнер за потребителски обекти
        Container<Personn> personContainer = new Container<>();
        personContainer.setItem(new Personn("Алис", 25));
        System.out.println(personContainer);

        // Контейнер за продуктови обекти
        Container<Product> productContainer = new Container<>();
        productContainer.setItem(new Product("Ябълка", 1.20));
        System.out.println(productContainer);

        // Контейнер за животни
        Container<Animal> animalContainer = new Container<>();
        animalContainer.setItem(new Animal("Куче", 5));
        System.out.println(animalContainer);
    }
}
