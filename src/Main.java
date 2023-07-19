import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        String str = scaner.nextLine();
        str = calc(str);
        System.out.println(str);
    }

    public static String calc(String input) {
        int number1, number2, solution, romeNumber1, romeNumber2;
        romeNumber1 = 0;
        romeNumber2 = 0;
        String array[] = input.split(" ");
        if (array.length != 3) {
            input = "throws Exception";
            return input;
        }
        switch (array[0]) {
            case "1":
                number1 = 1;
                break;
            case "2":
                number1 = 2;
                break;
            case "3":
                number1 = 3;
                break;
            case "4":
                number1 = 4;
                break;
            case "5":
                number1 = 5;
                break;
            case "6":
                number1 = 6;
                break;
            case "7":
                number1 = 7;
                break;
            case "8":
                number1 = 8;
                break;
            case "9":
                number1 = 9;
                break;
            case "10":
                number1 = 10;
                break;
            case "I":
                number1 = 1;
                romeNumber1 = 1;
                break;
            case "II":
                number1 = 2;
                romeNumber1 = 1;
                break;
            case "III":
                number1 = 3;
                romeNumber1 = 1;
                break;
            case "IV":
                number1 = 4;
                romeNumber1 = 1;
                break;
            case "V":
                number1 = 5;
                romeNumber1 = 1;
                break;
            case "VI":
                number1 = 6;
                romeNumber1 = 1;
                break;
            case "VII":
                number1 = 7;
                romeNumber1 = 1;
                break;
            case "VIII":
                number1 = 8;
                romeNumber1 = 1;
                break;
            case "IX":
                number1 = 9;
                romeNumber1 = 1;
                break;
            case "X":
                number1 = 10;
                romeNumber1 = 1;
                break;
            default: {
                input = "throws Exception";
                return input;
            }
        }
        switch (array[2]) {
            case "1":
                number2 = 1;
                break;
            case "2":
                number2 = 2;
                break;
            case "3":
                number2 = 3;
                break;
            case "4":
                number2 = 4;
                break;
            case "5":
                number2 = 5;
                break;
            case "6":
                number2 = 6;
                break;
            case "7":
                number2 = 7;
                break;
            case "8":
                number2 = 8;
                break;
            case "9":
                number2 = 9;
                break;
            case "10":
                number2 = 10;
                break;
            case "I":
                number2 = 1;
                romeNumber2 = 1;
                break;
            case "II":
                number2 = 2;
                romeNumber2 = 1;
                break;
            case "III":
                number2 = 3;
                romeNumber2 = 1;
                break;
            case "IV":
                number2 = 4;
                romeNumber2 = 1;
                break;
            case "V":
                number2 = 5;
                romeNumber2 = 1;
                break;
            case "VI":
                number2 = 6;
                romeNumber2 = 1;
                break;
            case "VII":
                number2 = 7;
                romeNumber2 = 1;
                break;
            case "VIII":
                number2 = 8;
                romeNumber2 = 1;
                break;
            case "IX":
                number2 = 9;
                romeNumber2 = 1;
                break;
            case "X":
                number2 = 10;
                romeNumber2 = 1;
                break;
            default: {
                input = "throws Exception";
                return input;
            }
        }
        switch (array[1]) {
            case "+": {
                solution = number1 + number2;
                break;
            }
            case "-": {
                solution = number1 - number2;
                break;
            }
            case "*": {
                solution = number1 * number2;
                break;
            }
            case "/": {
                solution = number1 / number2;
                break;
            }
            default: {
                input = "throws Exception";
                return input;
            }
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
            while (solution>=10) {
                solution = solution -10;
                input = input + "X";
            }
            switch (solution) {
                case 9: {
                    input = input + "IX";
                    break;
                }
                case 8: {
                    input = input + "VIII";
                    break;
                }
                case 7: {
                    input = input + "VII";
                    break;
                }
                case 6: {
                    input = input + "VI";
                    break;
                }
                case 5: {
                    input = input + "V";
                    break;
                }
                case 4: {
                    input = input + "IV";
                    break;
                }
                case 3: {
                    input = input + "III";
                    break;
                }
                case 2: {
                    input = input + "II";
                    break;
                }
                case 1: {
                    input = input + "I";
                    break;
                }
            }
        }
        else {
            input = "throws Exception";
            return input;
        }
        return input;
    }
}