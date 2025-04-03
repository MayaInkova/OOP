package Tasks;


//4. Напишете Java програма, за да намерите дублиращите се символи в низ.
//Допълнителни ограничения: Да се намерят всички дублиращи се символи и брой срещания
//с едно преминаване на низа (O(n)). Да се предвиди различна кодировка на низа.

//Решение;
// Използвам HashMap с ключове от тип Character, за да запиша колко пъти се среща всеки символ в низа.
//Обхождам низа само веднъж,за да увелича броя на срешанията
import java.util.HashMap;
import java.util.Map;

public class Duplicate04 {
    public static void main(String[] args) {
        String input = "CGbhhjhEEeggg";

        findDuplicateCharacters(input);
    }

    public static void findDuplicateCharacters(String input) {
        Map<Character, Integer> charCount = new HashMap<>();


        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        System.out.println("Duplicate:");
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }
    }
}

