class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // // solution 1 - Sorting
        // HashMap<String, List<String>> res = new HashMap<>();

        // for(String s : strs){
        //     char[] charArray = s.toCharArray();
        //     Arrays.sort(charArray);
        //     String sortedS = new String(charArray);
        //     res.putIfAbsent(sortedS, new ArrayList<>());
        //     res.get(sortedS).add(s);
        // }

        // return new ArrayList<>(res.values());

        // solution 2 - Frequency Array
        HashMap<String, List<String>> res = new HashMap<>();

        for(String s : strs){
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c-'a']++;
            }
            String sortedS = Arrays.toString(count);
            res.putIfAbsent(sortedS, new ArrayList<>());
            res.get(sortedS).add(s);
        }

        return new ArrayList<>(res.values());
    }
}
