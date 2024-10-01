import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa cualquier numero: ");
        int number = scanner.nextInt();
        scanner.close();

        LinkedHashMap<String, Integer> roman_numerals = new LinkedHashMap<>();
        roman_numerals.put("M", 1000);
        roman_numerals.put("CM", 900);
        roman_numerals.put("D", 500);
        roman_numerals.put("CD", 400);
        roman_numerals.put("C", 100);
        roman_numerals.put("XC", 90);
        roman_numerals.put("L", 50);
        roman_numerals.put("XL", 40);
        roman_numerals.put("X", 10);
        roman_numerals.put("IX", 9);
        roman_numerals.put("V", 5);
        roman_numerals.put("IV", 4);
        roman_numerals.put("I", 1);

        String res = "";

        for (Map.Entry<String, Integer> entry : roman_numerals.entrySet()) {
            int value = entry.getValue();
            while (number >= value) {
                res += entry.getKey();
                number -= value;
            }
        }

        System.out.println("Número en romano: " + res);
    }
}