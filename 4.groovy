class Main {
	static void main(args) {
		def br = new BufferedReader(new InputStreamReader(System.in));
		List<AddDistance> x = [];

		2.times {
			println "\nNumber ${it + 1} :"

			println "Feet :"
			def f = br.readLine().toInteger();
			
			println "Inch :"
			def i = br.readLine().toInteger();

			x.add(new AddDistance(f, i));
		}

		(x[0] + x[1]).display();
	}
}

// triangle class takes 3 sides for constructor
class AddDistance {
	int feet, inch;
	
	void print(){
		println calculate();
	}

	void display(){
		println "Feet : ${feet} and inch : ${inch}";
	}

	AddDistance (int feet, int inch){
		this.feet = feet;
		this.inch = inch;
	}

	AddDistance plus(AddDistance d2){
		int inch = (this.inch + d2.inch) % 12;
		int feet = (this.inch + d2.inch) / 12 + this.feet + d2.feet;
		return new AddDistance(feet, inch);
	}
}