class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
     
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                for(int k = j + 1; k < nums.length; k++){
                    for(int l = k + 1; l < nums.length; l++){
                        if(nums[i] + nums[j]+ 0L+ nums[k] + nums[l] == target){
                            res.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        }
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }
}