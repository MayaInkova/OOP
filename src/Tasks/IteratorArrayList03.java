package Tasks;

//3. Напишете Java програма, за да обходите ArrayList, използвайки for, while и Iterator. Да се
//сравни производителността.

//Решение:
//Създавам един ArrayList с примерни данни обхождам
// по трите начина с for,while and iterator след това сравнявам производителността

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorArrayList03 {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday"));


        System.out.println("\nIterator with for loop:");
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }


        System.out.println("\nIterator with while loop:");
        int index = 0;
        while (index < words.size()) {
            System.out.println(words.get(index));
            index++;
        }


        System.out.println("\nIterator with Iterator:");
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        comparePerformance(words);
    }

    public static void comparePerformance(List<String> words) {
        long startTime, endTime;


        startTime = System.nanoTime();
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("\nTime  for loop: " + (endTime - startTime) + " ns");


        startTime = System.nanoTime();
        int index = 0;
        while (index < words.size()) {
            String word = words.get(index);
            index++;
        }
        endTime = System.nanoTime();
        System.out.println("Time for while loop: " + (endTime - startTime) + " ns");


        startTime = System.nanoTime();
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
        }
        endTime = System.nanoTime();
        System.out.println("Време for Iterator: " + (endTime - startTime) + " ns");
    }
}

