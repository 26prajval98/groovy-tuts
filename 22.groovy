class Main {
	static void main(args) {
		
		def br = new BufferedReader(new InputStreamReader(System.in));
		print "\nEnter number : ";
		def a = br.readLine().toInteger();
		println "factorial(${a}) : ${factorial(a)}";
	}
	
	static int factorial(int a){
		switch(a) {
			case { it < 0}:
				return -1;
			case 0:
				return 1;
			case 1:
				return 1;
			default:
				return a * factorial(a-1);
		}
	}
}