class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        
        int shift = 0 ;
        
        while ( m < n ) {
            
            m >>= 1 ;
            n >>= 1 ;
            shift++ ;
        }
        
        return n << shift ;         
    
    }
}
