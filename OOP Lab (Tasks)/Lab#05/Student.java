public class Student
{
	String name;
	int age;
	String depart;
	String rollno;
	Student()
	{
		name=null;
		age=0;
		depart=null;
		rollno=null;
	}
	Student(String name,int age,String depart,String rollno)
	{
		this.name=name;
		this.age=age;
		this.depart=depart;
		this.rollno=rollno;
	}
	void setData(String name,int age,String depart,String rollno)
	{
		this.name=name;
		this.age=age;
		this.depart=depart;
		this.rollno=rollno;
	}
	void getData()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Depart:"+depart);
		System.out.println("RollNo:"+rollno);
	}
	public static void main(String[]nah)
	{
		Student s1=new Student("Mohammad MoiZ",19,"Software Engineering","18SW125");
		s1.getData();
	}
}