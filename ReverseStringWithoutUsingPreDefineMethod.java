import java.util.Scanner;

public class ReverseStringWithoutUsingPreDefineMethod {
	
	public static void main(String[] args) {  
	Scanner in = new Scanner(System.in); 
	System.out.println("Enter string to be reversed: "); 
	String str = in.nextLine(); 
	for (int i = str.length() - 1; i >= 0; i--) {  

		System.out.print(str.charAt(i));  

	} 

}

}
