package testNGTestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import Base.BaseTestSuite;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageClasses.SomeClassToTest;
import pageClasses.log4j2Demo;

public class TestngTestCasesAssert{

	private static final Logger log = LogManager.getLogger(log4j2Demo.class.getName());

	SomeClassToTest objs = new SomeClassToTest();

	@Test (priority=3)
	public void testMethod1() {
		int result = objs.sumNumbers(1, 2);
		try {
			Assert.assertEquals(result, 3);
			System.out.println("Assertion passed");
		} catch (Exception e) {
			System.out.println("Assertion Failed");

			log.debug("Assert Failed "+e.getMessage());
		}
		System.out.println("test method1");
	}

	@Test (priority=2)
	public void testMethod2() {
		String expectedString = "Hello World";
		String result1 = objs.addString("Hello", "World");
		System.out.println(result1);
		int result = objs.sumNumbers(2, 2);
		Assert.assertEquals(result, 4);
		Assert.assertEquals(result1, expectedString);
		System.out.println("test method2");
	}

	@Test(priority=1)
	public void testMethod3() {
		int[] expectdArray= {1,2,3};
		int[] result1= objs.getArray();
		Assert.assertEquals(result1, expectdArray);
		
		int result = objs.sumNumbers(3, 2);
		Assert.assertEquals(result, 5);
		System.out.println("test method3");
	}

}
