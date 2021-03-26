package ArabicRomanCalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/***    1. Получить строку из консоли - done
        2. Распарсить строку - done
        3. Понять, первое число римское или арабское? - done
        4. Перевести римские в арабские - done
        5.1 Понять, какую операцию необходимо провести - done
        5.2 Выполнить математическую операцию - done
        6. Вывести результат(если введены римские, то в римских) - done */
public class ArabicRomanCalculator {
    static int firstNumber;
    static int secondNumber;
    static int resultOfOperation;
    static boolean typeOfNumbers;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String stringForParsing = bufferedReader.readLine();              // записываем ввод с консоли в переменную stringForParsing
        String[] parsedStringArray = stringForParsing.split(" ");   // парсим строки по разделителю в массив строк

        typeOfNumbers = numbersTypeConverter.numIsArabicOr(parsedStringArray[0]);

        if(!typeOfNumbers) {                                               // если числа римские, то переводим в арабские
            firstNumber = numbersTypeConverter.romanArabicConverter(parsedStringArray[0]);
            secondNumber = numbersTypeConverter.romanArabicConverter(parsedStringArray[2]);
        } else {
            firstNumber = Integer.parseInt(parsedStringArray[0]);
            secondNumber = Integer.parseInt(parsedStringArray[2]);
        }

        if(parsedStringArray[1].equals("+")) resultOfOperation = Operations.plus(firstNumber, secondNumber); // производим операцию
        if(parsedStringArray[1].equals("-")) resultOfOperation = Operations.minus(firstNumber, secondNumber);
        if(parsedStringArray[1].equals("/")) resultOfOperation = Operations.divide(firstNumber, secondNumber);
        if(parsedStringArray[1].equals("*")) resultOfOperation = Operations.multiply(firstNumber, secondNumber);

        if(typeOfNumbers) {
            System.out.println(resultOfOperation);
        } else {
            System.out.println(numbersTypeConverter.romanArabicConverter(resultOfOperation));
        }

    }
    private static class numbersTypeConverter {
        public static final String[] romeNums = {
                "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "XLX",
                "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

        public static boolean numIsArabicOr(String number) {               //число римское или арабское?

            for (String num : romeNums) {
                if (number.equals(num)) {
                    return false;
                }
            }
            return true;
        }

        public static int romanArabicConverter(String romeNum) {             //из римских в арабские
            int result = 0;
            for (int i = 0; i < romeNums.length; i++) {
                if (romeNum.equals(romeNums[i])) {
                    result = i + 1;
                    break;
                }
            }
            return result;
        }


        public static String romanArabicConverter(int arabicNum) {          // из арабских в римские
            return romeNums[arabicNum - 1];

        }
    }
        public static class Operations {

            public static int plus(int a, int b) { return a + b; }
            public static int minus(int a, int b) {
                return a - b;
            }
            public static int divide(int a, int b) {
                return a / b;
            }
            public static int multiply(int a, int b) {
                return a * b;
            }


        }


}
