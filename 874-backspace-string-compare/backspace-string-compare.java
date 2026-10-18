class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>stack1=new Stack<>();
        Stack<Character>stack2=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(!stack1.isEmpty()&&ch=='#')
            {
                stack1.pop();
            }
            else
            {
                if(ch!='#'){
                stack1.push(ch);
                }
            }
        }
        for(char ch:t.toCharArray())
        {
            if(!stack2.isEmpty()&&ch=='#')
            {
                stack2.pop();
            }
            else
            {
                if(ch!='#'){
                stack2.push(ch);
                }
            }
        }
        StringBuilder ans1=new StringBuilder();
        StringBuilder ans2=new StringBuilder();
        while(!stack1.isEmpty())
        {
            ans1.append(stack1.pop());
        }
         while(!stack2.isEmpty())
        {
            ans2.append(stack2.pop());
        }
        return ans1.toString().equals(ans2.toString())?true:false;
    }
}