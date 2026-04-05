class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        List<Integer>[] buckets = new ArrayList<>[len + 1];
        for (int key : map.keySet()) {
            int count = map.get(key);
            if (buckets[count] == null) buckets[count] = new ArrayList<>();
            buckets[count].add(key);
        }
        int index = 0;
        int result[] = new int[k];
        for (int i = buckets.length - 1; i >= 0; i--) {
            if (buckets[i] != null) {
                for (int x : buckets[i]) {
                    result[index++] = x;
                    if (index == k) return result;
                }
            }
        }
        return result;
    }
}

//TC: O(n + m), where n is the length of nums and m is the number of unique elements
//    - Building frequency map: O(n)
//    - Filling buckets: O(m)
//    - Collecting top k: O(m + k) in worst case, but dominated by O(n + m)
//SC: O(n + m), where n is for the buckets array (size len+1) and m for storing unique elements in lists
