class Solution {
    public int removeElement(int[] nums, int val) {
        // Two Pointer 1 - O(n); O(1)
        // int k = 0;
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] != val){
        //         nums[k] = nums[i];
        //         k++;
        //     }
        // }

        // return k;

        // Two Pointer 2 - O(n); O(1)
        int i = 0, n = nums.length;
        while(i < n){
            if(nums[i] == val){
                nums[i] = nums[--n];
            }else{
                i++;
            }
        }
        return n;

        // Brute Force - O(n); O(n)
        // List<Integer> tmp = new ArrayList<>();
        // for(int num : nums){
        //     if(num != val){
        //         tmp.add(num);
        //     }
        // }

        // for(int i = 0; i < tmp.size(); i++){
        //     nums[i] = tmp.get(i);
        // }

        // return tmp.size();

    }
}