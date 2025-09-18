package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService = new CalculatorService();

    /*public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }*/

    @GetMapping(path = "/calculator")
    public String firstPage() {
        return calculatorService.welcomeToCalc();
    }

    @GetMapping(path = "/hello")
    public String answerHello(@RequestParam("name") String userName) {
        return calculatorService.answerHello(userName);
    }

    @GetMapping(path = "calculator/plus")
    public String num1PlusNum2(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculatorService.plusOutput(number1, number2);
    }

    @GetMapping(path = "calculator/minus")
    public String num1MinusNum2(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculatorService.minusOutput(number1, number2);
    }

}

