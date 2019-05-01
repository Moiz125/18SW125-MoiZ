class Marksheet
{
	double eng;
	double math;
	double cp;
	void setDetails(double eng,double math,double cp)
	{
		this.eng=eng;
		this.math=math;
		this.cp=cp;
	}
	void getTotal()
	{
		double total=eng+math+cp;
		System.out.println("Total marks are:"+total);
	}
	void getPerc()
	{
		float per;
		per=(float)((eng+math+cp)*100/300);
		System.out.println("Percentage is:"+per);
	}
	public static void main(String[]nah)
	{
	Marksheet s1=new Marksheet();
	s1.setDetails(89.2,93.3,78.7);
	s1.getTotal();
	s1.getPerc();	
	}
}