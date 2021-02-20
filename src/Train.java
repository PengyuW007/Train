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
	public void addOrdered(int value) {
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
	
	//add the car by index, dont know how to write, this is pretty similar as 2150's a1
	public void findIndexAdd(int index) {
		if(isEmpty()) {
			
		}
		
		numTrains++;
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
	public boolean searchUnordered(int index) {
		boolean found = false;
		Node curr = head;
		
		while(curr!=null) {
			if(curr.getIndex()== index) {
				
				found = true;
			}else {
				curr = curr.getNext();
			}
		}		
		return found;
	}
	
	public int searchOrdered(int index) {
		//boolean found = false;
		int i = 1;
		Node curr = head;
		
		while(curr!=null) {
			if(curr.getIndex()==index)
				//found = true;
				i = curr.getIndex();
			else
				i++;
				curr = curr.getNext();
		}
		
		return i;
	}
	
	/*
	 * Delete
	 * 
	 * deleteCars,normal case
	 * 
	 */
	//cannot delete
	public void deleteCar(int index) {
		Node curr = head;
		Node prev = null;
		
		if(isEmpty()) {
			System.out.println("Delete Fails! No any cars in this train...");
		}else {
			//find where is the key
			while(curr!=null&& curr.getIndex()!=index) {
				prev = curr;
				curr = curr.getNext();
			}
			
			//if we found the key....
			if(curr!=null) {
				if(prev!=null) {
					System.out.println(curr.getIndex());
					prev.setNext(curr.getNext());
				}else {
					head = curr.getNext();
				}
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