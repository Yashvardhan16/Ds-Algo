class Solution {
    public List<String> printVertically(String s) {
  String[] nums = s.split(" ");
        List<String> list = new ArrayList();
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            n = Math.max(n, nums[i].length());
        }

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (String word : nums)
         sb.append(i < word.length() ? word.charAt(i) : ' ');

            while (sb.charAt(sb.length() - 1) == ' ') {
                sb.deleteCharAt(sb.length() - 1);
            }

            list.add(sb.toString());
        }
        return list;
    }
}