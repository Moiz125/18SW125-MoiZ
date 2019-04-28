import java.util.*;
class Three
{
    public static void main(String[]nah)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number:");
        int a=in.nextInt();
        int b=0;
        while(a>0)
        {
            b+=a%10;
            a/=10;
        }
        System.out.println("Sum is:"+b);
    }
}