import java.util.Scanner;

/**
 * Created by Stas on 25.09.2018.
 */

//Имплементируем интерфейс
public abstract class Operation implements InputOperetion {
    double number1=77;
    double number2=7;

    Scanner scanner = new Scanner(System.in);

    @Override
    public double inputNumber1() {
//вводим с клавиатуры первое число
        System.out.println("Каким будет первое число = ");
        number1 = scanner.nextDouble();
        return number1;
    }

    @Override
    public double inputNumber2() {
//Вводим с клавиатуры второе число
        System.out.println("Каким будет второе число = ");
        number2 = scanner.nextDouble();
        return number2;
    }
    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }
    @Override
    public String toString() {
        return number1 + " " + getOperator() + " " + number2 + " = " + calculateResult();
    }

}
