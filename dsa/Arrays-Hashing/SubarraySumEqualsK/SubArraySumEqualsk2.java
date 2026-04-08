class Solution {
    public int subarraySum(int[] nums, int k) {
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int ans = 0;
        int prefixSum = 0;
        for(int x : nums) {
            prefixSum += x;
            if(map.containsKey(prefixSum - k)) {
                ans += map.get(prefixSum - k);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return ans;
    }
}

//tc : O(n)
//sc : O(n)