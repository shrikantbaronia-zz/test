package com.junit.first;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class HelloWorldTest {

	@BeforeClass
	  public static void testSetup() {
	  }

	  @AfterClass
	  public static void testCleanup() {
	    // Teardown for data used by the unit tests
	  }

	  @Test(expected = IllegalArgumentException.class)
	  public void testExceptionIsThrown() {
	    HelloWorld tester = new HelloWorld();
	    tester.multiply(1000, 5);
	  }

	  @Test
	  public void testMultiply() {
		HelloWorld tester = new HelloWorld();
	    assertEquals("10 x 5 must be 50", 50, tester.multiply(10, 5));
	  }
	

}
