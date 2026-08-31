class Solution {
    public boolean hasDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; ++i){
            for (int j = nums.length-1; j > 0; --j){
                if ((i < j) && nums[j] == nums[i]){
                    return true;
                }
            }
        }
        return false;
    }
}