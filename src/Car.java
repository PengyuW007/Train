public class Car{
	private int value;
	//private int index;
	
	public Car(int value) {
		this.value = value;
		//index = 1;
		System.out.println("New car is created with value: "+value);
	}
	
	public int getValue() {
		return value;
	}
	
	public void setVal(int newV) {
		value = newV;
	}
	
	public String toString() {
		return Integer.toString(getValue());
	}
}//end Car
