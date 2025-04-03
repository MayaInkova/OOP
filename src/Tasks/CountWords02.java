package Tasks;

//2. Напишете Java програма, за да преброите броя на думите в низ, използвайки HashMap.

//Допълнителни ограничения: Да се игнорират главни/малки букви, препинателни знаци
//(.,!?). Да се поддържа подредба на думите по честота. Ако две думи имат еднаква честота, да
//се сортират по азбучен ред.

//Решение:Ще създам метод за преброяване на броя на думите в низа, използвайки регулярен израз за премахване на препинателни знаци главни/малки букви
//Думите се подреждат по честота в низходящ ред , а ако честотите са равни по азбучен ред( А Б В...)
//Ще създам и HeshMap за броене на думите

import java.util.*;
import java.util.regex.*;

public class CountWords02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = scanner.nextLine();
        scanner.close();

        List<Map.Entry<String, Integer>> result = countWords(input);

        System.out.println("Word frequency:");
        for (Map.Entry<String, Integer> entry : result) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static List<Map.Entry<String, Integer>> countWords(String text) {
        Pattern pattern = Pattern.compile("\\p{L}+");
        Matcher matcher = pattern.matcher(text.toLowerCase());

        Map<String, Integer> wordCountMap = new HashMap<>();

        while (matcher.find()) {
            String word = matcher.group();
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }


        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(wordCountMap.entrySet());
        sortedEntries.sort((a, b) -> {
            if (!a.getValue().equals(b.getValue())) {
                return b.getValue() - a.getValue();
            }
            return a.getKey().compareTo(b.getKey());
        });

        return sortedEntries;
    }
}
