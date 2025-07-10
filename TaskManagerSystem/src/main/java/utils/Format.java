package utils;

public class Format {

	// array of special characters from which the user can choose to create a password
	private static char[] characters = new char[] {'!', '@', '#', '$', '%', '^', '&', '*', '.', '-', '+',  '_'};
	
	public static Boolean checkUsernameComplexity(String username) {
		boolean underscore = username.contains("_");
		return true;
	}
	
	public static Boolean checkPasswordComplexity(String password) {
				// Check if password is of the correct length
		if (password.length() < 8) {
			return false;
		}
		Boolean hasSpecialChar = false;
		Boolean hasNumericChar = false;
		Boolean hasUpperChar = false;

		for (int i = 0; i < password.length(); i++) {
			char currentChar = password.charAt(i);
			if (contains(characters, currentChar)) {
				hasSpecialChar = true;
			}
			if (isNumeric(currentChar)) {
				hasNumericChar = true;
			}
			if (isUpper(currentChar)) {
				hasUpperChar = true;
			}
		}
		return (hasSpecialChar && hasNumericChar && hasUpperChar);
	}
	
	// function to check whether a character is contained in specified char array
	private static Boolean contains(char[] array_to_search, char character_to_find) {
        for (char arrayToSearch : array_to_search) {
            if (arrayToSearch == character_to_find) {
                return true;
            }
        }
		return false;
	}
	
	public static Boolean isNumeric(char character) {
		return Character.isDigit(character);
	}
	public static Boolean isNumericDate(String dateString) {
		for (int i = 0; i < dateString.length(); i++) {
			if (Character.isDigit(dateString.charAt(i))) {
				return true;
			}
		}
		return false;
	}
	public static Boolean isUpper(char character) {
		return Character.isUpperCase(character);
	}
	
	public static void printPasswordComplexityRules() {
		System.out.println("Password Format Not Valid - Ensure the Following: \n");
		System.out.println("Password MUST Contain (At Least): \n");
		System.out.println("\t - 8 Characters in Length");
		System.out.println("\t - 1 Special Character");
		System.out.println("\t - 1 Numeric Character");
		System.out.println("\t - 1 Upper-Case Character");
		System.out.println("\n");
	}
	
	public static void printUsernameComplexityRules() {
		// Inform the client how to format their username
		System.out.println("Username must contain no more than 5 characters and an \"_\"");
	}

	public static Boolean dateCheck(String date) {
		if(date.length() != 10) {
			return false;
		}
		String year = date.substring(0,3);
		String month = date.substring(5,6);
		String day = date.substring(8,9);
        return isNumericDate(year) && isNumericDate(month) && isNumericDate(day);
    }

	public static Boolean descriptionCheck(String description) {
        return description.length() <= 50;
    }
}
