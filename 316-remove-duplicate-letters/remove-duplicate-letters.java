class Solution {
    public String removeDuplicateLetters(String s) {
        int []fre=new int[256];
        boolean[]used=new boolean[256];
        StringBuilder ans=new StringBuilder();
        for(char ch:s.toCharArray())
        {
            fre[ch]++;
        }
        for(char ch:s.toCharArray())
        {
            fre[ch]--;
            if(used[ch])
            {
                continue;
            }
            while(ans.length()>0&& ans.charAt(ans.length()-1)>ch&&fre[ans.charAt(ans.length()-1)]>0)
            {
                char last=ans.charAt(ans.length()-1);
                ans.deleteCharAt(ans.length()-1);
                used[last]=false;
            }
            ans.append(ch);
            used[ch]=true;
        }
        return ans.toString();

    }
}