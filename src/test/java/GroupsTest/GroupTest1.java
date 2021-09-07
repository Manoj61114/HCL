package GroupsTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GroupTest1 {

	@Test(groups= {"API"})
	public void mainTest() {
		System.out.println("MainTest GroupTest1 Class");
	}
	

	@Test(groups= {"Regression"})
	public void mainTest1() {
		System.out.println("MainTest1 GroupTest1 Class");
	}
	
}
