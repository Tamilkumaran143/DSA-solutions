class Solution {
    public boolean threeFibonacciSum(int n) {
        int a=0,b=1,c=1;
        while(a+b+c<n)
        {
            int d=b+c;
            a=b;
            b=c;
            c=d;
        }
        return a+b+c==n?true:false;


    }
}