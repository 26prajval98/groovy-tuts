class Main {
	static void main(args) {
		A a = new A();
		B b = new B();
		a.invoke();
		b.invoke();
		a = new B();
		a.invoke();
	}
}

class A {
	static def invoke(){
		println "Parent";
	}
}

class B extends A{

	static def invoke(){
		println "Child";
	}
}
