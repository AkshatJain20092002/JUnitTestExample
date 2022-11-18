package JUnitTestExamplePackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddNumbers {

	JUnitTesting t = new JUnitTesting();
	@Test
	public void test() {
		assertEquals(t.AddNumbers(4,5),9);
	}
}
