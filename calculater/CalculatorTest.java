
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 4칙연산을 입력받아 계산하는 프로그램.
 * 
 * @author (2017315048 쿠마자와 유이, 2017315051 다나카 무네사토, 2017315034 전세종, 2017315018 방제호) 
 * @version (2019/05/09)
 */
public class CalculatorTest
{
    /**
     * Default constructor for test class CalculatorTest
     */
    public CalculatorTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void addTest()
    {
        Calculator cal = new Calculator();
        assertEquals(95, cal.add(31, 64));
    }

    @Test
    public void subTest()
    {
        Calculator cal = new Calculator();
        assertEquals(28, cal.sub(30, 2));
    }

    @Test
    public void mulTest()
    {
        Calculator cal = new Calculator();
        assertEquals(45, cal.mul(5, 9));
    }

    @Test
    public void divTest1()
    {
        Calculator cal = new Calculator();
        assertEquals(5.0, cal.div(10, 2), 0.1);
    }

    @Test
    public void divTest2()
    {
        Calculator cal = new Calculator();
        assertEquals(-999.999, cal.div(10, 0), 0.1);
    }
}





