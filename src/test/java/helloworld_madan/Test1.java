package helloworld_madan;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void sum() {
		System.out.println("SUM");
		int a = 30;
		int b = 20;
		Assert.assertEquals(50, a+b);
	}
	@Test
	public void sub() {
		System.out.println("SUB");
		int a = 30;
		int b = 20;
		Assert.assertEquals(10, a-b);
	}
	@Test
	public void div() {
		System.out.println("DIV");
		int a = 10;
		int b = 20;
		Assert.assertEquals(2, b/a);
	}
	@Test
	public void mul() {
		System.out.println("MUL");
		int a = 10;
		int b = 20;
		Assert.assertEquals(200, a*b);
	}

}
