class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue <> () ;
        
        for ( int stone : stones) {
            maxHeap.add(-stone);
        }
        
        while ( maxHeap.size() > 1 ) {
            int StoneOne = -maxHeap.remove();
            int StoneTwo = -maxHeap.remove();
            
            if ( StoneOne != StoneTwo ) {
                maxHeap.add(-(StoneOne - StoneTwo));
            }
        }
        
        return maxHeap.isEmpty() ? 0 : -maxHeap.remove() ;
        
    }
}
