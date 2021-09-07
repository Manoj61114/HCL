package Group;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Group {

	@Test(groups= {"Smoke"})
	public void mainTest() {
		System.out.println("MainTest Group Class");
	}
	

	@Test(groups= {"Smoke","Regression"})
	public void mainTest1() {
		System.out.println("MainTest1 Group Class");
	}
	
	
}

