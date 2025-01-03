class Solution {
    public int waysToSplitArray(int[] nums) {
        //create a prefix sum and suffix sum 
        int n  = nums.length;
        long []pre = new long[n];
        long [] suf = new long[n];
        pre[0]=nums[0];
        for(int i=1;i<n;i++){
            pre[i]=nums[i]+pre[i-1];
        }
        suf[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suf[i]=nums[i]+suf[i+1];
        }
        int count =0;
        for(int i=0;i<n-1;i++){
            if(pre[i]>=suf[i+1])count++;
        }
        return count;
    }
}
