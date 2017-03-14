package Primay;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
//import org.junit.internal.runners.TestClassRunner;
import org.junit.runner.RunWith;

import Primay.Primaies;

public class PrimaiesTest {
	public static Primaies primay = new Primaies();
	
	@Before
	public void Start() throws Exception{
		primay.Start();
	}
	
	@After
	public void End() throws Exception{
		
	}
	
	@Test
	public void TestNormal(){
		String str=new String("Prime: 2\r\nPrime: 3\r\nPrime: 5\r\nPrime: 7\r\nPrime: 11\r\n");
		primay.printPrimes(5);
		assertEquals(str,primay.Getstr());
	}
}
