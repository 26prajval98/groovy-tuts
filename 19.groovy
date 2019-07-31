class Main {
	static void main(args) {
		def sc = new SubClass();
		sc.a_method();
		sc.non_a_method();
	}
}

abstract class Abstract {
	
	Abstract(){
		println "This is constructor of abstract class";
	}

	abstract def a_method();

	def non_a_method(){
		println "This is a normal method of abstract class";
	}
}

class SubClass extends Abstract{

	SubClass(){
		println "Subclass";
	}

	def a_method(){
		println "This is an abstract method";
	}	
}
