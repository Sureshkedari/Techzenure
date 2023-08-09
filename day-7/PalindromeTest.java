package com.techzenure.sevices;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PalindromeTest {
	private String input;
	private boolean expectedResult;
	
	public PalindromeTest(String input, boolean expectedResult) {
		super();
		this.input = input;
		this.expectedResult = expectedResult;
	}

	@Parameters
	public static Collection<Object[]> generateData(){
		return Arrays.asList(new Object[][] {
			{"eye", true},
			{"java", false},
			{"malayalam", true},
			{"techzenure", false},
			{"madam", true}
		});
	}

	@Test
	public void testCheckPalindrome() {
		Palindrome palObj = new Palindrome();
		boolean actual = palObj.checkPalindrome(input);
		assertEquals(expectedResult, actual);
	}

}
