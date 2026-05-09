class Solution {
    public int removeDuplicates(int[] nums) {
        // int j = 0;
        // for(int i = 1; i < nums.length; i++){
        //     if(nums[i] != nums[j]){
        //         j++;
        //         nums[j] = nums[i];
                
        //     }
        // }
        // return j+1;

        // Brute Force
        TreeSet<Integer> set = new TreeSet<>();
        for(int num : nums){
            set.add(num);
        }
        int i = 0;
        for(int num : set){
            nums[i] = num;
            i++;
        }

        return set.size();
    }
}