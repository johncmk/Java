package integerprogramming;
import java.util.ArrayList;
import java.util.Random;

public interface GeneticAlgorithmFunctions {

	public ArrayList<matrix> initializePopulation(int populationSize,int drow, int dcol, Random n,ArrayList<matrix> x);
	public int EvaluateEachIndividual(matrix result, matrix d,int ftScore, int scoreRate);
	public void selectParents(ArrayList<matrix> parents,matrix result, matrix C,matrix d, matrix select,matrix matrix,int ftScoreThreshold, int perfectScore, boolean flag);
	public ArrayList<matrix> chooseTwoParentsRandomly(ArrayList<matrix> parents, Random rand,Integer[] randomParents);
	public void crossover(matrix crossover,int half, ArrayList<matrix> selectedParents);
	public void mutation(int mutationLoopSize, int[] memoizationMutation, matrix crossover, Random rand);
}
