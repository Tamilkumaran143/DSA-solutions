class Solution {
    public int[] nextGreaterElements(int[] nums) {
        // int n=nums.length;
        // int []arr=new int[n];
        // Arrays.fill(arr,-1);
        // Stack<Integer>stack=new Stack<>();
        // for(int i=n*2-1;i>=0;i--)
        // {
        //     int index=i%n;
        //     while(!stack.isEmpty()&& stack.peek()<=nums[index])
        //     {
        //         stack.pop();
        //     }
        //     if(!stack.isEmpty())
        //     {
        //         arr[index]=stack.peek();
        //     }
        //     stack.push(nums[index]);
        // }
        // return arr;

        int n=nums.length;
        int []arr=new int[n];
        Arrays.fill(arr,-1);
        Stack<Integer>stack=new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            stack.push(nums[i]);
        }
        for(int i=n-1;i>=0;i--)
        {
            while(!stack.isEmpty()&&stack.peek()<=nums[i])
            {
                stack.pop();
            }
            if(!stack.isEmpty())
            {
                arr[i]=stack.peek();
            }
            stack.push(nums[i]);
        }
        return arr;
    }
}