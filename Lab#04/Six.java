class Six
{
      public static void main(String[]nah)
    {
        int []arr=new int[]{6,7,16,4,0,77,5,90,1};
        int find=Integer.parseInt(nah[0]);
        for(int a=0;a<arr.length;a++)
        {
            if(find==arr[a])
            {
                System.out.println("Searched number:("+find+") found at index "+(a+1));
                find=1;
                break;
            }
        }
        if(find==1)
        {

        }
        else
        {
            System.out.println("Number not found.");
        }

    }
}