class Solution {
    public String stringShift(String s, int[][] shift) {
        
        int subStr = 0 ;
        
        for ( int i = 0 ; i < shift.length ; i++ ) {
            if(shift[i][0] == 0 ) {
                subStr += shift[i][1] ;
            } else {
                subStr -= shift[i][1] ;
            }
        }
        
        String result = null ;
        
        if( subStr > 0 ) {
            subStr %= s.length() ;
            String first = s.substring(0, subStr);
            String second = s.substring(subStr) ;
            
            result = second + first ;
        }
        else {
            subStr = Math.abs(subStr) % s.length() ;
            int len = s.length() ;
            
            String first = s.substring(0, len - subStr);
            String second = s.substring(len - subStr) ;
            
            result = second + first ;
            
        }
        
        return result ; 
        
        
    }
}
