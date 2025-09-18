package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String welcomeToCalc() {
        return "Добро пожаловать в калькулятор";
    }

    public String answerHello(String userName) {
        return "<b>Ооо, </b>" + userName + " привет!";
    }

    public String plusOutput(int number1, int number2) {
        int sum = number1 + number2;
        return number1 + " + " + number2 + " = " + sum;
    }

    public String minusOutput(int number1, int number2) {
        int diff = number1 - number2;
        return number1 + " - " + number2 + " = " + diff;
    }
}
