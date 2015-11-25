
package com.example.project;

import static org.junit.gen5.api.Assertions.assertEquals;

import org.junit.gen5.api.Name;
import org.junit.gen5.api.Tag;
import org.junit.gen5.api.Test;
import org.junit.gen5.api.TestName;

@Tag("fast")
class FirstTest {

	@Test
	@Name("My 1st JUnit 5 test! 😎")
	void myFirstTest(@TestName String testName) {
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
		assertEquals("My 1st JUnit 5 test! 😎", testName, () -> "testName is injected correctly");
	}

}
