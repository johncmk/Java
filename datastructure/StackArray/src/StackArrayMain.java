
public class StackArrayMain {

	public static void main(String[] args) {


		StackArray stk = new StackArray();
		
		stk.push(100);
		stk.push(1);
		stk.push(55);
		stk.push(0);
		
//		stk = stk.sortIterative();
		stk.sortRecursive(stk);
		while(!stk.isEmpty())
			System.out.println(stk.pop());
	}//End main
}//End class
