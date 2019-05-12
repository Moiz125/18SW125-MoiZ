public class Six
{
    Student s;
    Marksheet m;
    Six(Student s,Marksheet m)
    {
        this.s=s;
        this.m=m;

    }
    void createStudentResult()
    {
        s.setData("Mohammad MoiZ", 19, "Software Engineering", "18SW125");
        s.getData();
        m.setDetails(88.4, 95, 85.7);
        m.getPerc();
        m.getTotal();
    }
    public static void main(String[]nah)
    {
        Student s=new Student();
        Marksheet m=new Marksheet();
        Six six=new Six(s,m);
        six.createStudentResult();
        
    }
}