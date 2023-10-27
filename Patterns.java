class Patterns{
    public static void main(String[] args)
    {
        int m =1;
        for(int i =0;i<=4;i++)
        {
            for(int j=0;j<=9;j++)
            {
           
            if(i>0){
                if(j<=4-i)
                {
                    System.out.print(m);
                    m++;
                }
                else
                {
                    System.out.print(" ");
                }
               
                if(j>4+i)
                {
                    m--;
                    System.out.print(m);
                }
                else{
                    System.out.print(" ");
                }
            }
            
            }
            System.out.println();
        }
    }
}