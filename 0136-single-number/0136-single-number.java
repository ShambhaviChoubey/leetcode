import java.util.HashSet;
import java.util.Set;

class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> check = new HashSet<>();
        for (int num : nums) {
            if (check.contains(num)) {
                check.remove(num);
            } else {
                check.add(num);
            }
        }
        return check.iterator().next();
    }
}