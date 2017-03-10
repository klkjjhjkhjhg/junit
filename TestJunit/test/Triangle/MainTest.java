package Triangle;

import static org.junit.Assert.*;
import org.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
//import org.junit.internal.runners.TestClassRunner;
import org.junit.runner.RunWith;


public class MainTest {
	public static Main mainTest=new Main();
	
	@Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test(timeout=1000)
    public void testequilateral() {
    	mainTest.triangle(1, 1, 1);
        assertEquals(0, mainTest.getResult());
    }

    @Test
    public void testisosceles() {
        mainTest.triangle(1, 1, 2);
        assertEquals(1,mainTest.getResult());
    }

    @Test
    public void testscalene() {
        mainTest.triangle(3, 1, 2);
        assertEquals(2,mainTest.getResult());
    }

    @Ignore("Multiply() Not yet implemented")  
    @Test
    public void testMultiply() {
    }

    @Test(expected =ArithmeticException.class)
    public void testZero() {
        mainTest.triangle(0, 1, 2);
        assertEquals(2,mainTest.getResult());
    }
}
