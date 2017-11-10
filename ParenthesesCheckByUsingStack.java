import java.util.Scanner;
import java.util.Stack;


public class ParenthesesChecking {

	String str;
	int flag=0;
	Stack<Character> myStack1=new Stack<Character>();
	
	public ParenthesesChecking(String str) {
		this.str=str;
		stackOperation(this.str);
		if(myStack1.empty() && flag==0)
			 {
				 System.out.println("The sequence is right");
			 }
			 else{
				
			 }
		}
		
      
 void stackOperation(String str)
 {
	 for(int i=0;i<str.length();i++)
	 {
		 if(str.charAt(i)=='('||str.charAt(i)=='[')
		 {
			 myStack1.push(str.charAt(i));		 
		 }
		 else if((str.charAt(i)==')'||str.charAt(i)==']')&& !myStack1.isEmpty())
		 {
			 if((myStack1.peek()!='('&& str.charAt(i)==')')|| (myStack1.peek()!='['&& str.charAt(i)==']'))
			 {
				 System.out.println("The sequence is wrong");
				  break;
			 }
			 else if((myStack1.peek()=='('&& str.charAt(i)==')')|| (myStack1.peek()=='['&& str.charAt(i)==']'))
			 {
				
				 myStack1.pop();
			 }
		 }
		 else{
			 System.out.println("The sequence is wrong");
			 flag=1;
			 
			 break;
		 }
		 
		
		 }
	 }
 

	public static void main(String[] args) {
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enetr the string of parentheses :");
		 String str=sc.nextLine();
	     new ParenthesesChecking(str);
	   

	}

}
