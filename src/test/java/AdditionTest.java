import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Created by Stas on 25.09.2018.
 */
public class AdditionTest {
    @Test
    public void getOperator() throws Exception {
        Addition oper=new Addition();
        String actual=oper.getOperator();
        String expected="+";
        assertEquals(expected,actual);
    }

    @Test
    public void calculateResult() throws Exception {
        Addition summat=new Addition();
        double actual = summat.calculateResult();
        double expected = 84;
        assertThat(expected,equalTo(actual));

    }

}