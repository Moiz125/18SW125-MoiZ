class Four
{
    public static void main(String[]nah)
    {
        int [][]arr1=new int[][]{{9,8,7},{6,5,4}};
        int [][]arr2=new int[][]{{4,5,6},{7,8,9}};
        int [][]arr3=new int[2][3];
        for(int a=0;a<arr3.length;a++)
        {
            for(int b=0;b<arr3[0].length;b++)
            {
                arr3[a][b]=arr1[a][b]+arr2[a][b];
                System.out.println(arr3[a][b]+" at index["+a+"]["+b+"]");
            }
        }

    }
}