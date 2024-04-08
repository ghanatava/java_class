class Rectangle1 {
	    int area(int length,int breadth) {
			int area = length * breadth;
			return area;
		
	}
}

class Rectangle2{
	static int area(int length,int breadth){
		return length*breadth;
	}
	
}



public class Demo{
    public static void main(String args[]){
    	Rectangle1 r1 = new Rectangle1();
    	int length = 4;
    	int breadthth = 5;
    	
    	int area = r1.area(length, breadthth);
    	System.out.println("Area of rectangle "+area);
    	
    	//static method
    	int arr = Rectangle2.area(4,4);
    	System.out.println("Area static = "+arr);
        
        
        		
    }
}