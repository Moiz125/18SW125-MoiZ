package lab08;
import java.util.Scanner;
interface AdvancedArithmetic
{
    public int sumOfFactors(int n);
}
public class One implements AdvancedArithmetic
{
    private int sum=0;
    public int sumOfFactors(int n)
    {
        for(int x=2;x<n;x++)
        {
            if(n%x==0)
            {
                sum+=x;
            }
        }
        return sum;
    }
    public static void main(String[]nah)
    {
        Scanner x = new Scanner(System.in);
        One one = new One();
        System.out.print("Enter an integer:");
        int a = x.nextInt();
        System.out.println("Sum of factors is:"+one.sumOfFactors(6));
    }
}