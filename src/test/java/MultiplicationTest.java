import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Created by Stas on 25.09.2018.
 */
public class MultiplicationTest {
    @Test
    public void getOperator() throws Exception {
        Multiplication oper=new Multiplication();
        String actual=oper.getOperator();
        String expected="*";
        assertEquals(expected,actual);

    }

    @Test
    public void calculateResult() throws Exception {
        Multiplication summat=new Multiplication();
        double actual = summat.calculateResult();
        double expected = 539;
        assertThat(expected,equalTo(actual));

    }

}
