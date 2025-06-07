
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int length = grid.length, // Dimension of the grid
            n = length * length, // Total number of Natural numbers
            sumOfNNaturalNumber = n * (n + 1) / 2, // Sum of all Natural numbers till n
            repeated = 0, missing = 0, // Result
            sum = 0; // Sum of all elements in the Grid

        // Holds all visited number related information
        boolean[] nums = new boolean[n + 1];

        // Scanning each row
        for (int i = 0; i < length; i++) {

            // Scanning each element in the column
            for (int j = 0; j < length; j++) {

                // If a number is already visited, then we have found our repeating element
                if (nums[grid[i][j]]) {
                    repeated = grid[i][j]; continue;
                }

                // Marking a number as visited in the nums array
                nums[grid[i][j]] = true;

                // Calculating the sum of elements in the array except for the repeated element
                sum += grid[i][j];
            }
        }

        // Missing element is calulcated as the difference between sum of all natural number till n and the sum of all unique elements in the grid
        missing = sumOfNNaturalNumber - sum;

        // Return response
        return new int[] {repeated, missing};
    }
}