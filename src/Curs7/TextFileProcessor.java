package Curs7;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileProcessor {
	
	
	//scriem intr-un fisier text
	public void writeTxtFile(String text) { //ii dam o variabila string text
	
	
		
		try {
			FileWriter myWriter = new FileWriter("filename.txt");// import file writer // surround with try catch
			myWriter.write(text);
			myWriter.close();
			System.out.println("Am scris in text");
			
		} catch (IOException e) {
			System.out.println("Nu am putut scrie in text ");
			
			e.printStackTrace();
		} 
		
	}
		
		
			
		
	 public void addToTxtFile(String text) {
		 
			try {
				FileWriter myWriter = new FileWriter("filename.txt", true);// import file writer // surround with try catch
				myWriter.write(text);
				myWriter.close();
				System.out.println("Am scris in text");
				
			} catch (IOException e) {
				System.out.println("Nu am putut scrie in text ");
				
				e.printStackTrace();
			} 
	
		

	}

	 public void readTxtFile() {
		 
		 File file = new File("filename.txt");
		 
		
		
		try {
			scan = new Scanner(file);
		
		
		 while(scan.hasNextLine()) {
			 System.out.println(scan.next());
		 }
		 scan.close();
		 
		 }catch (EOFException e) {
			 
		 }
	 }
	 
	 public void deleteTxtFile() {
		 
		 File myFile = new File("filename.txt");
		 myFile.delete();
		 System.out.println("Delete my file : + myFile.getName"());
	 }
	 
	 
}