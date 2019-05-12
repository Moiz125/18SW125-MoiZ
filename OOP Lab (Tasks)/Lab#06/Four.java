class Four
{
	public double calculateArea(double length,double width)
	{
		return (length*width);
	}
	public double calculateArea(double side)
	{
		return (side*side);
	}
	public static void main(String[]nah)
	{
		Four a=new Four();
		System.out.println("Area of Rectangle="+a.calculateArea(5.4,10));
		System.out.println("\nArea of Square="+a.calculateArea(12.1));
	}
}