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
    public void reorderList(ListNode head) {
        //find the middle node for splitting the LL in two halves
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast= fast.next.next;
        }
        ListNode mid = slow;
        //reversing the right half
        ListNode curr = mid.next;
        mid.next=null;
        ListNode prev = null;
        ListNode next;
        while(curr!=null){
            next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
        }
        ListNode left = head;
        ListNode right = prev;
        ListNode nextLeft, nextRight;
        //alternate merging
        while(left!=null && right!=null){
            nextLeft = left.next;
        left.next= right;
        nextRight = right.next;
        right.next = nextLeft;
        //updation
        right = nextRight;
        left = nextLeft;
        
        }
    }
}