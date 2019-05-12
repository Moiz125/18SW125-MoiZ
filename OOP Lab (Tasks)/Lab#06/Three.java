class Three
{
	public void printMethod(int a,char b)
	{
		System.out.println("Integer="+a+" Charachter="+b);
	}
	public void printMethod(char b,int a)
	{
		System.out.println("Charachter="+b+" Integer="+a);
	}
	public static void main(String[]nah)
	{
		Three obj=new Three();
		obj.printMethod(20,'M');
		obj.printMethod('N',40);
	}
}