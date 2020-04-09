/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode a = head ;
        ListNode b = head ;
        while ( b != null &&  b.next != null ) {
            
            a = a.next ;
            b = b.next.next ;
            
        }
        
        return a ; 
    }
}
