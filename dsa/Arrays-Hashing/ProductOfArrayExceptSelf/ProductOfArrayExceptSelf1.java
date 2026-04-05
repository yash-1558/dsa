class Solution {
    public int[] productExceptSelf(int[] nums) {
        int right = 1;
        int len = nums.length;
        int result[] = new int[len];
        result[0] = 1;
        for(int i = 1; i < len; i++) {
            result[i] = result[i - 1] * nums[i -1];
        }

        for(int j = len - 1; j >= 0; j--) {
            result[j] = result[j] * right;
            right *= nums[j];  // Fixed: was incorrectly right[j]*=nums[j]
        }
        return result;
    }
}

//TC: O(n), where n is the length of nums (two linear passes through the array)
//SC: O(1) extra space, excluding the output array (result array is required for output)





//Example 1:
//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]

//Example 2:
//Input: nums = [-1,1,0,-3,3]
//Output: [0,0,9,0,0]