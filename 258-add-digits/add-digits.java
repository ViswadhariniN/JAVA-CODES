class Solution 
{
    public int addDigits(int num) 
    {
        int a=0,b=0;
        while(num>9)
        {
            a=num%10;
            b=num/10;
            num=a+b;
        }
        return num;
    }
}