package ru.beganov;

class ArabicNumbersCalc implements Calculating {
    static boolean isRomanExpected;
    static void arabicCalculation(String a, String b, String symbol) throws Exception {
        int num1, num2, result;
        if (isNumeric(a) && isNumeric(b)) {
            num1 = Integer.parseInt(a);
            num2 = Integer.parseInt(b);
            isRomanExpected = false;
            result = Calculating.calculating(num1, num2, symbol);
            System.out.println("Результат арабских цифр: " + num1 + " " + symbol
                    + " " + num2 + " = " + result);
        }else {
            throw new IllegalArgumentException("Используются одновременно разные системы счисления");
        }
    }

    static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
