package stack_array;

public class StackArray_main {

	public static void main(String[] args) {

		Stack stk = Stack.getInstance();
		
		
		
		for(int i = 0; i < 10; i++)
			stk.push(i+1);
		
		System.out.println("size " + stk.size());
		
		System.out.println("top " + stk.top());
		
		while(!stk.isEmpty()) {
			System.out.println(stk.pop());
		}
		
		System.out.println("size " + stk.size());
		
		System.out.println("top " + stk.top());
		
	}//End main

}//End class
