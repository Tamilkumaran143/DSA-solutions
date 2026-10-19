class Solution {
    public int scoreOfParentheses(String s) {
        int count=0;
        Stack<Integer>stack=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='(')
            {
                stack.push(count);
                count=0;
            }
            else
            {
                if(count==0)
                {
                    count=1;
                }
                else
                {
                    count*=2;
                }
                count+=stack.pop();
            }
        }
        return count;
    }
}