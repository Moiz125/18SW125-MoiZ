class Seven
{
    public static void main(String[]nah)
    {
        String a="MoiZ, 19, BE-Software;Ashar, 18, BS-ComputerScience;";
        String []b=a.split(";");
        String []c=b[0].split(",");
        String []d=b[1].split(",");
        System.out.println("Student 1");
        System.out.println("Name="+c[0]);
        System.out.println("Age="+c[1]);
        System.out.println("Program="+c[2]);
        System.out.println("Student 2");
        System.out.println("Name="+d[0]);
        System.out.println("Age="+d[1]);
        System.out.println("Program="+d[2]);
    }
}