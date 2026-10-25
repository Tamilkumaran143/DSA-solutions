class Solution {
    public int[] singleNumber(int[] nums) {
        int index=0;
        int []arr=new int[2];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key:map.keySet())
        {
            if(map.get(key)==1)
            {
                arr[index++]=key;
            }
        }
        return arr;
    }
}