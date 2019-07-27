
public class Dua {
	public static void main(String[] args) {
		checkUsername("firmanaz");
		checkPassword("jakartA7");
		checkEmail("kuk.uruyuk@yahoo.co.id"); 
	}

	static void checkUsername(String param) {
		if (param == param.toLowerCase() && param.length() == 8) {
			System.out.println("Username Valid");
		} else {
			System.out.println("Username Invalid");
		}
	}

	static void checkPassword(String param) {
		int kecil = 0;
		int besar = 0;

		for (int i = 0; i < param.length(); i++) {
			if (Character.isLowerCase(param.charAt(i))) {
				kecil += 1;
			}
			if (Character.isUpperCase(param.charAt(i))) {
				besar += 1;
			}
		}

		if (kecil > 0 && besar > 0 && param.length() == 8) {
			System.out.println("Password Valid");
		} else {
			System.out.println("Password Invalid");
		}

	}

	static void checkEmail(String param) {
		if (param == param.toLowerCase() && param.indexOf("@") > 0 && param.indexOf(".") > 1) {
			String domain = param.substring(param.indexOf("@") + 1);
			if(domain.indexOf(".") > 0 && domain.substring(domain.indexOf(".") + 1).length() > 0) {
				System.out.println("Email Valid");
			} else { 
				System.out.println("Email Invalid");
			}
		} else { 
			System.out.println("Email Invalid");
		}
		
		
	}
}
