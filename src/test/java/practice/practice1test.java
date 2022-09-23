package practice;

import org.testng.annotations.Test;

public class practice1test {
	
	
	@Test
	public void TestStep1test() {
		System.out.println("testscript1");
	}
	
	@Test
	public void TestStep2test() {
		System.out.println("testscript2");
		String browser =System.getProperty("br");
		String url =System.getProperty("url");
		System.out.println(browser);
		System.out.println(url);
	}

}
