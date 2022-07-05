package Curs7;

import java.io.IOException;

public class TestPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		PropertiesFileProcessor obj = new PropertiesFileProcessor();
		obj.writePropertiesFile();
		
		obj.readPropertiesFile("username"); // sau password ,email..etc

	}

}
