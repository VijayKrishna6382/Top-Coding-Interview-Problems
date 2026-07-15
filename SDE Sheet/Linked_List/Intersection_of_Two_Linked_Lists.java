package LinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       /*
        HashSet<ListNode> set=new HashSet<>();
        ListNode temp=headA;
        while(temp!=null){
            set.add(temp);
            temp=temp.next;
        }
        temp=headB;
        while(temp!=null){
            if(set.contains(temp)){
                return temp;
            }
            temp=temp.next;
        }
        return null;
        */
      ListNode l1=headA;
      ListNode l2=headB;
      while(l1!=l2){
        l1=l1==null?headB:l1.next;
        l2=l2==null?headA:l2.next;
      }
      return l1;
    
    }
}