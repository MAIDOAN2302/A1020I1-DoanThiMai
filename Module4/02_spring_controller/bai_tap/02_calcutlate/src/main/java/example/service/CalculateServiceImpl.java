package example.service;

import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements CalculateService{
    @Override
    public double calculate(double numberOne, double numberTwo, String operator) {
        switch (operator){
            case "+":
                return numberOne + numberTwo;
            case "-":
                return numberOne - numberTwo;
            case "*":
                return numberOne * numberTwo;
            case "/":
                if (numberTwo!=0){
                    return numberOne / numberTwo;
                }else {
                    throw new ArithmeticException("Division by zero");
                }
        }
        return 0;
    }
}
