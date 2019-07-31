class Main {
	static void main(args) {
		def br = new BufferedReader(new InputStreamReader(System.in));
		print "\nMarks : ";
		def a = br.readLine();
		println "Your grade is ${grade(a)}";
	}
	
	static String grade(String a){

		assert a.isInteger() && "${a} is not a valid mark";

		def marks = a.toInteger();

		println "Marks is ${marks}"

		// This or that
		// switch(marks) {
		// 	case { it >= 91 && it <= 100 }:
		// 		return "AA";
		// 	case { it >= 81 && it <= 90}:
		// 		return "AB";
		// 	case { it >= 71 && it <= 80}:
		// 		return "BB";
		// 	case { it >= 61 && it <= 70}:
		// 		return "BC";
		// 	case { it >= 51 && it <= 60}:
		// 		return "CC";
		// 	case { it >= 41 && it <= 50}:
		// 		return "CD";
		// 	case { it >= 0 && it <= 40}:
		// 		return "Fail";
		// 	default:
		// 		return "Invalid marks";
		// }

		switch(marks) {
			case 91..100 :
				return "AA";
			case 81..90 :
				return "AB";
			case 71..80 :
				return "BB";
			case 61..70 :
				return "BC";
			case 51..60 :
				return "CC";
			case 41..50 :
				return "CD";
			case 0..40 :
				return "Fail";
			default:
				return "Invalid marks";
		}
	}
}