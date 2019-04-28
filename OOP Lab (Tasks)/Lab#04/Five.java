class Five
{
    public static void main(String[]nah)
    {
        int []arr=new int[]{6,7,16,4,0,77,5,90,1};
        int max=arr[0];
        for(int a=0;a<arr.length;a++)
        {
            if(max<arr[a])
            {
                max=arr[a];
            }
        }
        System.out.println("Greatest number in array is:"+max);

    }
}