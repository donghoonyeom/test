import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    System.out.println("===Java Calculator===");


    Scanner input = new Scanner(System.in);
        /*
            요구 사항에 따라 간단한 계산기를 만들어주세요.
            1. 사용자의 입력으로 첫 번째 숫자, 연산자, 두 번째 숫자를 받아야 합니다.
            2. 연산자의 종류는 +, -, *, / 입니다.
            3. 소수점 연산을 수행할 수 있어야 합니다.
            4. 연산 결과를 콘솔에 출력합니다.
        */
    // TODO...
    double result;

    System.out.println("첫 숫자 입력");
    double num1 = input.nextDouble();

    System.out.println("연산자 +,-,*,/ 중에 입력");
    char operator = input.next().charAt(0);

    System.out.println("마지막 숫자 입력");
    double num2 = input.nextDouble();

    switch (operator) {
      case '+':
        result = num1 + num2;
        System.out.println(num1 + "+" + num2 + "=" + result);
        break;

      case '-':
        result = num1 - num2;
        System.out.println(num1 + "-" + num2 + "=" + result);
        break;

      case '*':
        result = num1 * num2;
        System.out.println(num1 + "*" + num2 + "=" + result);
        break;

      case '/':
        result = num1 / num2;
        System.out.println(num1 + "/" + num2 + "=" + result);
        break;


      default:
        System.out.println("연산자를 확인해주세요");
        break;

    }



    }



  }

