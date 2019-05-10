import java.util.Scanner;

/**
 * 4칙연산을 입력받아 계산하는 프로그램.
 * 
 * @author (2017315048 쿠마자와 유이, 2017315051 다나카 무네사토, 2017315034 전세종, 2017315018 방제호)
 * @version (2019/05/09)
 */
public class MyApp
{
    //input formula and call method
    public static void doCalculate(){
        Calculator cal = new Calculator();
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        String operator = scan.next();
        int number2 = scan.nextInt();
        double result = 0.0;

        if(operator.equals("+")){
            result = cal.add(number1, number2);
        }
        else if(operator.equals("-")){
            result = cal.sub(number1, number2);
        }
        else if(operator.equals("*")){
            result = cal.mul(number1, number2);
        }
        else if(operator.equals("/")){
            result = cal.div(number1, number2);
        }
        System.out.println(number1+ " " +operator +" "+ number2 + " 결과 값은 >> " + result);
    }

    //main method
    public static void main(String args[]){
        doCalculate();
    }
}
