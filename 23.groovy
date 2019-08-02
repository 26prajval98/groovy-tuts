class Main {

	static def printMap(m){
		println "The map is :"
		for( k in m){
			println "\t${k.key} : ${k.value}"
		}
		println "\nSize of map is ${m.size()}"
	}

	static void main(args) {
		
		def m = [:]
		// .withDefault( key -> {
		// 	return -1;
		// })

		m['red'] = 0;
		m['green'] = 1;
		m['blue'] = 2

		printMap(m);
			
		def m1 = m
		def m2 = m.clone()

		def keys = m.keySet().collect();

		for(k in keys){
			m.remove(k)
		}
		

		println "Map m:"
		printMap(m)
		
		println "Map m1 (normal copy of m):"
		printMap(m1)

		println "Map m2 (deep copy of m):"
		printMap(m2)
	}
}