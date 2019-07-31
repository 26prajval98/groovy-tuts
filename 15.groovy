class Main {
	static void main(args) {
		def br = new BufferedReader(new InputStreamReader(System.in));
		
		print "\nRectangle\nEnter width : ";
		def breadth  = br.readLine().toFloat();
		
		
		print "\nEnter height: ";
		def length = br.readLine().toFloat();
		
		def a = new Rectangle(breadth , length);
				
		println "Area : ${a.getArea()}";
		println "Perimeter : ${a.getPerimeter()}";

		print "\n\nSquare\nEnter side: ";
		def side  = br.readLine().toFloat();
		
				
		def b = new Square(side);
				
		println "Area : ${b.getArea()}";
		println "Perimeter : ${b.getPerimeter()}";
	}
}

class Rectangle {
	def breadth , length;
	
	float getArea(){
		return breadth  * length;
	}

	float getPerimeter(){
		return 2 * (breadth + length);
	}
	
	Rectangle(breadth , length){
		setDim(breadth, length);
	}

	private void setDim(breadth , length){
		this.breadth  = breadth ;
		this.length = length;
	}
}

class Square extends Rectangle {
	Square(s){
		super(s, s);
	}
}