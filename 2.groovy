class Main {
	static void main(args) {
		def br = new BufferedReader(new InputStreamReader(System.in));
		
		println "\nEnter width: ";
		def w = br.readLine().toFloat();
		
		
		println "\nEnter height: ";
		def h = br.readLine().toFloat();
		
		def a = new Area();
		
		a.setDim(w, h);
		println a.getArea();
	}
}

class Area {
	def w, h;
	
	void setDim(w, h){
		this.w = w;
		this.h = h;
	}

	float getArea(){
		return w * h;
	}

}