class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int cumsum = 0;
        HashMap<Integer,Integer> hm = new HashMap<>(); // sum and number of ways to get that sum
        hm.put(0,1); // initially have a sum 0 in 1 way
        for(int i=0;i<nums.length;i++){
            cumsum +=nums[i];  // add arr[i] to sum
            if(hm.containsKey(cumsum-k)){ 
                count+=hm.get(cumsum-k);
            }
            hm.put(cumsum,hm.getOrDefault(cumsum,0)+1);
        }
        return count;
    }
    public int countSubarrays(int arr[], int k) {
        // code here
        return subarraySum(arr,k);
        
    }
}
