package telran.validator.test;

import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

//import telran.validator.utils.Validator;
import static telran.validator.utils.Validator.*;

class ValidatorTest {

	@Test
	void testCheckCreditCardNumber() {
		assertTrue(checkCreditCardNumber("12345678")); 
		assertTrue(checkCreditCardNumber("1234567890987654"));
		assertFalse(checkCreditCardNumber("1234567890"));
		assertFalse(checkCreditCardNumber("1234567"));
		assertFalse(checkCreditCardNumber("12345678909876543"));
		assertFalse(checkCreditCardNumber("1234567890A"));
	}

	@Test
	void testCheckDateFormatEU() {

		assertTrue(checkDateFormatEU("25.05.1998"));
		assertTrue(checkDateFormatEU("08.10.2022"));
		assertTrue(checkDateFormatEU("06.12.2024"));
		assertTrue(checkDateFormatEU("01.01.1111"));
		assertFalse(checkDateFormatEU("34.13.22222"));
		assertFalse(checkDateFormatEU("54.54.54"));
		assertFalse(checkDateFormatEU("01/01/2022"));
		assertFalse(checkDateFormatEU("25b.2c.2022"));

	}

	@Test
	void testCheckDateFormatUS() {

		assertTrue(checkDateFormatUS("1998-05-21"));
		assertTrue(checkDateFormatUS("2002-05-12"));
		assertTrue(checkDateFormatUS("2024-05-05"));
		assertFalse(checkDateFormatUS("2020-5-2"));
		assertFalse(checkDateFormatUS("22222-55-55"));
		assertFalse(checkDateFormatUS("22-22-2"));
		assertFalse(checkDateFormatUS("2222.22.22"));
		assertFalse(checkDateFormatUS("255b-2c-22"));

	}

	@Test
	void testCheckPhoneNumber() {
		 assertTrue(checkPhoneNumber("+99(12)3456-7890"));
		 assertFalse(checkPhoneNumber("+99(12)3456-78902"));
		 assertFalse(checkPhoneNumber("+123456789112345"));

	}

	@Test
	void testCheckLessEquals255() {
		assertTrue(checkLessEquals255("0"));
		assertTrue(checkLessEquals255("5"));
		assertTrue(checkLessEquals255("58"));
		assertTrue(checkLessEquals255("199"));
		assertTrue(checkLessEquals255("255")); 
		assertFalse(checkLessEquals255("256"));
		assertFalse(checkLessEquals255("1000"));
		assertFalse(checkLessEquals255("-2"));
		assertFalse(checkLessEquals255("25b"));
	}

}
