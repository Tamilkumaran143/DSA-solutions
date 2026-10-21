class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
    //     boolean [][] board=new boolean[8][8];
    //     List<List<Integer>> ans=new ArrayList<>();
    //     for(int q[]:queens)
    //     {
    //         board[q[0]][q[1]]=true;
    //     }
    //     int directions[][]=
    //     {
    //         {1,0},//down
    //         {0,1},//right
    //         {-1,0},//up
    //         {0,-1},//left
    //         {-1,1},//up-right
    //         {1,-1},//dowm-left
    //         {1,1},//down-right
    //         {-1,-1}//up-left
    //     };
    //   for(int dir[]:directions)
    //   {
    //     int x=king[0];
    //     int y=king[1];
    //     while(true)
    //     {
    //         x+=dir[0];
    //         y+=dir[1];
    //         if(x<0||x>=8||y<0||y>=8)
    //         {
    //             break;
    //         }

    //         if(board[x][y])
    //         {
    //             ans.add(Arrays.asList(x,y));
    //             break;
    //         }         
    //     }
    //   }
    //   return ans;
      boolean [][]board=new boolean[8][8];
      List<List<Integer>> ans=new ArrayList<>();
      for(int []q:queens)
      {
        board[q[0]][q[1]]=true;
      }
      int [][]directions={
            {1,0},//down
            {0,1},//right
            {-1,0},//up
            {0,-1},//left
            {-1,1},//up-right
            {1,-1},//dowm-left
            {1,1},//down-right
            {-1,-1}//up-left
      };

      for(int []dir:directions)
      {
        int x=king[0];
        int y=king[1];
        while(true)
        {
            x+=dir[0];
            y+=dir[1];
            if(x<0||y<0||x>7||y>7)
            {
                break;
            }
            if(board[x][y])
            {
                ans.add(Arrays.asList(x,y));
                break;
            }
        }
      }
      return ans;

    }
}