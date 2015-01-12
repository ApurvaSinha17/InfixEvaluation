
public class Stack {

	private String[] originalArray = new String[1];	
	private String[] tempArray = null;
	private int top = -1;
	
	private void resizeStack(int newCapacity){
		
		tempArray = new String[newCapacity];
		for(int i=0;i<=top;i++)
			tempArray[i] = originalArray[i];
		originalArray = tempArray;
	}
	
	public String peek(){
		
		return originalArray[top];
	}
	
	public void push(String str){
		
		if(top == originalArray.length - 1)
			resizeStack(originalArray.length * 2);
		originalArray[++top] = str;
	}
	
	public String pop(){
		
		if(top == -1){
			System.out.println("Empty Stack");
			System.exit(0);
		}
		
		if(top < originalArray.length/4)
			resizeStack(originalArray.length / 2);
		
		String str = originalArray[top]; 
		originalArray[top] = null;
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
