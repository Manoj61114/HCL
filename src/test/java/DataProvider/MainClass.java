package DataProvider;

public class MainClass implements InterClass {
	
	
public static void main(String[] args) {
	MainClass ver = new MainClass();
	ver.test();
	ver.test1();
}

@Override
public void test1() {
	System.out.println("Implements class");
	
}
}
