package com.javalec.output;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ads_inputStream = "C:\\Java_Workspace\\Input_Output\\output_sentence.txt";
		String ads_outputStream = "C:\\Java_Workspace\\Input_Output\\copy_dataStream.txt";

//		String sentence = "Hello World. I am testing OutputStream here.";
		
//		InputStreamEx.read_data(ads_inputStream);
//		OutputStreamEx.write(ads_outputStream, sentence);
	
//		Copy.copy(ads_inputStream, ads_outputStream);
//		Copy_Advanced.copy(ads_inputStream, ads_outputStream);
		
		//Datastream now working on Java8
		new DataInputStream_OutputStream().copy(ads_inputStream, ads_outputStream);
		
	}//End Main
	
}//End Class
