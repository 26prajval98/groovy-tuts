class Main {
	static void main(args) {
		println "Perfect numbers between 1 and 1000"
		
		for(n in 1..1000){
			if(perfect(n) && n > 1){
				println "${n} is perfect";
			}
		}

		println "********************************";
		def br = new BufferedReader(new InputStreamReader(System.in));
		print "\nLower limit : ";
		def a = br.readLine().toInteger();
		print "\nUpper limit : ";
		def b = br.readLine().toInteger();

		for(n in a..b){
			if(perfect(n) && n > 1){
				println "${n} is perfect";
			}
		}
	}
	
	static boolean perfect(int n){
		def sum = 1;
		
		for(int i = 2; i*i <= n; i++){
			if(n%i == 0){
				if(i * i == n)
					sum += i;
				else
					sum += i + (n/i);
			}
		}
	
		return n == sum;
	}
}