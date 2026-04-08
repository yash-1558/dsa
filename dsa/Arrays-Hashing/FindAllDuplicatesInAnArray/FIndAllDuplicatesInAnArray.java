class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> finalList = new ArrayList<>();
        int len = nums.length;
        for(int i = 0; i < len; i++) {
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0) {
                finalList.add(Math.abs(nums[i]));
            }
            nums[index] = -1 * nums[index];
        }
        return finalList;
    }
}

//TC : O(n)
//SC : O(1)

//Example 1:
//Input: nums = [4,3,2,7,8,2,3,1]
//Output: [2,3]

//Example 2:
//Input: nums = [1,1,2]
//Output: [1]

//Example 3:
//Input: nums = [1]
//Output: []