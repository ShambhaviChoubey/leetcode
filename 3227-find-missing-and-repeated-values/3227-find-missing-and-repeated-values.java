class Solution {
    public int[] findMissingAndRepeatedValues(final int[][] grid) {
        final int n = grid.length * grid.length;

        final int[] result = new int[2], count = new int[n + 1];

        for(final int[] nums : grid)
            for(final int num : nums)
                count[num]++;

        for(int i = 1; i <= n; ++i)
            if(count[i] == 2)
                result[0] = i;
            else if(count[i] == 0)
                result[1] = i;

        return result;
    }
}