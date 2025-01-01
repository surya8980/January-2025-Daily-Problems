class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int[] zero = new int[n + 1];
        int[] ones = new int[n + 1];
        for (int i = 0; i < n; i++) {
            zero[i + 1] = zero[i] + (s.charAt(i) == '0' ? 1 : 0);
        }
        for (int i = n - 1; i >= 0; i--) {
            ones[i] = ones[i + 1] + (s.charAt(i) == '1' ? 1 : 0);
        }
        int maxScore = 0;
        for (int i = 1; i < n; i++) {
            int left = zero[i];         
            int right = ones[i];         
            maxScore = Math.max(maxScore, left + right);
        }
        
        return maxScore;
    }
}
