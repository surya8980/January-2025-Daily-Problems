class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()<k)return false;
        int ch[]= new int[26];
        for(char c: s.toCharArray()){
            ch[c-'a']++;
        }
        int oddcount=0;
        for(int i:ch){
            if(i%2!=0)oddcount++;
        }
        if(oddcount<=k)return true;
        else return false;
    }
}
