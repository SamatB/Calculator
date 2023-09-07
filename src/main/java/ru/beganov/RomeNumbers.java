package ru.beganov;

import java.util.ArrayList;
import java.util.List;

class RomeNumbers {
    static List<String> romes = new ArrayList<>();

    static boolean adds(String numbers) {
        romes.add("O");
        romes.add("I");
        romes.add("II");
        romes.add("III");
        romes.add("IV");
        romes.add("V");
        romes.add("VI");
        romes.add("VII");
        romes.add("VIII");
        romes.add("IX");
        romes.add("X");
        for (String rome : romes) {
            if (numbers.equals(rome)) return true;
        }
        return false;
    }

    static boolean isRoman(String str) {
        return romes.contains(str);
    }

    static String romeNums(int arabNums) {
        String[] romeNumbers = {"O", "I", "II",
                "III", "IV", "V", "VI", "VII", "VIII",
                "IX", "X", "XI", "XII",
                "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI",
                "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII",
                "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        return romeNumbers[arabNums];
    }


    static int romeNumsToArabicNums(String romeNumbers) throws Exception {
        switch (romeNumbers) {
            case "O" -> {
                return 0;
            }
            case "I" -> {
                return 1;
            }
            case "II" -> {
                return 2;
            }
            case "III" -> {
                return 3;
            }
            case "IV" -> {
                return 4;
            }
            case "V" -> {
                return 5;
            }
            case "VI" -> {
                return 6;
            }
            case "VII" -> {
                return 7;
            }
            case "VIII" -> {
                return 8;
            }
            case "IX" -> {
                return 9;
            }
            case "X" -> {
                return 10;
            }
        }
        throw new Exception("Введите правильно!");
    }
}
