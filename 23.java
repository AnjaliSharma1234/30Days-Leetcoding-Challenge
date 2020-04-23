class Solution {
    public int subarraySum(int[] nums, int k) {
        
       HashMap < Integer , Integer > a = new HashMap() ; 
        a.put( 0 , 1 ) ;
        int sum = 0 ;
        int count = 0 ;
        
        for ( int i = 0 ; i < nums.length ; i++ ) {
            
            sum += nums[i] ;
            
            if ( a.containsKey( sum - k ) ) {
                
                count += a.get( sum - k ) ;
            }
            
            a.put( sum , a.getOrDefault(sum,0) + 1 ) ; 
            
            
        }
        
        return count ;
    }
}
