package Curs4.encapsulation;

public class Rectangle {
	
	//schimbam din public in private
	
	
	
	private int width;
	private int length;
	
	
	//constructor cu parametri
	
	public Rectangle(int width, int length) {
		setLength(length);
		setWidth(width);
		
	}
	
	
	public int getWidth() {
		return width;
	}

	private void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	private void setLength(int length) {
		this.length = length;
	}

	public int calculateArea() {
		
		return width*length;
	}
	
	
	
	
	
	

}
