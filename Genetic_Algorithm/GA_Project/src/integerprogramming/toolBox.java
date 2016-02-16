package integerprogramming;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class toolBox implements toolBoxFunctions{

	private int Crow,Ccol,drow,dcol;
	private int populationSize, crossoverRate, mutationRate, generationMax, fitnessThreshold;
	
	public toolBox(){}
	
	public static toolBox getInstance(){
		return new toolBox();}
	
	public void setCrow(int Crow){
		this.Crow = Crow;}
	
	public int getCrow(){
		return this.Crow;}
	
	public void setCcol(int Ccol){
		this.Ccol= Ccol;}
	
	public int getCcol(){
		return this.Ccol;}
	
	public void setdrow(int drow){
		this.drow = drow;}
	
	public int getdrow(){
		return this.drow;}
	
	public void setdcol(int dcol){
		this.dcol= dcol;}
	
	public int getdcol(){
		return this.dcol;}
	
	public void setPopulationSize(int populationSize){
		this.populationSize = populationSize;}
	
	public int getPopulationSize(){
		return this.populationSize;}
	
	public void setCrossoverRate(int crossoverRate){
		this.crossoverRate = crossoverRate;}
	
	public int getCrossoverRate(){
		return this.crossoverRate;}
	
	public void setMutationRate(int mutationRate){
		this.mutationRate = mutationRate;}
	
	public int getMutationRate(){
		return this.mutationRate;}
	
	public void setGenerationMax(int generationMax){
		this.generationMax = generationMax;}
	
	public int getGenerationMax(){
		return this.generationMax;}

	public void setFitnessThreshold(int ftScoreThreshold){
		this.fitnessThreshold = ftScoreThreshold;}
	
	public int getFitnessThreshold(){
		return this.fitnessThreshold;}
	
	@Override
	public void readFile(Scanner fileIn, String readMe, String parameter,toolBox tool) {
		try{
			fileIn = new Scanner(new FileInputStream(readMe));
		}catch(FileNotFoundException e){
			e.printStackTrace();}
		
		while(fileIn.hasNext()){
			String readMeStr = fileIn.next();

			if(readMeStr.equals("Crow")){
				tool.setCrow(fileIn.nextInt());}
			
			if(readMeStr.equals("Ccol")){
				tool.setCcol(fileIn.nextInt());}

			if(readMeStr.equals("drow")){
				tool.setdrow(fileIn.nextInt());}
			
			if(readMeStr.equals("dcol")){
				tool.setdcol(fileIn.nextInt());}
			
		}//End of while
		fileIn.close();
		
		try{
			fileIn = new Scanner(new FileInputStream(parameter));
		}catch(FileNotFoundException e){
			e.printStackTrace();}
		
		while(fileIn.hasNext()){
			String parameterStr = fileIn.nextLine();
			
				if(parameterStr.equals("Crossover Probability")){
						tool.setCrossoverRate(fileIn.nextInt());}//End of get crossover rate
				else if(parameterStr.equals("Mutation Probability")){
						tool.setMutationRate(fileIn.nextInt());}//End of get mutation rate
				else if(parameterStr.equals("Population Size")){
						tool.setPopulationSize(fileIn.nextInt());}//End of get population size
				else if(parameterStr.equals("Max Generation")){
						tool.setGenerationMax(fileIn.nextInt());}//End of get Max Generation
				else if(parameterStr.equals("Fitness Threshold")){
						tool.setFitnessThreshold(fileIn.nextInt());}
		}//End of while
		fileIn.close();
	}//End of readFile

	public void readMatrix(Scanner fileIn, String readMe, Integer[][] C, Integer[][] d) {
		// TODO Auto-generated method stub
		try{
			fileIn = new Scanner(new FileInputStream(readMe));
		}catch(FileNotFoundException e){
			e.printStackTrace();}
		
		while(fileIn.hasNext()){
			String readMeStr = fileIn.next();
			
					if(readMeStr.equals("C")){
					for(int r = 0; r < C.length;r++){
						for(int c = 0; c < C[0].length;c++){
							C[r][c] = fileIn.nextInt();}
					}
				}//End of get C
				
					if(readMeStr.equals("d")){
							for(int r = 0; r < d.length;r++){
								for(int c = 0; c < d[0].length; c++){
									d[r][c] = fileIn.nextInt();}				
							}
				}//End of get d
		}//End of while
		fileIn.close();
	}//End of readMatrix
	
	public static void show(){
		System.out.println("I am toolBox show");
	}
	
}//End of class
