class Solution {
    public int countElements(int[] arr) {
        
        HashSet<Integer> h = new HashSet<> () ;
        int count = 0 ;
        int x = 0 ;
        
        for ( int i = 0 ; i < arr.length ; i++ ) {
            
            h.add( arr[i] ) ;
            
        }
        
        for ( int i = 0 ; i < arr.length ; i++ ) {
            
            if ( h.contains( arr[i] + 1 ) ){
                
                count++ ;
            }
        }        
        return count ;
    }
}
