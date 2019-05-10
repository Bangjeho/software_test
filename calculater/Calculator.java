import lang.stride.*;
import java.util.Scanner;
import java.lang.Double;

/**
 * 4칙연산을 입력받아 계산하는 프로그램.
 * 
 * @author (2017315048 쿠마자와 유이, 2017315051 다나카 무네사토, 2017315034 전세종, 2017315018 방제호)
 * @version (2019/05/09)
 */
public class Calculator
{
    private int operand1;
    private int operand2;
    private double result;

    /**
     * initialization of numbers
     */
    public void Calculator()
    {
        operand1 = 0;
        operand2 = 0;
        result = 0.0;
    }

    /**
     * add parameters number
     */
    public int add(int number1, int number2)
    {
        operand1 = number1;
        operand2 = number2;
        result = operand1 + operand2;
        return (int)result;
    }

    /**
     * sub parameters number
     */
    public int sub(int number1, int number2)
    {
        operand1 = number1;
        operand2 = number2;
        result = operand1 - operand2;
        return (int)result;
    }

    /**
     * mul parameters number
     */
    public int mul(int number1, int number2)
    {
        operand1 = number1;
        operand2 = number2;
        result = operand1 * operand2;
        return (int)result;
    }

    /**
     * div parameters number
     */
    public double div(int number1, int number2)
    {
        operand1 = number1;
        operand2 = number2;
        if (operand2 == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            result = -999.999;
        }
        else {
            result = operand1 / operand2;
        }
        return result;
    }
}
