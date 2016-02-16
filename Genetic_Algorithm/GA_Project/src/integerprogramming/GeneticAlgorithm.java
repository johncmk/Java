package integerprogramming;

import java.util.ArrayList;
import java.util.Random;

public class GeneticAlgorithm implements GeneticAlgorithmFunctions{

	public GeneticAlgorithm(){}
	
	public ArrayList<matrix> initializePopulation(int populationSize,int drow, int dcol,Random rand ,ArrayList<matrix> x) {
		int num = 0;
		while(num < populationSize){
		matrix carry = new matrix(drow,dcol);
		for(int r = 0; r < carry.getRow();r++){
			carry.getMat()[r][0] = rand.nextInt(2);
			}
			x.add(carry);
			num++;
			}
	return x;
	}//End of initializePopulation

	public int EvaluateEachIndividual(matrix result, matrix d,int ftScore, int scoreRate){
		for(int row = 0; row < result.getRow();row++){
			if(result.getMat()[row][0] == d.getMat()[row][0]){
				ftScore += scoreRate;}
				}
		return ftScore;
	}
	
	public void selectParents(ArrayList<matrix> parents,matrix result, matrix C,matrix d, matrix select,matrix matrix,int ftScoreThreshold, int perfectScore, boolean flag){
	if(result.getFtScore() >= ftScoreThreshold){
		//Exit if there is solution
		if(result.getFtScore() == perfectScore){
			flag = matrix.matrixMatch(result.getMat(), d.getMat());
				if(flag){
					matrix.printMatrix(C.getMat(),d.getMat());
					System.out.println("FtScore: " + 100);
					System.out.println("Matrix by implement x to C Result:");
					matrix.printMatrix(result.getMat());
					System.out.println("The true solution of x Result:");
					matrix.printMatrix(select.getMat());
					System.exit(1);
				}
				}
					parents.add(select);
		}//End of Selection
	}//End of SelectParent

public ArrayList<matrix> chooseTwoParentsRandomly(ArrayList<matrix> parents, Random rand,Integer[] randomParents){
	while(randomParents[0] == randomParents[1]){
		randomParents[0] = rand.nextInt(parents.size());
		randomParents[1] = rand.nextInt(parents.size());
	}
	ArrayList<matrix> selectedParents = new ArrayList<matrix>();
		selectedParents.add(parents.get(randomParents[0]));
		selectedParents.add(parents.get(randomParents[1]));
	return selectedParents;
}//End of randomly choose two parents	
	
public void crossover(matrix crossover,int half, ArrayList<matrix> selectedParents){
	//Apply Crossover
	for(int row = 0; row < crossover.getRow();row++){
		if(row <= half){
			crossover.getMat()[row][0] = selectedParents.get(0).getMat()[row][0];
		}else if(row > half && row < crossover.getRow()){
			crossover.getMat()[row][0] = selectedParents.get(1).getMat()[row][0];
		}
		}//End of crossover
}

public void mutation(int mutationLoopSize, int[] memoizationMutation, matrix crossover, Random rand){
	//Apply mutation followed by mutation rate
	if(mutationLoopSize <= 0){
		for(int j = 0; j < mutationLoopSize && memoizationMutation[j] != -1;j++ ){
			int mutated = rand.nextInt(crossover.getRow());
					if(mutated > mutationLoopSize){
						memoizationMutation[mutated] = -1;
					}else{
						memoizationMutation[j] = -1;
					}
						if(crossover.getMat()[mutated][0] == 1){
							crossover.getMat()[mutated][0] = 0;
						}else if(crossover.getMat()[mutated][0] == 0){
							crossover.getMat()[mutated][0] = 1;
						}
				}
			}//End of Apply
}

public void bubbleSort(ArrayList<matrix> unsorted){
    
	if(unsorted.size() > 1){
    for(int i=0; i<unsorted.size() -1; i++){
        for(int j= 1; j<unsorted.size() -i; j++){
            if(unsorted.get(j-1).getFtScore() < unsorted.get(j).getFtScore()){
            	swap(unsorted,j-1,j);}
        }
    }
}
}//End of bubbleSort

public static void swap(ArrayList<matrix> list, int first, int second){
	Object temp = list.get(first);
	list.set(first, list.get(second));
	list.set(second, (matrix) temp);
}

}//End of class
