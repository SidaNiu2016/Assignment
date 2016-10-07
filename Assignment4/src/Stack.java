import java.util.ArrayList;

/*Bonus: 
 * Design a java class that encapsulate the data structure Stack (Last in First out). 
 * The class has 2 methods:
 * (push): method for adding items to stack, the push operation adds items to the top of the list
 * (pop): method for retrieving items from the stack. 
 * The pop operation removes an item from the top of the list, and returns its value to the caller.
 * In the case of overflow the user should be informed with a message
 * In the case of underflow, the user should be informed with a message & a value of zero is returned.
 * Assumptions: The stack will hold up to 10 integer values.
*/
public class Stack<T>{
	private ArrayList<T> stack;

	Stack(){
		stack = new ArrayList<T>(10);
	}
	
	public void push(T data){
		if (stack.size()== 10) {
			System.out.println("Overflow! " + data + " can not be stored!");
        }
		else{
        	stack.add(data);
        }
	}
	
	public T pop(){  
        T topData = null;
        if (stack.isEmpty()) {
        	System.out.println("Underflow! No data can be removed!");  
        }
        else{
            topData = stack.get(stack.size()-1);
            stack.remove(stack.size()-1);  
        }  
        return topData;  
    }  

}
