class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            int key = entry.getKey();
            if(value > len/2) {
                ans = key;
                break;
            }
        }
        return ans;
    }
}

//TC : O(n)
//SC : O(n)


//Example 1:
//Input: nums = [3,2,3]
//Output: 3

//Example 2:
//Input: nums = [2,2,1,1,1,2,2]
//Output: 2

//Follow-up: Could you solve the problem in linear
// time and in O(1) space?