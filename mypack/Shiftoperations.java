package mypack;

public class Shiftoperations {

	public static void main(String[] args) {
		// Demonstrate left shift and right shift operations on an integer
		int a = 25;
		int leftShift = a << 2;
		System.out.println("Value of the number after left shift is: "+leftShift);
		
		int rightShift = a >> 1;
		System.out.println("Value of the number after right shift is: "+rightShift);

	}

}
