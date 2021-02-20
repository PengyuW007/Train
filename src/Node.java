public class Node{
	private Car carinfo;
	private Node next;
	private Node prev;
	private int index;
	
	public Node(int value) {
		carinfo = new Car(value);
		index = 1;
		next = null;
		prev = null;
	}
	
	public int getIndex() {
		return index;
	}
	
	public int getCarValue() {
		return carinfo.getValue();
	}
	
	public Node getNext() {
		return next;
	}
	
	public Node getPrev() {
		return prev;
	}
	
	public void setNext(Node newN) {
		next = newN;
	}
	
	public void setPrev(Node newP) {
		prev= newP;
	}
	
	public String toString() {
		return Integer.toString(getCarValue());
	}
}//end Node