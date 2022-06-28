package Curs5;

public class ArrayExample3 {
	
	int[] numbers = {3, 4, 5, 8, 7, 8}; //cautam index numar pri for,for each,while

	public static void main(String[] args) {
		ArrayExample3 obj = new ArrayExample3();
		obj.rezolvareCuFor(9);
		
	}
	
	public void rezolvareCuFor( int element) {
		
		
		
		for(int i = 0; i<numbers.length; i++) {
			
			if(numbers[i] == element) {
			    System.out.println("index pentru " + element + " este " + i);
			
			}
		}
	}
	  
		
	  public void rezolvareCuForEach(int element) {
		  int i = 0;
		  for(int nr : numbers) {
			  
			  if(nr == element) {
			  System.out.println("index pentru " + element + "este" + i);
		  }
			i++;
		}
	
	}
}
