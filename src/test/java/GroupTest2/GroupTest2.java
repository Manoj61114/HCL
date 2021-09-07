package GroupTest2;

import org.testng.annotations.Test;

public class GroupTest2 {

	
	@Test(groups= {"FunctionalTest"})
	public void mainTest() {
		System.out.println("MainTest GroupTest2 Class");
	}
	

	@Test(groups= {"Smoke","Sanity"})
	public void mainTest1() {
		System.out.println("MainTest1 GroupTest2 Class");
	}
	
}
