
public class Rectangle {

	static int area(int length,int breadth) {
		int area = length * breadth;
		return area;
		
	}
	
	public static void main(String[] args) {
		int length = 4;
	    int breadth = 4;
	    int rectangleArea = area(length,breadth);
		System.out.println("Area of rectangle "+ rectangleArea);
		

	}

}



