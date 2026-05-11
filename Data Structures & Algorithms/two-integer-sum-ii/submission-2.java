class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //  Brute Force - o(n2);  O(1)
        // for(int  i = 0; i < numbers.length; i++){
        //     for(int j = 1; j < numbers.length; j++){
        //         if(numbers[i] + numbers[j] == target){
        //             return new int[] { i + 1, j + 1};
        //         }
        //     }
        // }
        // return new int[0];
    
        // Hashmap - O(n); O(n)
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int i = 0; i < numbers.length; i++){
        //     int tmp = target - numbers[i];
        //     if(map.containsKey(tmp)){
        //         return new int[] { map.get(tmp), i + 1};
        //     }
        //     map.put(numbers[i], i +1);
        // }
        // return new int[0];

        // Two Pointer
        int l = 0, r = numbers.length - 1;
        while(l < r){
            int curSum = numbers[l] + numbers[r];

            if(curSum > target){
                r--;
            }else if(curSum < target){
                l++;
            }else{
                return new int[] {l+1, r+1};
            }
        }
        return new int[0];
    }
}
