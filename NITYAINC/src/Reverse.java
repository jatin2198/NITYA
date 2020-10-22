import java.util.ArrayList;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your String");
		String userInput=sc.nextLine();
		
	
		
		ArrayList<Character> str=new ArrayList<>();

		for(int i=userInput.length()-1;i>=0;i--) {
			
			str.add(userInput.charAt(i));
			

		}
		
		str.add(str.size(), ';');
		System.out.print(userInput+"=");
		
	
		str.forEach(i->System.out.print(i));
		
		
		
		

	}

}
