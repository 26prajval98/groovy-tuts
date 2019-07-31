class Main {
	static void main(args) {
		def c1 = new Child1();
		def c2 = new Child2();

		c1.message();
		c2.message();
	}
}

abstract class Parent {
	abstract def message();
}

class Child1 extends Parent{
	def message(){
		println "This is a Child1";
	}	
}

class Child2 extends Parent {
	def message(){
		println "This is a Child2";
	}	
}
