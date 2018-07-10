package ie.gmit.dip;

import org.junit.runner.*;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main (String []args) {
		Result result= JUnitCore.runClasses(DistanceTestSuite.class);
		
		for(Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.println(result.wasSuccessful());
	}
	
}
