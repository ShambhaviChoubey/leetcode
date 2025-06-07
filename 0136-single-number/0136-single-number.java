class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> check = new HashSet<>();
        int c[] = new int[1];
        for (int num : nums) {
            if (check.contains(num) )
            {
                check.remove(num);
            } else
                check.add(num);
        }
        return check.iterator().next();
    }
}