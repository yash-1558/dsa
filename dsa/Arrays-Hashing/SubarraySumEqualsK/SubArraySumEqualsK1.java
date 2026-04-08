class Solution {
    public int subarraySum(int[] nums, int k) {
        int len = nums.length;
        int ans = 0;
        for(int i = 0; i < len; i++) {
            int currSum = nums[i];

            for(int j = i; j < len ; j++) {
                currSum += nums[j];
                if(currSum == k) ans++;
            }
        }
        return ans;
    }
}

//TC : O(n^2)
//SC : O(1)


//Example 1:
//Input: nums = [1,1,1], k = 2
//Output: 2

//Example 2:
//Input: nums = [1,2,3], k = 3
//Output: 2