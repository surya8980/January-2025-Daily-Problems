class Solution {
    public int countPalindromicSubsequence(String s) {
        HashSet<Character> hs = new HashSet<>();
        for(char c:s.toCharArray()){
            hs.add(c);
        }
        int ans=0;
        for(char c : hs){
            int i=-1;
            int j=0;
            for(int k=0;k<s.length();k++){
                if(s.charAt(k)==c){
                    if(i==-1)i=k;
                    j=k;
                }
            }
        Set<Character> seen= new HashSet<>();
        for(int k=i+1;k<j;k++){
            seen.add(s.charAt(k));
        }
        ans+=seen.size();
        }
        return ans;
    }
}
