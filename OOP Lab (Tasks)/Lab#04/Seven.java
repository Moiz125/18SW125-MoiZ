class Seven
{
    public static void main(String[]nah)
    {
        int arr[]=new int[]{8,5,7,4,1,2,9,3,6};
        System.out.println("Initialized Array");
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        int a=0;
        while(a<arr.length)
        {
            int b=0;
            while(b<arr.length-1)
            {
               if(arr[b]>arr[b+1])
               {
                int temp=arr[b];
                arr[b]=arr[b+1];
                arr[b+1]=temp;
                
               }
               b++;
            }
            a++;
        }
        System.out.println("Array after Bubble sorting:");
        for(int y:arr)
        {
            System.out.print(y+" ");
        }
        System.out.println();
    }
}