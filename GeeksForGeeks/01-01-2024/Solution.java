class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        TreeMap<String,ArrayList<String>> hm = new TreeMap<>();
        for(String s : arr){
            char [] carr= s.toCharArray();
            Arrays.sort(carr);
            String newstr = new String(carr);
            if(!hm.containsKey(newstr)){
                hm.put(newstr,new ArrayList<>());
            }
            hm.get(newstr).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}
