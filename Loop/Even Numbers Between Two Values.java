class Even_numbers 
{
    public static void main(String arg[])
    {
        System.out.print("The Even Numbers Between 10 - 30 are : ");

        for(int i = 10 ; i <= 30 ; i++ )
        {
            if(i % 2 == 0 && i != 30)
            {
                System.out.print( i + " ");
            }
            else if (i == 30)
            {
                System.out.print(i);
            }

        }

        return;
    }    
}
