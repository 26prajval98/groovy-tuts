class Main {
	static void main(args) {
		
		def br = new BufferedReader(new InputStreamReader(System.in));
		print "\nEnter number : ";
		def a = br.readLine().toInteger();
		println "Fib(${a}) : ${fib(a)}";
	}
	
	static int fib(int a){
		switch(a) {
			case { it < 0}:
				return -1;
			case 0:
				return 1;
			case 1:
				return 1;
			default:
				return fib(a-1) + fib(a-2);
		}
	}
}