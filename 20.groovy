class Main {
	static void main(args) {
		char c = 'p';
		int n = 8;

		CharNum.c_n(c, n);
		CharNum.c_n(n, c);

		// def cn = new CharNum();
		// c.c_n((char)'a', 10);
		// c.c_n(10, (char)'c');
	}
}

class CharNum{

	static def c_n(char c, int n){
		println "Character is ${c} and Number is ${n}";
	}

	static def c_n(int n, char c){
		println "Number is ${n} and Character is ${c}";
	}

	static def c_n(n, c){
		println "Donno";
	}
}
