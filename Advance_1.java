class Advance_1{
    public static void main(String[] args)
    {
         int n =8;
        for(int i =1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i<=(n/2))
                {
                    if(j<=i || j>n-i)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                         System.out.print(" ");
                    }
                }
                if(i>(n/2))
                {
            
                    if(j<= 2i-(n/2) || j> n-i))
                    {
                    System.out.print("*");
                    }
                    else
                    {
                    System.out.print(" ");
                     }
               
            }
            }
             System.out.println();
        }
    }
}