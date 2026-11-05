class Solution {
    public int beautySum(String s) {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            int[]fre=new int[26];
            for(int j=i;j<s.length();j++)
            {
                fre[s.charAt(j)-'a']++;
                int max=0;
                int min=Integer.MAX_VALUE;
                 for(int k=0;k<26;k++)
                {
                    if(fre[k]>0){
                    max=Math.max(max,fre[k]);
                    min=Math.min(min,fre[k]);
                   
                }
                }
                count+=max-min;
            }
        }
        return count;

    }
}