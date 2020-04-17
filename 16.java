class Solution {
    public boolean checkValidString(String s) {
        
    Stack<Integer> s1 = new Stack() ;
    Stack<Integer> s2 = new Stack() ;
        
    char[] ch = s.toCharArray() ;
        
    for( int i = 0 ; i < ch.length ; i++ ) {
        
        if(ch[i] == '(') {
            
            s1.push(i);
            
        } else if ( ch[i] == ')') {
            
            if (!s1.isEmpty()) {
                s1.pop() ;
            } else if (!s2.isEmpty()) {
                s2.pop();
            } else {
                return false ;
            }
            
        } else {
            
            s2.push(i);
        }
    }
       while(!s1.isEmpty() && !s2.isEmpty()) {
            Integer value = s2.pop();
            if (s1.peek() < value) {
                s1.pop();
            }
        }

        return s1.isEmpty(); 
        
    }
}
