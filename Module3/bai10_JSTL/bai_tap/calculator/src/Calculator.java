public class Calculator {
    public static float calculator(float numberOne, float numberTwo, char operator){
        switch (operator){
            case '+':
                return numberOne + numberTwo;
            case '-':
                return numberOne - numberTwo;
            case '*':
                return numberOne * numberTwo;
            case '/':
                if (numberTwo!= 0){
                    return numberOne/numberTwo;
                }else
                    throw new RuntimeException("Loi chi cho 0");
            default:
                throw new RuntimeException("Khong hop le!");

        }
    }
}
