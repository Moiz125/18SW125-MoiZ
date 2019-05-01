class Dog
{
	String name;
	String breed;
	int age;
	int set=0;
	void setDetails(String name,String breed,int age)
	{
		this.name=name;
		this.breed=breed;
		this.age=age;
		set++;
	}
	void showDetails()
	{
		if(set!=0)
		{
			System.out.println("Name is:"+name);
			System.out.println("Breed is:"+breed);
			System.out.println("Age is:"+age);
		}
		else
		{
			System.out.print("Details are unavaliable");
		}
		
	}
	public static void main(String[]nah)
	{
		Dog d=new Dog();
		d.setDetails("Arai","Tibetan Mastiff",6);
		d.showDetails();
		
	}
}