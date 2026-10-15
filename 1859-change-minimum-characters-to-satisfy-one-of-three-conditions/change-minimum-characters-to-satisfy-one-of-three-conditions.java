class Solution {
    public int minCharacters(String a, String b) {
        // if(a.equals(b))
        // {
        //     return 0;
        // }
        int []fre1=new int[26];
        int []fre2=new int[26];
        for(char ch:a.toCharArray())
        {
            fre1[ch-'a']++;
        }
        for(char ch:b.toCharArray())
        {
            fre2[ch-'a']++;
        }
        int maxA=0,maxB=0;
        int ans=a.length()+b.length();
        for(int i=0;i<26;i++)
        {
            maxA=Math.max(maxA,fre1[i]);
            maxB=Math.max(maxB,fre2[i]);
        }
        ans=Math.min(ans,a.length()-maxA+b.length()-maxB);
        int p=0,q=0;
        for(int i=0;i<25;i++)
        {
            p+=fre1[i];
            q+=fre2[i];
            ans=Math.min(ans,a.length()-p+q);
            ans=Math.min(ans,b.length()-q+p);
        }
        return ans;
    }
}