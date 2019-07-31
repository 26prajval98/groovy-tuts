class Main {
	static void main(args) {
		def sq = new Square();

		sq.myPrint();
		sq.fromRectangle();
		sq.fromShape();
	}
}

class Shape {
	def myPrint(){
		println "This is a shape";
	}	
}

class Rectangle extends Shape{
	def myPrint(){
		println "This is rectangular shape";
	}

	def getShape(){
		return super();
	}
}

class Circle extends Shape {
	def myPrint(){
		println "This is circular shape";
	}	
}

class Square extends Rectangle {
	def myPrint(){
		println "Square is a rectangle";
	}

	def fromRectangle(){
		super().myPrint();
	}

	def fromShape(){
		super().getSuper().myPrint();
	}
}