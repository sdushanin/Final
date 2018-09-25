/**
 * Created by Stas 25.09.2018.
 */

//операция сложения
public class Addition extends Operation{

    @Override
    public String getOperator() {
        return "+";
    }

    @Override
    public double calculateResult() {
        return getNumber1()+getNumber2();
    }
}
