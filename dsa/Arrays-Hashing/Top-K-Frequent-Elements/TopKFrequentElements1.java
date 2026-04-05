class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.offer(entry);
            if(pq.size() > k) pq.poll();
        }
        int result[] = new int[k];
        int i = 0;
        while(!pq.isEmpty()) {
            result[i++] = pq.poll().getKey();
        }
        return result;
    }
}

//TC: O(n + m log k), where n is the length of nums, m is the number of unique elements, and k is the given value
//    - Building frequency map: O(n)
//    - Maintaining min-heap of size k: O(m log k)
//    - Extracting elements: O(k log k)
//SC: O(m + k), where m is the number of unique elements (stored in HashMap) and k is the size of PriorityQueue


//Example 1:
//Input: nums = [1,1,1,2,2,3], k = 2
//Output: [1,2]

//Example 2:
//Input: nums = [1], k = 1
//Output: [1]

//Example 3:
//Input: nums = [1,2,1,2,1,2,3,1,3,2], k = 2
//Output: [1,2]

