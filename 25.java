class Solution {
    public boolean canJump(int[] nums) {
        if(nums == null || nums.length ==0) return false;
        if(nums.length == 1) return true;
        //just keep on checking the maximum we can reach from each step and also check at each step if the present index in less than maximum we can reach.
        int max_index = 0;
        int i =0;
        while(i<nums.length)
        {
            if(max_index >= nums.length-1) return true;
            if(i<=max_index && max_index <(nums[i]+i))
            {
                max_index = nums[i]+i;
                i++;
            }
            else if(i>max_index)
            {
                return false;
            }
            else i++;
        }
        return max_index>=nums.length-1;
    }
}
