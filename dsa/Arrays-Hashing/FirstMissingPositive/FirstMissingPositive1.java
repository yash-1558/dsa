class Solution {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        for(int i = 0; i < len; i++) {
            if(nums[i] <= 0) {
                nums[i] = len + 1;
            }
        }
        for(int i = 0;i < len; i++) {
            int currValue = Math.abs(nums[i]);
            if(currValue > 0 && currValue <= len) {
                int index = currValue - 1;
                if(nums[index] > 0) {
                    nums[index] = -nums[index];
                }
            }
        }
        int ans = len + 1;
        for(int i = 0; i < len ; i++) {
            if(nums[i] > 0) {
                ans = i + 1;
                break;
            }
        }
        return ans;
    }
}

//TC : O(N)
//SC : O(1)