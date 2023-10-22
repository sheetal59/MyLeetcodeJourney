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
    public ListNode sortList(ListNode head) {
        //base case--
        if(head==null || head.next==null){
            return head;
        }
        //step1--find the mid node
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow;
        //Sorting left and right half
        ListNode rightHead = mid.next;
        mid.next = null;
        ListNode newLeft = sortList(head);
        ListNode newRight = sortList(rightHead);
        //merge both parts
        return merge(newLeft, newRight);
    }
    private ListNode merge(ListNode head1, ListNode head2){
        ListNode mergedLL = new ListNode(-1);
        ListNode temp = mergedLL;
        while(head1!=null && head2!=null){
            if(head1.val<=head2.val){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
            //for remaining elements if present
            while(head1!=null){
                temp.next=head1;
                head1 = head1.next;
                temp = temp.next;
            }
            while(head2!=null){
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
       return mergedLL.next;    
    }
}