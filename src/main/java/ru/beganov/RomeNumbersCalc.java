package ru.beganov;

class RomeNumbersCalc extends RomeNumbers implements Calculating {

    static boolean isRomanExpected;

    static void romeCalculation(String number1, String number2, String symbol) throws Exception {
        int num1;
        int num2;
        int result;
        try {
            if (RomeNumbers.isRoman(number1) && RomeNumbers.isRoman(number2)) {
                num1 = RomeNumbers.romeNumsToArabicNums(number1);
                num2 = RomeNumbers.romeNumsToArabicNums(number2);
                isRomanExpected = true;
                result = Calculating.calculating(num1, num2, symbol);
                if (result < 1)
                    throw new RuntimeException("В римской системе нет отрицательных чисел");
                String res = RomeNumbers.romeNums(result);
                String numb1 = RomeNumbers.romeNums(num1);
                String numb2 = RomeNumbers.romeNums(num2);
                System.out.println("Результат римских цифр: " + numb1 + " " + symbol
                        + " " + numb2 + " = " + res);
            } else {
                throw new IllegalArgumentException("Используются одновременно разные системы счисления");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
