package arrays;
import java.util.Scanner;
public class read_and_print_on_console {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("How many numbers? ");
	        int n = sc.nextInt();
	        int arr[] = new int[n];
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        for (int i = 0; i < n; i++) {
	            System.out.println(arr[i]);
	        }
	        sc.close();
	    }
}
