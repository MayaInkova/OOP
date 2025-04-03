package Tasks;


//1. Напишете Java програма, за да обърнете низ, без да използвате вградена функция
//reverse ().
//Допълнителни ограничения: Да не се използват StringBuilder или StringBuffer. Низът може да
//съдържа кирилица, емоджита и специални символи.


//Решение:
//След като нямам право да използвам reverse(), ще преобразувам масива в низ от символи
//Ще разменя символите от двата края към средата, след това създаавам нов низ вече от обърнатия масив,четем и отпечатваме
//обърнатия низ, тоест обръщам даден низ ръчно, без да използва вградени методи като reverse().

import java.util.Scanner;

public class Reverse01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();


        System.out.println("Reversed а string: " + reverse(input));

    }

    public static String reverse(String input) {
        char[] chars = input.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
    }
}




