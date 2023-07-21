import java.util.Scanner;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        String str = scaner.nextLine();
        try {
            str = calc(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(str);
    }

    public static String calc(String input) throws IOException {
        int number1, number2, solution, romeNumber1, romeNumber2;
        romeNumber1 = 0;
        romeNumber2 = 0;
        String[] array = input.split(" ");
        if (array.length != 3) {
            throw new IOException();
        }
        switch (array[0]) {
            case "1" -> number1 = 1;
            case "2" -> number1 = 2;
            case "3" -> number1 = 3;
            case "4" -> number1 = 4;
            case "5" -> number1 = 5;
            case "6" -> number1 = 6;
            case "7" -> number1 = 7;
            case "8" -> number1 = 8;
            case "9" -> number1 = 9;
            case "10" -> number1 = 10;
            case "I" -> {
                number1 = 1;
                romeNumber1 = 1;
            }
            case "II" -> {
                number1 = 2;
                romeNumber1 = 1;
            }
            case "III" -> {
                number1 = 3;
                romeNumber1 = 1;
            }
            case "IV" -> {
                number1 = 4;
                romeNumber1 = 1;
            }
            case "V" -> {
                number1 = 5;
                romeNumber1 = 1;
            }
            case "VI" -> {
                number1 = 6;
                romeNumber1 = 1;
            }
            case "VII" -> {
                number1 = 7;
                romeNumber1 = 1;
            }
            case "VIII" -> {
                number1 = 8;
                romeNumber1 = 1;
            }
            case "IX" -> {
                number1 = 9;
                romeNumber1 = 1;
            }
            case "X" -> {
                number1 = 10;
                romeNumber1 = 1;
            }
            default -> throw new IOException();
        }
        switch (array[2]) {
            case "1" -> number2 = 1;
            case "2" -> number2 = 2;
            case "3" -> number2 = 3;
            case "4" -> number2 = 4;
            case "5" -> number2 = 5;
            case "6" -> number2 = 6;
            case "7" -> number2 = 7;
            case "8" -> number2 = 8;
            case "9" -> number2 = 9;
            case "10" -> number2 = 10;
            case "I" -> {
                number2 = 1;
                romeNumber2 = 1;
            }
            case "II" -> {
                number2 = 2;
                romeNumber2 = 1;
            }
            case "III" -> {
                number2 = 3;
                romeNumber2 = 1;
            }
            case "IV" -> {
                number2 = 4;
                romeNumber2 = 1;
            }
            case "V" -> {
                number2 = 5;
                romeNumber2 = 1;
            }
            case "VI" -> {
                number2 = 6;
                romeNumber2 = 1;
            }
            case "VII" -> {
                number2 = 7;
                romeNumber2 = 1;
            }
            case "VIII" -> {
                number2 = 8;
                romeNumber2 = 1;
            }
            case "IX" -> {
                number2 = 9;
                romeNumber2 = 1;
            }
            case "X" -> {
                number2 = 10;
                romeNumber2 = 1;
            }
            default -> throw new IOException();
        }
        switch (array[1]) {
            case "+" -> solution = number1 + number2;
            case "-" -> solution = number1 - number2;
            case "*" -> solution = number1 * number2;
            case "/" -> solution = number1 / number2;
            default -> throw new IOException();
        }
        if (romeNumber1 == 0 && romeNumber2 == 0) {
            input = Integer.toString(solution);
        }
        else if (romeNumber1 == 1 && romeNumber2 == 1 && solution > 0) {
            input = "";
            if (solution >= 100) {
                solution = solution - 100;
                input = input + "C";
            }
            if (solution >= 90) {
                solution = solution - 90;
                input = input + "XC";
            }
            if (solution >= 50) {
                solution = solution - 50;
                input = input + "L";
            }
            if (solution >= 40) {
                solution = solution - 40;
                input = input + "XL";
            }
            while (solution>=10) {
                solution = solution -10;
                input = input + "X";
            }
            switch (solution) {
                case 9 ->  input = input + "IX";
                case 8 -> input = input + "VIII";
                case 7 -> input = input + "VII";
                case 6 -> input = input + "VI";
                case 5 -> input = input + "V";
                case 4 -> input = input + "IV";
                case 3 -> input = input + "III";
                case 2 -> input = input + "II";
                case 1 -> input = input + "I";
            }
        }
        else {
            throw new IOException();
        }
        return input;
    }
}
