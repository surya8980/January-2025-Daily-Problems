class Solution {
    public int minimumLength(String s) {
        int[] arr = new int[26];
        Arrays.fill(arr, 0);
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] > 2) {
                arr[s.charAt(i) - 'a'] -= 2;
            }
        }
        for (int i = 0; i < 26; i++) {
            ans += arr[i];
        }
        return ans;
    }
}
