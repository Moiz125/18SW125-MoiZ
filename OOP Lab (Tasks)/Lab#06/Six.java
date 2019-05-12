class Six
{
    static int age;
    void setAge(int age)
    {
        this.age=age;
    }
    int getAge()
    {
        return age;
    }

    public static void main(String[]nah)
    {
        Six a=new Six();
        Six b=new Six();
        a.setAge(19);
        System.out.println(a.getAge());
        b.setAge(20);
        System.out.println(b.getAge());
        System.out.println(a.getAge());
    }
}