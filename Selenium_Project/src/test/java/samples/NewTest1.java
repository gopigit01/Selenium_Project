package samples;

import org.testng.annotations.Test;

public class NewTest1 {
	
	@Test(groups="regression")
	public void a() {
		System.out.println("Test 1");
	}
	
	@Test(groups="smoke")
	public void c() {
		System.out.println("Test 2");
	}
	
	@Test(groups= {"regression", "smoke"})
	public void b() {
		System.out.println("Test 3");
	}
	
	@Test
	public void g() {
		System.out.println("Test 4");
	}
	


}
