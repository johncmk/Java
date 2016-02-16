package integerprogramming;

import java.util.Comparator;

public class matrix implements matrixFunctions{

	private Integer[][] mat = new Integer[][]{};
	private int ftScore;
	private int row, col;
	/**
	 * default constructor
	 */
	public matrix(){}

	public matrix(int row, int col){
		this.row = row;
		this.col = col;
		setMatrix(row,col);}
	
	public static matrix getInstance(){
		return new matrix();}
	
	public matrix(Integer[][] mat , int ftScore){
		this.mat = mat;
		this.ftScore = ftScore;}
	
	public void setFtScore(int ftScore){
		this.ftScore = ftScore;}
	
	public void setMatrix(Integer[][] mat){
		this.mat = mat;}
	
	public void setMatrix(int row, int col){
		this.mat = new Integer[row][col];}
	
	public void setMatrixRow(int row){
		this.row = row;}
	
	public void setMatrixCol(int col){
		this.col = col;}
	
	public int getRow(){
		return this.row;}
	
	public int getCol(){
		return this.col;}
	
	public int getFtScore(){
		return this.ftScore;}
	
	public Integer[][] getMat(){
		return this.mat;}

	
	@Override
public void printMatrix(Integer[][] result) {
		for(int r = 0; r < result.length;r++){
			for(int c = 0; c < result[0].length; c++){
				System.out.print(result[r][c] +  " ");
			}
				System.out.println();
		}
		System.out.println();
	}//End of printMatrix

	@Override
public void printMatrix(Integer[][] C, Integer[][] d) {
		//print C
				System.out.println("Matrix C:");
				for(int r = 0; r < C.length;r++){
					for(int c = 0; c < C[0].length;c++){	
						System.out.print(C[r][c] + " ");
					}
					System.out.println();
				}
				System.out.println("Matrix d:");
			//print d	
				for(int r = 0; r < d.length;r++){
					for(int c = 0; c < d[0].length;c++){	
						System.out.print(d[r][c] + " ");
					}
					System.out.println();
				}
			}//End of printMatrix

	@Override
public Integer[][] matrixMultiplication(Integer[][] A, Integer[][] B) {
		 	int aRows = A.length;
		    int aColumns = A[0].length;
		    int bRows = B.length;
		    int bColumns = B[0].length;
		    
		    if (aColumns != bRows) {
		        throw new IllegalArgumentException("A:Rows: " + aColumns + " did not match B:Columns " + bRows + ".");}

		    Integer[][] C = new Integer[aRows][bColumns];
		    for (int i = 0; i < aRows; i++) {
		        for (int j = 0; j < bColumns; j++) {
		            C[i][j] = 0;}
		    }
		    for (int i = 0; i < aRows; i++) { // aRow
		        for (int j = 0; j < bColumns; j++) { // bColumn
		            for (int k = 0; k < aColumns; k++) { // aColumn
		                C[i][j] += A[i][k] * B[k][j];}
		        }
		    }
		    return C;
		}//End of Matrix multiplication

	public boolean matrixMatch(Integer[][] R, Integer[][] S){
		int count = 0;
			for(int row = 0; row < R.length;row++){
				if(R[row][0] == S[row][0]){
					count++;}
			}
		if(count == R.length)
			return true;
		else
			return false;
	}
	
	class MyFtScoreComp implements Comparator<matrix>{
		 
	    @Override
	    public int compare(matrix e1, matrix e2) {
	        if(e1.getFtScore() < e2.getFtScore()){
	            return 1;
	        } else {
	            return -1;
	        }
	    }
	}
	
}//End of class
