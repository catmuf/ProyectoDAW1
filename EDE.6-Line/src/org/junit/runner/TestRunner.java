package org.junit.runner;
// TestRunner.java

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class TestRunner {
	public static void main(String[] args) {
	
	// run the tests
	Result result = JUnitCore.runClasses(AdderTest.class);
	
	// print any errors we had
	for(Failure failure : result.getFailures( )) {
	System.out.println(failure.toString( ));
	}
	
	// print whether we suceeded
	System.out.printf("All test cases passed: %b\n", result.wasSuccessful( ));
	}
}
