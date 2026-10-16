class Solution {
    public int addRungs(int[] rungs, int dist) {
        int count=0;
        int pre=0;
        for(int i=0;i<rungs.length;i++)
        {
            int gap=rungs[i]-pre;
            count+=(gap-1)/dist;
            pre=rungs[i];
        }
        return count;
    }
}