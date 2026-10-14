class Solution {
    public int removeDuplicates(int[] nums) {
        int x=0;
        for(int i=0;i<nums.length;i++)
        {
            if(x<2||nums[i]!=nums[x-2])
            {
                nums[x++]=nums[i];
            }
        }
        return x;
    }
}