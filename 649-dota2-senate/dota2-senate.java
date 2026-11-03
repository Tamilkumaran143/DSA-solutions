class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer>r=new LinkedList<>();
        Queue<Integer>d=new LinkedList<>();
        for(int i=0;i<senate.length();i++)
        {
            if(senate.charAt(i) == 'R') {
                r.add(i);
            }
            else {
                d.add(i);
            }
        }
        while(!r.isEmpty()&&!d.isEmpty())
        {
            int a=r.poll();
            int b=d.poll();
            if(a<b)
            {
                r.add(a+senate.length());
            }
            else
            {
                d.add(a+senate.length());
            }
        }
        if(r.isEmpty()) {
            return "Dire";
        }
        else {
            return "Radiant";
        }


    }
}