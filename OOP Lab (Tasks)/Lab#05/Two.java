import java.util.*;
class Two
{
		int[]arr=new int[6];
        void populateArray()
	{
		Scanner x=new Scanner(System.in);
		System.out.println("Enter values of Array as per index:");
		for(int a=0;a<arr.length;a++)
		{
			System.out.print("array["+a+"]=");
			arr[a]=x.nextInt();
		}
	}
        void define()
	{
		int even=0;
		int odd=0;
		for(int a=0;a<arr.length;a++)
		{
			if(arr[a]%2==0)
			{
				even++;
			}
			if(arr[a]%2!=0)
			{
				odd++;
			}
		}
			System.out.println("Even numbers in array:"+even);
			System.out.println("Odd numbers in array:"+odd);
	}
	public static void main(String[]nah)
	{
		Two array=new Two();
		array.populateArray();
		array.define();
	}
}