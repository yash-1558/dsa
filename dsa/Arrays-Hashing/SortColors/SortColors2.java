class Solution {
    public void sortColors(int[] nums) {
        int len = nums.length;
        int left = 0;
        int mid = 0;
        int right = len - 1;
        while(mid <= right) {
            if(nums[mid] == 0) {
                swap(nums[left], nums[mid]);
                left++;
                mid++;
            }
            else if(nums[mid] == 1) mid++;
            else {
                swap(nums[mid],nums[right]);
                right--;
            }
        }
    }
    public void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
