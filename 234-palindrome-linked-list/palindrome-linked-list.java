/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        //Step 1-- Finding the middle point-- using slow fast approach
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //Step 2-- After finding the mid node, we will reverse it from there;
        //base case-- if ll is empty
        if(head == null || head.next==null){
            return true;
        }
        ListNode midNode = slow;
        //reverse step
        ListNode prev = null;
        ListNode curr = midNode;
        ListNode next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //Check both parts- left and right-- if equal then palindrome
        ListNode left = head;
        ListNode right = prev;
        while(right!=null){
            if(left.val != right.val){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
        
    }
}