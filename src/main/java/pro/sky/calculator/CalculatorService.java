package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {


    public String welcomeToCalc() {
        return "Добро пожаловать в калькулятор";
    }

    public boolean checkForEmpty(Integer number1, Integer number2) {
        return number1 != null && number2 != null;
    }

    public String plusOutput(Integer number1, Integer number2) {
        if (checkForEmpty(number1, number2)) {
            int sum = number1 + number2;
            return number1 + " + " + number2 + " = " + sum;
        } else {
            return "Не хватает числа для выполнения данного действия!";
        }
    }

    public String minusOutput(Integer number1, Integer number2) {
        if (checkForEmpty(number1, number2)) {
            int diff = number1 - number2;
            return number1 + " - " + number2 + " = " + diff;
        } else {
            return "Не хватает числа для выполнения данного действия!";
        }
    }

    public String multiplyOutput(Integer number1, Integer number2) {
        if (checkForEmpty(number1, number2)) {
            int mult = number1 * number2;
            return number1 + " * " + number2 + " = " + mult;
        } else {
            return "Не хватает числа для выполнения данного действия!";
        }
    }

    public String divideOutput(Integer number1, Integer number2) {
        if (checkForEmpty(number1, number2)) {
            if (number2 == 0) {
                return "Деление на ноль невозможно!";
            } else {
                int divide = number1 / number2;
                return number1 + " / " + number2 + " = " + divide;
            }
        } else {
            return "Не хватает числа для выполнения данного действия!";

        }
    }
}
