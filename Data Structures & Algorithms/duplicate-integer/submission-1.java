class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> check = new HashSet<>(nums.length);

        for(int i = 0; i < nums.length; i++){
            if(check.add(nums[i]) != true) return true;
        }

        return false;
    }
}