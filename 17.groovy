class Main {
	static void main(args) {
		def piggyBank = new AddAmount(10);
		piggyBank.displayAmount();
	}
}

class AddAmount {
	def amount = 50;
	
	def increaseAmount(a){
		assert a.isNumber() && a > 0;
		amount += a;
	}

	def decreaseAmount(a){
		assert a.isNumber() && a > 0 && a < amount;
		amount -= a;
	}

	AddAmount(){
	}

	AddAmount(double a){
		amount += a;
	}

	def displayAmount(){
		println "Amount \$${amount} is present in account";
	}
}
