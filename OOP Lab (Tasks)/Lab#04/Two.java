import java.util.*;
class Two
{
    public static void main(String[]nah)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Table num:");
        int a=in.nextInt();
        System.out.print("Enter Start:");
        int b=in.nextInt();
        System.out.print("Enter End:");
        int c=in.nextInt();
        for(int d=b;d<=c;d++)
        {
            System.out.println(a+"x"+d+"="+(a*d));
        }
    }
}