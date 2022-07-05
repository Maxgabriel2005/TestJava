package Curs7;

public class TestTextFileProcessor {

	public static void main(String[] args) {
		
		TextFileProcessor obj = new TextFileProcessor();
		obj.writeTxtFile("Textul meu din fisier\n");
		obj.addToTxtFile("Noul meu text");
		obj.readTxtFile();
		obj.deleteTxtFile();

	}

}
