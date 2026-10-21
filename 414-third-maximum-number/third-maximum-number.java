class Solution {
    public int thirdMax(int[] nums) {
         HashSet<Integer>set=new HashSet<>();
         for(int num:nums)
         {
            set.add(num);
         }
         int []arr=new int[set.size()];
         int i=0;
         for(int num:set)
         {
            arr[i++]=num;
         }
         Arrays.sort(arr);
         int a=arr.length-3;
         if(arr.length>2)
         {
            return arr[a];
         }
         return arr[a+2];

    }
}