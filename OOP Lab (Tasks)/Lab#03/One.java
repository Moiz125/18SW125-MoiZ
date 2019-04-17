import java.util.*;
class One 
{
    public static void main(String[]nah)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter marks in C++:");
        int a=in.nextInt();
        System.out.print("Enter marks in Data Structures:");
        int b=in.nextInt();
        System.out.print("Enter marks in Operating Systems:");
        int c=in.nextInt();
        System.out.println("Total marks are:("+(a+b+c)+"/300)");
        float perc=(float)(((a+b+c)*100)/300);
        System.out.println("Percentage is:"+perc);
        if(perc>90)
        {
            System.out.println("Grade=A");
        }
        if(perc<90 && perc>=80)
        {
            System.out.println("Grade=B");
        }
        if(perc<80 && perc>=70)
        {
            System.out.println("Grade=C");
        }
        if(perc<70 && perc>=60)
        {
            System.out.println("Grade=D");
        }
        if(perc<60)
        {
            System.out.println("Grade=Fail");
        }


    }
}