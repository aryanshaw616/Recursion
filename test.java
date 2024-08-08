class test
{
    int mystery(int num,int x,int y)
    {
        if(num<10)
        return num;
        else
        {
            int z= num%10;
            if(z%2==0)
            return(z*x+mystery(num/10,x,y));
            else
            return(z*y+mystery(num/10,x,y));
        }
    }
}