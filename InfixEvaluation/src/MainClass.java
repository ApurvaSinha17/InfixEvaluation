import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
		
		Double result = null;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter infix expression");
		String [] infixExpr = scanner.nextLine().split(" ");
		
		result = Evaluator.evaluateInfixExpr(infixExpr);
		if(result == null)
			System.out.println("Error evaluating infix expression");
		else
			System.out.println("Result = "+result);
		
		scanner.close();
	}

}
