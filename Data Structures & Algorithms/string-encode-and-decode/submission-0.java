class Solution {
    private List<String> temp = new ArrayList<>();
    private String output;

    public String encode(List<String> strs) {
        temp = strs;
        return output;
    }

    public List<String> decode(String str) {
        output = str;
        return temp;
    }
}
