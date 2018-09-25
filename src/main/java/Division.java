/**
 * Created by Stas on 25.09.2018.
 */

//операция деления
public class Division extends Operation {

    @Override
    public String getOperator() {
        return "/";
    }

    @Override
    public double calculateResult() {  if (getNumber2() == 0) {
        try {
            throw new ZeroException("На 0 делить нельзя");
        } catch (ZeroException e) {
            System.out.println(e.getMessage() + " Давайте попробуем ввести еще раз..!");
            inputNumber2();

        }
    }
        return getNumber1() / getNumber2();
    }
}
