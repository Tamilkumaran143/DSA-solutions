class Solution {
     List<List<Integer>> arr=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
       sample(0,nums,new ArrayList<>());
       return arr;
    }
    public void sample(int n,int[]nums,List<Integer>ar)
    {
        arr.add(new ArrayList<>(ar));
        for(int i=n;i<nums.length;i++)
        {
            ar.add(nums[i]);
            sample(i+1,nums,ar);
            ar.remove(ar.size()-1);


        }
        System.out.print(ar);
    }
}