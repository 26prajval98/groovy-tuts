class Main {
	static void main(args) {
		Triangle t = new Triangle(3, 4, 5);
		println t.Area();
	}
}

// triangle class takes 3 sides for constructor
class Triangle {
	def a, b, c, s;
	
	float Area(){
		return Math.sqrt(s*(s-a)*(s-b)*(s-c))
	}

	public Triangle (a, b, c){
		this.a = a;
		this.b = b;
		this.c = c;
		this.s = (a + b + c) / 2;
	}
}