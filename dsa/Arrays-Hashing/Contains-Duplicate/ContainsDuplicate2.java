class Solution {
    public boolean containsDuplicate(int[] nums) {
        int len = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums) {
            if(set.contains(x)) return true;
            set.add(x);
        }
        return false;
    }
}

//TC : O(n)
//SC : O(n)


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