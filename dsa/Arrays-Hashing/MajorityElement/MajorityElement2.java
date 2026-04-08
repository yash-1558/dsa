class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int ans = 0;
        int count = 0;
        for(int i = 0; i < len; i++) {
            if(count == 0) {
                ans = nums[i];
                count = 1;
            }
            else if (nums[i] == ans) {
                count++;
            }
            else {
                count--;
            }
        }
        return ans;
    }
}

//TC : O(N_
//SC : O(1)