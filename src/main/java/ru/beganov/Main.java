package ru.beganov;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ввдите только арабские или римские цифры одновременно: ");
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();
                if (input.length() <= 1)
                    throw new IllegalArgumentException("строка не является математической операцией");
                calc(input);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    public static String calc(String input) throws Exception {
        String[] array = input.split(" ");
        String num1 = array[0];
        String symbol = array[1];
        String num2 = array[2];


        try {
            if (array.length >= 4)
                throw new IllegalArgumentException("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            if (RomeNumbers.adds(num1) && RomeNumbers.adds(num2)) {
                RomeNumbersCalc.romeCalculation(num1, num2, symbol);
            } else {
                ArabicNumbersCalc.arabicCalculation(num1, num2, symbol);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return Arrays.toString(array);
    }

}
