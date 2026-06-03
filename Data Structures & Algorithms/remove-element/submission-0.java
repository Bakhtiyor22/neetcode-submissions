class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while(i < n){
            if(nums[i] == val){
                swap(nums, i, n-1);
                n--;
            } else i++;
        }


        return n;
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}