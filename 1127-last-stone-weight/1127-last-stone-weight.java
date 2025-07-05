class Solution {
    public int lastStoneWeight(int[] stones) {
        int size=stones.length;
        while(size>1)
        {
            Arrays.sort(stones);
            int last=stones[size-1];
            int seclast=stones[size-2];
            if(last==seclast)
            {
                size=size-2;
            }
            else
            {
                stones[size-2]=last-seclast;
                size--;
            }
        }
        if(size==0)
        return 0;
        else
        return stones[0];

    }
}