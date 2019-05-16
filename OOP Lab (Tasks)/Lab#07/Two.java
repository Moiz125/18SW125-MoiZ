class Person
{
    private String name;
    private String address;
    Person(){}
    public Person(String name,String address)
    {
        this.name=name;
        this.address=address;
    }
    public String getName()
    {
        return name;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
    public String getAddress()
    {
        return address;
    }
    public String toString()
    {
        return ("Person[name="+getName()+",address="+getAddress()+"]");
    }
    
}
class Student extends Person
{
    private String program;
    private int year;
    private double fee;
    // public Student(String name,String address,String Program,int year,double fee)
    public Student(String program,int year,double fee)
    {
        this.program=program;
        this.year=year;
        this.fee=fee;  
    }
    public void setProgram(String program)
    {
        this.program=program;
    }
    public String getprogram()
    {
        return program;
    }
    public void setYear(int year)
    {
        this.year=year;
    }
    public int getYear()
    {
        return year;
    }
    public void setFee(double fee)
    {
        this.fee=fee;
    }
    public double getFee()
    {
        return fee;
    }
    public String toString()
    {
        return ("Student[Person[name="+getName()+",address="+getAddress()+"],program="+getprogram()+",year="+getYear()+",fee="+getFee()+"]");
    }
}
class Staff extends Person
{
    private String school;
    private double pay;
    public Staff(String school,double pay)
    {
        this.school=school;
        this.pay=pay;
    }
    public void setSchool(String school)
    {
        this.school=school;
    }
    public String getSchool()
    {
        return school;
    }
    public void setPay(double pay)
    {
        this.pay=pay;
    }
    public double getPay()
    {
        return pay;
    }
    public String toString()
    {
        return ("StaffPerson[name="+getName()+",address="+getAddress()+"],school="+getSchool()+",pay="+getPay()+"]");
    }
}
public class Two
{
    public static void main(String[]nah)
    {
        Person person=new Person("MoiZ","Wapda TPS Guddu");
        Student student=new Student("Software Engineering",2018, 940000);
        Staff staff=new Staff("MUET", 50000);
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(staff.toString());

    }
    
}