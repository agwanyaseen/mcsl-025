class Rectangle
{	double height = 25;
	double width=3;
	public static void main(String[] args)
	{
		Rectangle r = new Rectangle();
		double area = r.height*r.width;
		System.out.println("Area is : "+area);
	}
}