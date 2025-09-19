package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String firstPage() {
        return calculatorService.welcomeToCalc();
    }

    @GetMapping(path = "calculator/plus")
    public String num1PlusNum2(@RequestParam(value = "num1", required = false) Integer number1, @RequestParam(value = "num2", required = false) Integer number2) {
        return calculatorService.plusOutput(number1, number2);

    }

    @GetMapping(path = "calculator/minus")
    public String num1MinusNum2(@RequestParam(value = "num1", required = false) Integer number1, @RequestParam(value = "num2", required = false) Integer number2) {
        return calculatorService.minusOutput(number1, number2);
    }

    @GetMapping(path = "calculator/multiply")
    public String num1MultiplyNum2(@RequestParam(value = "num1", required = false) Integer number1, @RequestParam(value = "num2", required = false) Integer number2) {
        return calculatorService.multiplyOutput(number1, number2);
    }

    @GetMapping(path = "calculator/divide")
    public String num1DivideNum2(@RequestParam(value = "num1", required = false) Integer number1, @RequestParam(value = "num2", required = false) Integer number2) {
        return calculatorService.divideOutput(number1, number2);
    }

}

