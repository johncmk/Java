package integerprogramming;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class IntegerProgrammingMain {

	/**
	 * @param args
	 */
	private static Scanner fileIn = null;
	private static Random rand = new Random();
	
	private static matrix matrix = new matrix();
	private static matrix C = new matrix();
	private static matrix d = new matrix();
	private static matrix result = new matrix();
	private static matrix select = new matrix();
	private static matrix crossover = new matrix();
	private static matrix mutation = new matrix();
	
	private static toolBox tool = new toolBox();
	private static GeneticAlgorithm GA = new GeneticAlgorithm();
	
	public static ArrayList<matrix> x = new ArrayList<matrix>(); //Original Population
	public static ArrayList<matrix> newX = new ArrayList<matrix>(); //new Population
	public static ArrayList<matrix> parents = new ArrayList<matrix>(); //Parents that are selected to be potential
	public static ArrayList<matrix> temp = new ArrayList<matrix>();
	public static ArrayList<matrix> closeX = new ArrayList<matrix>();
	
	public static void main(String[] args) {

		String readMe = "readMe.txt";
		String parameter = "parameter.txt";
		
//		String readMe = args[0];
//		String parameter = args[1];
		
		prepareGA(readMe,parameter);//Get data from text file and declare matrix
		
		GA.initializePopulation(tool.getPopulationSize(), d.getRow(), d.getCol(), rand, x);//Initialize population
		
		int generationBegin = 0, generationMax = tool.getGenerationMax();
		int ftScore = 0; 
		int ftScoreThreshold = tool.getFitnessThreshold();
	
		int scoreRate = (100/d.getRow());
		int perfectScore = d.getRow() * scoreRate;
		boolean foundSolution = false;
		
while(generationBegin < generationMax){
	newX.clear();//Clear the new population
		for(int i = 0; i < x.size();i++){//Use Fitness Function to evaluate each individual in population
			select = x.get(i);
			result.setMatrix(matrix.matrixMultiplication(C.getMat(), select.getMat()));//Apply Fitness Function
			result.setFtScore(GA.EvaluateEachIndividual(result, d, ftScore, scoreRate));//Fitness evaluation
			ftScore = 0;
			GA.selectParents(parents, result, C, d, select, matrix, ftScoreThreshold, perfectScore, foundSolution);//Apply Elitist Selection
				}
		
			int[] memoizationParents = new int[parents.size()];
			memoizationParents = setMemoization(memoizationParents, parents.size());//set memoization, therefore pick random parent
		
		for(int i = 0; i < parents.size()&& memoizationParents[i] != -1;i++){//Select two potential parents
			Integer[] randomParents = {rand.nextInt(parents.size()),rand.nextInt(parents.size())};
			ArrayList<matrix> selectedParents = GA.chooseTwoParentsRandomly(parents, rand, randomParents);//Randomly choose two parents from the Elitist list
				memoizationParents[randomParents[0]] = -1;
				memoizationParents[randomParents[1]] = -1;
				GA.crossover(crossover, calculateRate(crossover.getRow(),tool.getCrossoverRate()), selectedParents);//Apply Crossover followed by crossover rate
				int[] memoizationMutation = new int[crossover.getRow()];
				memoizationMutation = setMemoization(memoizationMutation, crossover.getRow());//Set memoization, therefore mutate randomly
				GA.mutation(calculateRate(crossover.getRow(), tool.getMutationRate()), memoizationMutation, crossover,rand);//Apply mutation followed by mutation rate
				mutation.setMatrix(crossover.getMat()); // clone mutated crossover matrix to mutation matrix
				newX.add(mutation); // Insert offspring to P' where new population
				x = new ArrayList<matrix>(newX);//P <- P' clone new population to original population
				}//End of randomly select two parents -> crossover -> mutation
						if(foundSolution == false){
							int potentialScore = 0;
							for(matrix potential: x){
								result.setMatrix(matrix.matrixMultiplication(C.getMat(), potential.getMat()));
								result.setFtScore(GA.EvaluateEachIndividual(result, d, potentialScore, scoreRate));
								temp.add(result);
								closeX.add(potential);
								potentialScore = 0;
							}
							GA.bubbleSort(temp);
						}
					generationBegin++;
				}//End of while generationBegin < generationMax

		if(foundSolution == false){
			System.out.println("given C is");
			matrix.printMatrix(C.getMat());
			System.out.println("given d is");
			matrix.printMatrix(d.getMat());
			for(int i = 0; i < temp.size() && i < closeX.size();i++){
				System.out.println("close Solution score is " + temp.get(i).getFtScore());
				System.out.println("Closest value for x vector is");
				matrix.printMatrix(closeX.get(i).getMat());
				System.out.println("Cx is");
				matrix.printMatrix(temp.get(i).getMat());
			}
		System.out.println("Therefore, the closest solution is");
		matrix.printMatrix(closeX.get(0).getMat());
		}
		
}//End of main

public static int calculateRate(double size, int rate){
	double cRate = size *((double)rate/100);
	return (int)Math.ceil(cRate);
}
	
public static int[] setMemoization(int[] memoization, int memoizationSize){
	for(int i = 0; i < memoizationSize;i++){
		memoization[i] = i;
	}
	return memoization;
}	

public static void prepareGA(String readMe, String parameter){
		tool.readFile(fileIn, readMe, parameter, tool);
		C = new matrix(tool.getCrow(), tool.getCcol());
		d = new matrix(tool.getdrow(), tool.getdcol());
		result = new matrix(tool.getdrow(), tool.getdcol());
		select = new matrix(tool.getdrow(), tool.getdcol());
		crossover = new matrix(tool.getdrow(),tool.getdcol());
		mutation = new matrix(tool.getdrow(),tool.getCcol());
		tool.readMatrix(fileIn, readMe, C.getMat(), d.getMat());
	}


}//End of class
