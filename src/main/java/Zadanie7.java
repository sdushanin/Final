/**
 * Created by Stas on 14.09.2018.
 *
 * @author Stas
 * @version
 */

//Запускаем калькулятор

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputOperetion inputOperetion = null;
        {//Выводим на экран возможные действия
            System.out.println("Выберете действие: 1-Addition(Сложение), 2 - Subtraction(Вычитание), 3-Multiplication(Умножение), 4 - Division(Деление)");
            int choose = 0;
            //Добавляем исключение если была введена буква
            try {
                choose = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Вы ввели букву, а надо цифру");
            }
            switch (choose) {
                case 1:
                    inputOperetion = new Addition();
                    break;
                case 2:
                    inputOperetion = new Subtraction();
                    break;
                case 3:
                    inputOperetion = new Multiplication();
                    break;
                case 4:
                    inputOperetion = new Division();
                    break;
                default:
                    System.out.println("Нет такой операции. Давайте сделаем деление");
                    inputOperetion = new Division();

            }
        }
        inputOperetion.inputNumber1();
        inputOperetion.inputNumber2();
        inputOperetion.calculateResult();
        System.out.println(inputOperetion.toString());
    }
}
