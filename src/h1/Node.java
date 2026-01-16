package h1;

public class Node {
	private Node next; //Node-Attribut next
	
	public Node getNext() {  //Getter
		return next;
	}
	
	public void setNext(Node next) {  //Setter
		this.next = next;
	}
	
	public Node(Node next) {    // Konstruktor
		this.next = next;
	}

}
