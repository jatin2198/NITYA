import java.util.ArrayList;
import java.util.Scanner;

public class Reverse {
	
	
	public String reverseString(String str){
		
		char[] temp=new char[str.length()];
		
		for(int i=0;i<str.length();i++) {
			
			temp[i]=str.charAt(str.length()-i-1);
		}
		
		String reverse=new String(temp);
		return reverse+";";
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your String");
		String userInput=sc.nextLine();
		
	
		Reverse rv=new Reverse();
		
		System.out.println(userInput+"="+rv.reverseString(userInput));
		
		
		
		

	}

}
