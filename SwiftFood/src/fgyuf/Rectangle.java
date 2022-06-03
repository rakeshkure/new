package fgyuf;

class Rectangle {
    public float length;
    public float width;
    public double calculateArea()
    {
        double a=length*width;
        double area=Math.round(a*100.0/100.0);
        
        return area;
    }
    public double calculatePerimeter(){
        double p=2*(length+width);
        double perimeter=Math.round(p*100.0/100.0);
        return perimeter;
    }
     
}

class Pester {

	public static void main(String args[]) {
		
		
		//Assign values to the member variables of Rectangle class
Rectangle re=new Rectangle();

		//Invoke the methods of the Rectangle class to calculate the area and parameter
		re.length=12;
		re.width=5;
		double x=re.calculateArea();
		double y=re.calculatePerimeter();
		
		
		//Display the area and parameter using the lines given below
		System.out.println("Area of the rectangle is "+x);
		System.out.println("Perimeter of the rectangle is "+y);
	}

}