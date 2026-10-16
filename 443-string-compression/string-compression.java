class Solution {
    public int compress(char[] chars) {
        int i=0,k=0;
        while(i<chars.length)
        {
            int start=i;
            while(i<chars.length&&chars[i]==chars[start])
            {
                i++;
            }
            chars[k++]=chars[start];
            int count=i-start;
            if(count>1)
            {
                for(char ch:String.valueOf(count).toCharArray())
                {
                    chars[k++]=ch;
                }
            }
        }
        return k;
    }
}