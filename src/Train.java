public class Train{
	private Node head;
	private Node tail;
	private int numTrains;
	
	public Train() {
		head = null;
		tail = head;
		numTrains = 0;
		System.out.println("New Train created...");
	}
	
	public int length() {
		System.out.println("There are "+numTrains+" cars on the train.");
		return numTrains;
	}
	
	//check whether this train is empty
	public boolean isEmpty() {
		return head == null && tail == head;
	}
	
	/*
	 * 	ADD methods
	 * 
	 * addHead
	 * 
	 * addTail
	 * 
	 * addOrdered
	 * 
	 * findIndexAdd
	 * 
	 */
	//addHead, this method works
	public void addHead(int value) {
		//add from front
		Node newN = new Node(value);
		
		if(head== null) {
			head = newN;
			tail = head;
		}else {
			newN.setNext(head);
			head.setPrev(newN);
			head = newN;
		}
		numTrains++;
	}
	
	//add at tail, it works
	public void addTail(int value) {
		Node newN = new Node(value);
		
		if(isEmpty()) {
			head = newN;
			tail = head;
		}else {
			tail.setNext(newN);
			newN.setPrev(tail);
			tail = newN;
		}
		numTrains++;
		
	}
	
	//add the train orderly, cannot work, console didn't give me any response
	/*public void addOrdered(int value) {
		Node prev = null;
		Node curr = head;
		
		while(curr!=null && numTrains<value) {
			prev = curr;
			//curr = curr.next;
			curr.setNext(curr);
		}
		
		Node newN = new Node(value);
		curr = newN;
		
		if(prev != null) {
			
			prev.setNext(newN);
		}else {
			//insert into an empty list,insert the smallest value
			head = newN;
		}
		numTrains++;
	}
	*/
	//add the car by index, dont know how to write, this is pretty similar as 2150's a1
	public boolean findIndexAdd(int index, int value) {
	
		boolean added = false;
		
		if(index == 0 ) {
			addHead(value);
			added = true;
			numTrains++;
		}
		else if(index==numTrains){
			addTail(value);
			added = true;
			numTrains++;
		}
		else {
			Node curr = head;
			int currInx =0;
			while(curr != null && !added) {
				
				if(currInx == index) {
					added = true;
				}
				curr = curr.getNext();
				currInx++;
			}
			
			if(index<numTrains && curr!= null) {
				Node prev = curr.getPrev();
				prev.setNext(curr.getNext());
				added = true;
				numTrains++;
			}
			
		}
		
		
		return added;
		}
		
	
	
	/*
	 * Search
	 * 
	 * SearchUnordered
	 * 
	 * SearchOrdered
	 * 
	 */
	//both of them don't work
	
	
	/*
	 * Delete
	 * 
	 * deleteCars,normal case
	 * 
	 */
	//cannot delete
	public void deleteCar(int index) {
		Node curr = head;
		int currInx = 0;
		
		
		if(isEmpty()) {
			System.out.println("Delete Fails! No any cars in this train6...");
		}
		else if(index==0 ) {
			head = head.getNext(); 
			numTrains--;
		}
		
		else if(index==this.numTrains){
			
			Node prev= tail.getPrev();
			prev.setNext(null);
			tail = prev;
			numTrains--;
		}
		
		else {
			while(curr!= null && currInx < index) {
				
				curr= curr.getNext();
				currInx++;
			}
			
			if(curr!= null && currInx== index) {
				Node prev = curr.getPrev();
				prev.setNext(curr.getNext());
				numTrains--;
				
			}
		}
	}
	
	public String toString() {
		Node curr = head;
		String str ="";
		while(curr!=null) {
			str+=curr.getCarValue()+" ";
			curr = curr.getNext();
		}
		
		return str;
	}
}
