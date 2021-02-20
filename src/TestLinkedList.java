
public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Test add methods
		 */

		/*
		 * addHead
		 * 
		 * addTail
		 * 
		 * addOrdered
		 * 
		 * findIndexAdd
		 * 
		 */
		Node n = new Node(100);
		System.out.println("Node is " + n);

		Train train = new Train();
		//System.out.println(train.length());
		train.length();
		
		train.addHead(100);
		//System.out.println(train.length());
		train.length();
		System.out.println(train.toString());
		/*
		 * if(train.searchUnordered(1)) System.out.println("Found car at 1."); else
		 * System.out.println("Cannot found car at 1");
		 */
		// int index = train.searchOrdered(1);
		// System.out.println("The index we are looking for "+index);

		// train.addOrdered(200);
		train.addHead(200);
		//System.out.println(train.length());
		train.length();
		System.out.println(train.toString());
		
		train.addTail(300);
		//System.out.println(train.length());
		train.length();
		System.out.println(train.toString());
		// train.deleteCar(0);
		// System.out.println("Delete the first train, then length of the train
		// "+train.length());
		// System.out.println("Haha");

	}

}
