import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Created by Stas on 25.09.2018.
 */
public class SubtractionTest {
    @Test
    public void getOperator() throws Exception {
        Subtraction oper=new Subtraction();
        String actual=oper.getOperator();
        String expected="-";
        assertEquals(expected,actual);
    }

    @Test
    public void calculateResult() throws Exception {
        Subtraction summat=new Subtraction();
        double actual = summat.calculateResult();
        double expected = 70;
        assertThat(expected,equalTo(actual));
    }

}
