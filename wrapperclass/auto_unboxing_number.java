package wrapperclass;
import java.util.*;
public class auto_unboxing_number {
	public class AutoUnboxingaNumber {
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter an Integer value: ");
	        int input = sc.nextInt();
	        Integer obj = input;
	        int num = obj;
	        System.out.println("Auto-unboxed int: " + num);
	    }
}
