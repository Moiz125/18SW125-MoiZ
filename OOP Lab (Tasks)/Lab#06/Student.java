class Student
{
    private String name;
    private int age;
    private String address;
    Student()
    {
        name="unknown";
        age=0;
        address="Not avaliable";
    }
    public void setInfo(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void setInfo(String name,int age,String address)
    {
        this.name=name;
        this.age=age;
        this.address=address;
    }
    void getInfo()
    {
        System.out.println("\nName="+name);
        System.out.println("Age="+age);
        System.out.println("Address="+address);
    }
    public static void main(String[]nah)
    {
        Student s1=new Student();
        s1.setInfo("MoiZ",20,"a");
        Student s2=new Student();
        s2.setInfo("Jawad",18,"a");
        Student s3=new Student();
        s3.setInfo("Ali Raza",19,"a");
        Student s4=new Student();
        s3.setInfo("Sheeraz",19,"a");
        Student s5=new Student();
        s5.setInfo("Talha",18,"a");
        Student s6=new Student();
        s6.setInfo("Yasir",18,"a");
        Student s7=new Student();
        s7.setInfo("Jabbar",20,"a");
        Student s8=new Student();
        s8.setInfo("Zain",19,"a");
        Student s9=new Student();
        s9.setInfo("Siraj",20,"a");
        Student s10=new Student();
        s10.setInfo("Aamir",18,"a");
        Student[] array={s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};

        for(int a=0;a<array.length;a++)
        {
            array[a].getInfo();
        }
    }
}