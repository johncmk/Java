package com.javalec.decorator_pattern.abst;

/**
 * 
 * @author chaos408
 * Why an abstract class implementing an interface can miss the declaration/implementation
 * of one of the interface's method?
 * 
 * That's b/c if a class is abstract, then by definition you are required to create subclasses of it to instantiate.
 * The subclasses will be required (by the compiler) to implement any interface methods that the abstract class left out.
 * 
 *abstract class can implement interface by using implements keyword. 
 *Since they are abstract, they don¡¯t need to implement all methods.
 *Read more: 
 *http://javarevisited.blogspot.com/2013/04/10-abstract-class-and-interface-interview-question-java-answers.html#ixzz3zDYxj9pv
 */
public abstract class AbstAdding implements IBeverage {

	private IBeverage base;
	
	public AbstAdding() {
		// TODO Auto-generated constructor stub
	}
	
	public AbstAdding(IBeverage base) {
		super();
		this.base = base;
	}

	@Override
	public int getTotalPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public IBeverage getBase() {
		return base;
	}
}
