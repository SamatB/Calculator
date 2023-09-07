package ru.beganov;

class ArabicNumbersCalc implements Calculating {
    static void arabicCalculation(String a, String b, String symbol) throws Exception {
        int num1, num2, result;

        num1 = Integer.parseInt(a);
        num2 = Integer.parseInt(b);
        result = Calculating.calculating(num1, num2, symbol);
        System.out.println("Результат арабских цифр: " + num1 + " " + symbol
                + " " + num2 + " = " + result);
    }
}
