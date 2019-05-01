public class Six
{
    Six(Student s,Marksheet m)
    {

    }
    void createStudentResult(Student s,Marksheet m)
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
        six.createStudentResult(s,m);
        
    }
}