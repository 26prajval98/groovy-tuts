class Main {
	static void main(args) {
		def br = new BufferedReader(new InputStreamReader(System.in));
		print "\nGross Salary : ";
		def g = br.readLine().toDouble();
		print "\nSavings : ";
		def s = br.readLine().toDouble();

		def income = taxCalculator(g, s);

		println "Taxable amount is ${income.taxable} and tax is ${income.tax}";
	}
	
	static Income taxCalculator(double g, double s){

		assert g > s;

		def noTax = Math.min(s, 100000);
		def taxable = g - noTax;
		
		double tax = 0;

		switch(taxable) {
			case { it > 100000 }:
				tax += (taxable - 100000) * 0.1;
				if(taxable <= 200000)
					break;
			case { it > 200000 }:
				tax += (taxable - 200000) * 0.2;
				if(taxable <= 500000)
					break;
			case { it > 500000 }:
				tax += (taxable - 500000) * 0.3;
		}

		return new Income(g, s, taxable, tax);
	}
}

class Income {
	double gross, savings, taxable, tax;

	Income(gross, savings, taxable, tax){
		this.gross = gross;
		this.savings = savings;
		this.taxable = taxable;
		this.tax = tax;
	}
}