package GroupTest2;

import org.testng.annotations.Test;

public class GroupTest2 {

	
	@Test(groups= {"Smoke","Sanity"})
	public void mainTest1() {
		System.out.println("MainTest2 GroupTest2 Class");
	}
	
	@Test(groups= {"Smoke","Sanity"})
	public void mainTest2() {
		System.out.println("MainTest2 GroupTest2 Class");
	}
	
	
	
}
