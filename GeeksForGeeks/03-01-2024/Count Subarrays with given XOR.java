class Solution {
    public long subarrayXor(int arr[], int k) {
        long res = 0;
        int val = 0;
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            val ^= arr[i];
            if(val==k){
                res++;
            }
            if (hm.containsKey(val ^ k)) {
                res += hm.get(val ^ k);
            }
            hm.put(val, hm.getOrDefault(val,0)+1);
        }
        return res;
    }
}
