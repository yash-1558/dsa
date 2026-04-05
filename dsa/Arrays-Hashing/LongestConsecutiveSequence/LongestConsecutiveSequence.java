class Solution {
    public int longestConsecutive(int[] nums) {
        int len = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums) {
            set.add(x);
        }
        int answer = 0;
        for(int x : set) {
            if(!set.contains(x - 1)) {
                int maxLen = 1;
                while(set.contains(x + maxLen)) {
                    maxLen++;
                }
            }
            answer = Math.max(answer, maxLen);
        }
        return answer;
    }
}



//Example 1:
//Input: nums = [100,4,200,1,3,2]
//Output: 4
//Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

//Example 2:
//Input: nums = [0,3,7,2,5,8,4,6,0,1]
//Output: 9

//Example 3:
//Input: nums = [1,0,1,2]
//Output: 3
