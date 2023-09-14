import java.util.Stack;
import java.util.Scanner;

public class Assignment {

	//main method in the program
	public static void main(String[] args) {

		//declare variables
		String expression = "";
		char check;
		char letter;
		boolean isBalance = true;
		Stack<Character> stack = new Stack<Character>();
				
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Expression :");
				
		//Get expression as a user input
		expression += input.nextLine();
		input.close();
				
		for(int i = 0; i < expression.length(); i++) {
					
		letter = expression.charAt(i);
					
		if(letter == '(' || letter == '[' || letter == '{' ) {
						
			//put parenthesis into stack
			stack.push(letter);
			continue;
		}
		else if(letter == ')' || letter == ']' || letter == '}') {
						
			//check if the stack is empty
			if(stack.isEmpty() == true) {
				isBalance = false;
				break;
			}
						
		    switch(letter) {
						
			case ')':
				//assign last stack value to a variable
				check = stack.pop();
				if(check != '(') {
					isBalance = false;
					break;
				}
				else {
					continue;
				}
				
			case ']':
				//assign last stack value to a variable
				check = stack.pop();
				if(check != '[') {
					isBalance = false;
					break;
				}
				else {
					continue;
				}
			case '}':
				//assign last stack value to a variable
				check = stack.pop();
				if(check != '{') {
					isBalance = false;
					break;
				}
				else {
					continue;
				}
		    }
			
			if(isBalance == false) {
				break;
			}
						
		}
		else {
			continue;
		}
	}
				
		//check if the stack is empty or not
		if(stack.isEmpty() == false) {
			isBalance = false;
		}
			
		//print result
		if(isBalance) {
			System.out.format("Expression %s has Balanced Parenthesis!", expression);
		}
		else {
			System.out.format("Expression %s has no Balanced Parenthesis!", expression);
		}
	}

}
