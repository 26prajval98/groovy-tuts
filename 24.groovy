class Main {

	static def printList(list){
		println "The list is :"
		list.eachWithIndex {
			i, it -> {
				println "\t index :${i} : value ${it}"
			}
		}
		println "\nSize of list is ${list.size()}"
	}

	static void main(args) {

		// Creating and adding animals into the collection
		def list = new ArrayList<String>();
		list.addAll(["Lion", "Elephant", "Leopard"]);

		// Inserting at position 0 (1st position)
		list.add(0, "Tiger");

		// Retrieve an element (at a specified index) from the array list eg let index be 2
		println "Element at index 2 of list is ${list.get(2)}"

		// Update specific array element by a given element eg 2
		list[2] = "Cheetah"
		println "Updated 2nd element to Cheetah"

		// Remove the third element from the list
		println "The 3rd element removed is ${list.remove(2)}"

		// Search an element in the list eg search for "Tiger"
		if(list.any {
			it == "Tiger"
		}){
			println "Tiger is found at index ${list.find{it == "Tiger"}}"
		}

		/// Iterating with each id and iterator
		printList(list);
	}
}