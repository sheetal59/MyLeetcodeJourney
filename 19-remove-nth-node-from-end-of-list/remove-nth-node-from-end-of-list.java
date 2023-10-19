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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //calculating the size of LinkedList
        int sz =0;
        ListNode temp = head;
        while(temp!=null){
            temp =  temp.next;
            sz++;
        }
        //covering the corner case when only head node is there
        if(n==sz){
            head = head.next;
             return head;
        }
        //removing case
        int i=1;
        int indx = sz-n; //we have to find index of prev node
        ListNode prev =head;
        while(i<indx){
            prev = prev.next;
            i++;
        }       
     prev.next = prev.next.next;
     return head;
   
    }
}