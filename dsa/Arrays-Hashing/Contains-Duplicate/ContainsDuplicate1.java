class Solution {
    public boolean containsDuplicate(int[] nums) {
        int len = nums.length;
        for(int i = 0; i < len - 1; i++) {
            for(int j = i + 1; j < len; j++){
                if(nums[i] == nums[j]) return true;
            }
        }
        return false;
    }
}

//TC : O(n^2)
//SC : O(1)


//Example 1:
//Input: nums = [1,2,3,1]
//Output: true
//Explanation: The element 1 occurs at the indices 0 and 3.

//Example 2:
//Input: nums = [1,2,3,4]
//Output: false
//Explanation: All elements are distinct.

//Example 3:
//Input: nums = [1,1,1,3,3,4,3,2,4,2]
//Output: true