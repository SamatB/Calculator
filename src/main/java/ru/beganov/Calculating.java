package ru.beganov;

interface Calculating {
    static int calculating(int a, int b, String c) throws Exception {

        int result;
        boolean config = (a >= 0 & a <= 10) && (b >= 0 & b <= 10);
        if (config) {
            result = switch (c) {
                case "+" -> a + b;
                case "-" -> a - b;
                case "*" -> a * b;
                case "/" -> a / b;
                default -> throw new RuntimeException("Нужно вводить правивольное арифметическое значение!");
            };
        } else {
            throw new ArrayIndexOutOfBoundsException("Вводимые цифры должны быть в пределах от 0 до 10!");
        }
        return result;
    }

}
