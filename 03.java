public class LC_MaxSubarray {
    public int maxSubArray(int[] nums) {
        int tempSum = 0 , previousSum = 0 ; 
        for ( int i = 0 ; i < nums.length ; i++ ) {
            tempSum += nums[i] ;
            if ( tempSum < 0 ) {
                tempSum = 0 ;
            } 
            if ( tempSum > previousSum ) {
                previousSum = tempSum ;
            }
        }
        return previousSum ;
    }
