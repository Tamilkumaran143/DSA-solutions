class Solution {
    public boolean asteroidsDestroyed(long mass, int[] asteroids) {
        Arrays.sort(asteroids);
        for(int num:asteroids)
        {
            if(num<=mass)
            {
                mass+=num;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}