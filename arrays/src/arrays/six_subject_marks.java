package arrays;
import java.util.*;
public class six_subject_marks {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int[] marks = new int[6];
	        int total = 0;

	        for (int i = 0; i < 6; i++) {
	            System.out.print("Enter mark for subject " + (i + 1) + ": ");
	            marks[i] = sc.nextInt();
	            total += marks[i];
	        }

	        System.out.println("\nMarks:");
	        for (int i = 0; i < 6; i++) {
	            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
	        }

	        System.out.println("Total: " + total);
	        System.out.println("Average: " + (total / 6.0));

	        sc.close();
	    }
}
