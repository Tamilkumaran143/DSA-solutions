class Solution {
    public int scoreOfParentheses(String s) {
        int score=0;
        Stack<Integer>stack=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='(')
            {
                stack.push(score);
                score=0;
            }
            else
            {
                if(score==0)
                {
                    score=1;
                }
                else
                {
                    score*=2;
                }
                score+=stack.pop();

            }
        }
        return score;

    }
}