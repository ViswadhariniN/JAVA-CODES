class Solution 
{
    public boolean isPowerOfTwo(int n) 
    {
        for(int i=0;i<100;i++)
        {
            double a=Math.pow(2,i);
            if(a==n)
            return true;
        }
        return false;
    }
}