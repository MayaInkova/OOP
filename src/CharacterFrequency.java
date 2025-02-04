import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        // Създаване на Map за съхранение на честотата на символите
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Опит за четене на файла с BufferedReader и FileReader
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            int character;
            // Четене символ по символ, докато не достигнем края на файла
            while ((character = reader.read()) != -1) {
                char ch = (char) character;
                // Ако символът вече съществува в картата, увеличаваме честотата с 1
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }
        } catch (IOException e) {
            // Обработка на изключение при проблем с четенето на файла
            System.out.println("Грешка при четене на файла: " + e.getMessage());
        }

        // Извеждане на честотата на символите в конзолата
        System.out.println("Честота на символите във файла:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Символ: '" + entry.getKey() + "' -> " + entry.getValue());
        }
    }
}
