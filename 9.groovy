class Main {
	static void main(args) {
		def br = new BufferedReader(new InputStreamReader(System.in));
		print "\nNumber 1 : "
		def a = br.readLine();
		print "\nNumber 2 : "
		def b = br.readLine();

		println multiply(a, b);
	}
	
	static double multiply(String a, String b){
		assert a.isNumber() && b.isNumber() && "a or/and b is not a number";
		return a.toDouble() * b.toDouble();
	}
}