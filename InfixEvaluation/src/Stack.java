
public class Stack {

	private String[] operatorStack = new String[1];	
	private String[] tempArray = null;
	private int top = -1;
	
	private void resizeStack(int newCapacity){
		
		tempArray = new String[newCapacity];
		for(int i=0;i<=top;i++)
			tempArray[i] = operatorStack[i];
		operatorStack = tempArray;
	}
	
	public String peek(){
		
		return operatorStack[top];
	}
	
	public void push(String str){
		
		if(top == operatorStack.length - 1)
			resizeStack(operatorStack.length * 2);
		operatorStack[++top] = str;
	}
	
	public String pop(){
		
		if(top == -1){
			System.out.println("Empty Stack");
			System.exit(0);
		}
		
		if(top < operatorStack.length/4)
			resizeStack(operatorStack.length / 2);
		
		String str = operatorStack[top]; 
		operatorStack[top] = null;
		top--;
		return str;
	}
	
	public Boolean isEmpty(){
		
		if(top == -1)
			return true;
		else
			return false;
	}
}
