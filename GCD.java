class GCD{
    int num1;
    int num2;
    public GCD(int n1, int n2)
    {
        num1 = n1;
        num2 = n2;
    }
    int num3 = num1 > num2 ? num1:num2;
    int high_fac(int num1,int num2, int num3)
    {
        int fac =0;
        for(int i=2; i< num3; i++)
        {
            if(num1%i==0 && num2%i==0)
            {
                fac = i;
            }
        }
        return fac;
    }
    public static void main(String[] args)
    {
        GCD obj = new GCD(14,54);
        int high = obj.high_fac(obj.num1,obj.num2,obj.num3);
        System.out.print(high);
    }

}

