class Author
{
	private String name;
	private String email;
	private char gender;
	public Author(String name,String email,char gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getName()
	{
		return name;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public String getEmail()
	{
		return email;
	}
	public char getGender()
	{
		return gender;
	}
	public String toString()
	{
		return ("Author[name="+getName()+",email="+getEmail()+",gender="+getGender()+"]");
	}
	public static void main(String[]nah)
	{
		Author author=new Author("Robert Lafore","Lafore940@yahoo.com",'m');
		author.setEmail("Robert945@yahoo.com");
		System.out.println(author.toString());
	}
}