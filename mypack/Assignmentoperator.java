package mypack;

public class Assignmentoperator {

	public static void main(String[] args) {
		System.out.println("Enter two numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int AND = a & b;
		System.out.println("The and result of "+a+" ,"+b+" is "+AND);
		
		int OR = a | b;
		System.out.println("The or result of "+a+" ,"+b+" is "+OR);
		
		int XOR = a ^ b;
		System.out.println("The xor result of "+a+" ,"+b+" is "+XOR);
		
		int complementA = ~a;
		int complementB = ~b;
		System.out.println("The complement of a is: "+complementA);
		System.out.println("The complement of b is: "+complementB);
}

