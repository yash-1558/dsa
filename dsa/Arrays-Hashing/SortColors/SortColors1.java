import java.util.Arrays;

class Solution {
    public void sortColors(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
    }
}

//TC: O(n log n), where n is the length of nums (due to Arrays.sort implementation)
//SC: O(1), as it sorts in-place

//Example 1:
//Input: nums = [2,0,2,1,1,0]
//Output: [0,0,1,1,2,2]

//Example 2:
//Input: nums = [2,0,1]
//Output: [0,1,2]

1 0 1 2