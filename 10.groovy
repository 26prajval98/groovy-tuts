class Main {
	static void main(args) {
		def br = new BufferedReader(new InputStreamReader(System.in));
		print "\nNumber : "
		def a = br.readLine();

		isEven(a) ? println("${a} is even") : println ("${a} is odd");
	}
	
	static boolean isEven(String a){
		assert a.isInteger() && "a is not an integer";
		return ((a.toInteger() + 1) % 2);
	}
}