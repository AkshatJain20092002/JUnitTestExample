package JUnitTestExamplePackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddStrings {

	JUnitTesting t = new JUnitTesting();
	@Test
	public void test() {
		assertEquals(t.AddStrings("a","b"),"ab");
	}

}
