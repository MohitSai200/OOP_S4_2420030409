package arrays;
import java.util.Scanner;
public class search_for_element {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int[] arr = new int[5];

	        System.out.println("Enter 5 numbers:");
	        for (int i = 0; i < 5; i++) {
	            arr[i] = sc.nextInt();
	        }

	        System.out.print("Enter number to search: ");
	        int key = sc.nextInt();

	        boolean found = false;

	        for (int i = 0; i < 5; i++) {
	            if (arr[i] == key) {
	                found = true;
	                break;
	            }
	        }

	        if (found)
	            System.out.println("Found");
	        else
	            System.out.println("Not Found");

	        sc.close();
	    }
}
