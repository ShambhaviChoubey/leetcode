import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> check = new HashMap<>();

        // Count occurrences of each number
        for (int i : arr) {
            check.put(i, check.getOrDefault(i, 0) + 1);
        }
 int max=-1;
       for(int key:check.keySet())
       {
        if(key==check.get(key))
        {
            max=Math.max(max,key);
        }
       }
        
        return max; 
    }
}
