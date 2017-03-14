package PrimayGH;

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

import PrimayGH.PrimaiesGH;

public class PrimaiesGHTest {
	public PrimaiesGH primaies=new PrimaiesGH();
	
	@Before
	public void Start()throws Exception{
		primaies.Start();
	}
	
	@After
	public void End()throws Exception{
	}
	
	@Test
	public void Five(){
		String str=new String("2 3 5 7 11 ");
		primaies.printPrimes(5);
		assertEquals(str,primaies.Getstr());
	}
}
