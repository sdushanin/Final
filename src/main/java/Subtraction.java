/**
 * Created by Stas on 25.09.2018.
 */

//операция Вычитания
public class Subtraction extends Operation{

    @Override
    public String getOperator() {
        return "-";
    }

    @Override
    public double calculateResult() {
        return getNumber1()-getNumber2();
    }
}
