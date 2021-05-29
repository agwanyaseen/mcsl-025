class Expression
{
	public static void main(String[] args)
	{
		int a = 10;
		int b=5;
		System.out.println("(a < < 2) + (b > > 2): "+((a << 2) + (b >> 2)));
		System.out.println("(a<20) | | (b > 0): "+((a<20) || (b > 0)));
		System.out.println("(a + b * 100) / 10: "+((a + b * 100) / 10));
		System.out.println("a & b: "+(a & b));
	}
}