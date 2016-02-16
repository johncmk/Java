package integerprogramming;

import java.util.Scanner;

public interface toolBoxFunctions {

	public void readFile(Scanner fileIn, String readMe, String parameter, toolBox tool);
	
	public void readMatrix(Scanner fileIn, String readMe ,Integer[][] C, Integer[][] d);
}
