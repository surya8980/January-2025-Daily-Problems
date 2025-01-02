class Solution {
    public boolean isvowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')return true;
        return false;
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        //create an array of length words if the word starts and end with vowel mark it as 1
        int [] arr = new int[words.length];
        for(int i=0;i<words.length;i++){
            String s = words[i];
            int end=s.length()-1;
            if(isvowel(s.charAt(0))&& isvowel(s.charAt(end))){
                arr[i]=1;
            }
        }
        //precompute arraans
        int []array = new int[words.length];
        array[0]=arr[0];
        for(int k=1;k<words.length;k++){
            array[k]=array[k-1]+arr[k];
        }
        int res[] = new int[queries.length];
        int i=0;
        for(int query[]:queries){
            int start = query[0];
            int end=query[1];
            res[i] = array[end]-(start>0?array[start-1]:0);
            i++;
        }
        return res;
    }
}
