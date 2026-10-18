class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer>stack=new Stack<>();
        int max=0;
        for(int i=0;i<=heights.length;i++)
        {
           int cur;
            if(i==heights.length)
            {
                cur=0;

            }
            else
            {
                cur=heights[i];
            }
            while(!stack.isEmpty()&&heights[stack.peek()]>cur)
            {
                int h=heights[stack.pop()];
                int w;
                if(stack.isEmpty())
                {
                    w=i;

                }
                else
                {
                    w=i-stack.peek()-1;
                }
                max=Math.max(max,h*w);

            }
            stack.push(i);
        }
        return max;
    }
}