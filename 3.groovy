class Main {
	static void main(args) {
		def br = new BufferedReader(new InputStreamReader(System.in));
		def x = [];

		3.times {
			println "Number ${it + 1} :"
			def n = br.readLine().toFloat();
			x.add(n);
		}

		Average avg = new Average(x);
		avg.print();
	}
}

// triangle class takes 3 sides for constructor
class Average {
	def a, b, c;
	
	void print(){
		println calculate();
	}

	Average (x){
		this.a = x[0];
		this.b = x[1];
		this.c = x[2];
	}
	
	private float calculate(){
		return  (a + b + c)/3;
	}
}