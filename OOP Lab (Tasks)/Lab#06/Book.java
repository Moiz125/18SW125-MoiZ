class Book
{
	private String name;
	private Author[] author;
	private double price;
	private int quantity;
	public Book(String name,Author[] author,double price)
	{
		this.name=name;
		this.author=author;
		this.price=price;
	}
	public Book(String name,Author[] author,double price,int quantity)
	{
		this.name=name;
		this.author=author;
		this.price=price;
		this.quantity=quantity;
	}
	public String getName()
	{
		return name;
	}
	public Author[] getAuthors()
	{
		return author;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public void setQuantity(int qunatity)
	{
		this.quantity=quantity;
	}
	public String toString()
	{
		String authors="";
		for(int i=0;i<author.length;i++){
			authors+=author[i].toString()+",";
		}
		return ("Book[name="+getName()+",Author["+authors+",Price="+getPrice()+",Qty="+getQuantity()+"]");
	}

	public String getAuthorNames()
	{
		String authors="";
		for(int i=0;i<author.length;i++)
		{
			authors+=author[i].getName()+",";
		}
		return authors;
	}
	public static void main(String[]nah)
	{ 
		Author author=new Author("Robert Lafore","Lafore940@yahoo.com",'m');
		Author author2=new Author("Thomas Floyd","Floyde;@yahoo.com",'m');
		Author[] auth={author,author2};
		Book b=new Book("C++",auth,50.6);
		// System.out.println(b.toString());
		System.out.println(b.getAuthorNames());
		// b.getAuthorNames();

	}
}
