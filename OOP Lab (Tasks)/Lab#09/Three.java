class Calculator
{
    public long power(int n,int p)
    {
        long result=1;
        try{
            if(n<0 || p<0)
            {
                throw new ArithmeticException("n or p should not be negative");
            }
            if(n==0 && p==0)
            {
                throw new ArithmeticException("n or p should not be zero");
            }
            else
            {
                for(int x=1;x<n;x++)
                {
                    result*=n;
                }
            }
        }
        catch(ArithmeticException a)
        {
            System.out.println(a.getMessage());
        }
        return result;
    }
    public static void main(String[]nah)
    {
        Calculator c=new Calculator();
        System.out.println(c.power(4, 3));
    }
}
