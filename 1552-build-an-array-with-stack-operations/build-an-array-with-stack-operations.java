class Solution {
    public List<String> buildArray(int[] target, int n) {
        Stack<Integer>stack=new Stack<>();
        List<String>ans=new ArrayList<>();
        int j=0;
        for(int i=1;i<=n&&j<target.length;i++)
        {
            stack.push(i);
            ans.add("Push");
            if(stack.peek()==target[j])
            {
                j++;
            }
            else
            {
                stack.pop();
                ans.add("Pop");
            }

        }
        return ans;
    }
}