import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Created by Stas on 25.09.2018.
 */
public class DivisionTest {
    @Test
    public void getOperator() throws Exception {
        Division oper=new Division();
        String actual=oper.getOperator();
        String expected="/";
        assertEquals(expected,actual);

    }

    @Test
    public void calculateResult() throws Exception {
        Division summat=new Division();
        double actual = summat.calculateResult();
        double expected = 11;
        assertThat(expected,equalTo(actual));

    }

}
