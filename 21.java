/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface BinaryMatrix {
 *     public int get(int row, int col) {}
 *     public List<Integer> dimensions {}
 * };
 */

class Solution {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
       
        int result = -1 ;
        
        List< Integer > dim = binaryMatrix.dimensions() ;
        int row = dim.get(0);
        int col = dim.get(1);
        
        if ( row == 0 || col == 0 ) {
            return result ;
        }
        
        int r = 0 ;
        int c = col - 1;
        
        while ( r < row && c >= 0 ) {
            
            if ( binaryMatrix.get( r , c ) == 1 ) {
                
                result = c ;
                c-- ;
                
            } else {
                r++ ;
            }
        }
        
        return result ;
    }
}
