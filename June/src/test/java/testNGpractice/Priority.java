package testNGpractice;

import org.testng.annotations.Test;

public class Priority {

	@Test
	public void a_test() {
		System.out.println("a_test");
	}

	@Test(priority=1)
	public void b_test() {
		System.out.println("b_test");
	}

	@Test
	public void c_test() {
		System.out.println("c_test");
	}

	@Test
	public void d_test() {
		System.out.println("d_test");
	}

	@Test
	public void e_test() {
		System.out.println("e_test");
	}
}
