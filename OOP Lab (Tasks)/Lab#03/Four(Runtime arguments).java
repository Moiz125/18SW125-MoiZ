class Four
{
    public static void main(String[]nah)
    {
        
        int a=Integer.parseInt(nah[0]);
        int b=Integer.parseInt(nah[1]);
        String c=nah[2];
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