class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        int len = nums.length;
        for(int i = 0;i < len - 1; i++) {
            for(int j = i + 1; j < len; j++) {
                if(nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        return ans;
    }
}

//TC : O(n^2)
//SC : O(1)


//Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

//Example 2:
//Input: nums = [3,2,4], target = 6
//Output: [1,2]

//Example 3:
//Input: nums = [3,3], target = 6
//Output: [0,1]