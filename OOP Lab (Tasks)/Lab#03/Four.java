import java.util.*;
class Four
{
    public static void main(String[]nah)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int a=in.nextInt();
        System.out.print("Enter 2nd number:");
        int b=in.nextInt();
        System.out.print("Enter arithmetic operation:");
        String c=in.next();
        switch(c)
        {
            case "+":
            {
                System.out.println("Sum is:"+(a+b));
                break;
            }
            case "-":
            {
                System.out.println("Substraction is:"+(a-b));
                break;
            }
            case "*":
            {
                System.out.println("Multiplication is:"+(a*b));
                break;
            }
            case "/":
            {
                System.out.println("Division is:"+(a/b));
                break;
            }
        }
    }
}