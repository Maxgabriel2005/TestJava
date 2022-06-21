package Curs3;

public class ForLoopExample {
	public static void main(String[] args) {
		 
		for(int i = 0; i <10; i++) {
			
			if(i == 5) {
				System.out.println(" este 5 ");
				//break;
				continue;
				
			}
			System.out.println(i);
		}
	}

}
