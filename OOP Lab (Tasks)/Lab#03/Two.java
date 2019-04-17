import java.util.*;
class Two
{
    public static void main(String[]nah)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Units:");
        int units=in.nextInt();
        int totalBill=0;
        if(units>300)
        {
            totalBill+=(units-300)*30;
            units=300;
        }
        if(units<=300 && units>200)
        {
            totalBill+=(units-200)*30;
            units=200;
        }
        if(units<=200 && units>100)
        {
            totalBill+=(units-100)*20;
            units=100;
        }
        if(units<=100 && units>50)
        {
            totalBill+=(units-50)*15;
            units=50;
        }
        if(units<50)
        {
            totalBill+=units*10;
        }
        System.out.println("Total Bill is:"+totalBill+"rs");
    }
}