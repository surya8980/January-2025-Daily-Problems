class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        //build a prefix sum
        int [] pre = new int[s.length()];
        for(int []shift:shifts){
            int start=shift[0];
            int end=shift[1];
            if(shift[2]==0){
                for(int i=start;i<=end;i++){
                    pre[i]--;
                }
            }else{
                for(int i=start;i<=end;i++){
                    pre[i]++;
                }
            }
        }
        //build the string;
        int num=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            num = (pre[i])%26;
            if(num<0)num+=26;
            sb.append((char)((s.charAt(i)-'a'+num)%26+'a'));
        }
        return sb.toString();
    }
}
