package example.service;

import org.springframework.stereotype.Service;

@Service
public interface CalculateService {
    double calculate(double number1, double number2, String operator) throws Exception;
}
