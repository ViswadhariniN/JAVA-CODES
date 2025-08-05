class Solution {
    public int searchInsert(int[] nums, int target) {
        int[] b=new int[nums.length+1];
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<=target)
            {
                b[i]=nums[i];
                if(b[i]==target)
                {
                    break;
                }
                k++;
            }
        }
        b[k]=target;
        for(int i=b.length-1;i>k;i--)
        {
            b[i]=nums[i-1];
        }
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]);
        }
        return k;
    }
}