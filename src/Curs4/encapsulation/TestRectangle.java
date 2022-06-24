package Curs4.encapsulation;

public class TestRectangle {

	public static void main(String[] args) {
		
		Rectangle obj = new Rectangle(5, 5);
		
		Rectangle obj2 = new Rectangle(2, 2); //nu il ia in seama ca nu  e chemat,de aia araata galben
		
		//obj.length = 5;
		//obj.width = 4;
		
		//obj.setLength(5);
		//obj.setWidth(3);
		
		
		System.out.println(obj.calculateArea());

	}

}
