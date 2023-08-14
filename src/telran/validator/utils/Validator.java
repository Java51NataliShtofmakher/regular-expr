package telran.validator.utils;

public class Validator {
	public static boolean checkCreditCardNumber(String str) {
		String pattern = "^(\\d{8}|\\d{16})$";
		boolean check = str.matches(pattern);
		return check;
	}
	
	public static boolean checkDateFormatEU(String str) {
		String pattern = "^(0[1-9]|[12]\\d|3[01])\\.(0[1-9]|1[0-2])\\.\\d{4}$";
		boolean check = str.matches(pattern); 
		return check;
	}
	
	public static boolean checkDateFormatUS(String str) {
		String pattern = "^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])$";
		boolean check = str.matches(pattern);
		return check;
	}
	
	public static boolean checkPhoneNumber(String str) {
		String pattern = "^\\+\\d{2}\\(\\d{2}\\)\\d{4}-\\d{4}$";
		boolean check = str.matches(pattern);
		return check;
	}
	
	public static boolean checkLessEquals255(String str) {
		String pattern = "^(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})$";
		boolean check = str.matches(pattern);
		return check;
	}

}
