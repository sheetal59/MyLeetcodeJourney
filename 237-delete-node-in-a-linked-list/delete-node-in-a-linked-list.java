/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        //replacing the value of node with the value of it's next
        node.val = node.next.val;
        //node's value is changed to it's next and now we will point it's next to other next
        //automatically node will get deleted
        node.next = node.next.next;
        
    }
}