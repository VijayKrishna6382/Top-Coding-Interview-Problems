package LinkedList;

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
    public ListNode middleNode(ListNode head) {

    /*
        ListNode temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        cnt=(cnt/2)+1;
        temp=head;
        cnt--;
        while(cnt>0){
            cnt-=1;
            temp=temp.next;
        }
        return temp;

    */
       if (head==null) {
        return null;
       }
       ListNode slow=head;
       ListNode fast=head;
       while(fast !=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
       }
       return slow;
    }
}
