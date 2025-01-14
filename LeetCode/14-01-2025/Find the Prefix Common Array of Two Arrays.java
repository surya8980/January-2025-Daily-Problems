class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> a_hs = new HashSet<>();
        HashSet<Integer> b_hs = new HashSet<>(); 
        int n = A.length;
        int [] pre_a = new int[n];
        for(int i=0;i<n;i++){
            if(A[i]==B[i]) pre_a[i]+=1;
            if(b_hs.contains(A[i]))pre_a[i]+=1;
            if(a_hs.contains(B[i]))pre_a[i]+=1;
            a_hs.add(A[i]);
            b_hs.add(B[i]);
        }
        int res []=new int[n];
        res[0]=pre_a[0];
        for(int i=1;i<n;i++){
            res[i]=res[i-1]+pre_a[i];
        }
        return res;
    }
}
