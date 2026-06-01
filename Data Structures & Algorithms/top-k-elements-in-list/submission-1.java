class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        int i = 0;
        for (Map.Entry<Integer, Integer> entry : entries) {
            if (k == i) break;
            ans[i] = entry.getKey();
            i++;
        }

        return ans;
    }
}
