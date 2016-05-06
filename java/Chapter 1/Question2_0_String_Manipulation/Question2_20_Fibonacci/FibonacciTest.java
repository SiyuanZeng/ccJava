package Question2_0_String_Manipulation.Question2_20_Fibonacci;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by SiyuanZeng's on 4/27/2016.
 */
public class FibonacciTest {

    @Test
    public void testFib() throws Exception {
        assertEquals(5, Fibonacci.fib(5));
    }
}