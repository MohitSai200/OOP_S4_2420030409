package mypack;
import java.util.*;

public class Comparisionofnumbers {
	
	public static void main(String[] args) {
	  	  System.out.println("Enter two numbers");
	  	  Scanner sc=new Scanner(System.in);
	  	  int a=sc.nextInt();
	  	  int b=sc.nextInt();
	  	  if(a>b)
	  		  System.out.println("a is greatest");
	  	  else if(a==b) 
	  		  System.out.println("Both are equal");
	  	  else 
	  		  System.out.println("b is greatest");
	}
}
