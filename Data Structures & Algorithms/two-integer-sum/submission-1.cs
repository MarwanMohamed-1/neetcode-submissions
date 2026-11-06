public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        var dictionary = new Dictionary<int, int>();  // Create a dictionary to store the number and its index.
        for (int i = 0; i < nums.Length; i++) {
            int difference = target - nums[i];  // Calculate the difference between the target and the current number.
            if (dictionary.ContainsKey(difference)) {  // If the difference exists in the dictionary.
                return new int[] { dictionary[difference], i };  // Return the indices of the two numbers that sum to the target.
            }
            dictionary[nums[i]] = i;  // Add the current number and its index to the dictionary.
        }
        return null;  // Return null if no solution is found.
    }
}
