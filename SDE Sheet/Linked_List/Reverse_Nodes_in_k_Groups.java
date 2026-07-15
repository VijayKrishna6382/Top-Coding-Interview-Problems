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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prevnode=null;
        while(temp!=null){
            ListNode kthnode=getkthnode(temp,k);
            if(kthnode==null){
                prevnode.next=temp;
                break;
            }
            ListNode nextnode=kthnode.next;
            kthnode.next=null;
            reverse(temp);
            if(temp==head){
                head=kthnode;
            }
            else{
                prevnode.next=kthnode;
            }
            prevnode=temp;
            temp=nextnode;
            
        }
        return head;

    }
    public ListNode getkthnode(ListNode temp,int k){
        k--;
        while(temp!=null && k>0){
            k--;
            temp=temp.next;
        }
        return temp;
    }
    public ListNode reverse(ListNode temp){
        ListNode prev=null;
        while(temp!=null){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;  
        }
        return prev;
    }
}
