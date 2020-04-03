class Solution {
    public boolean isHappy(int n) {
       HashSet<Integer> seen = new HashSet<>();
    int sum;
    while( n != 1) {
        sum = 0; 
        //current = n;
        while ( n != 0 ){
            sum += ( n % 10 ) * ( n % 10 );
            n /= 10; 
        }

        if ( seen.contains(sum) ) {
            return false;
        }
        seen.add(sum);
        n = sum;
        }
    return true;
    }
}
