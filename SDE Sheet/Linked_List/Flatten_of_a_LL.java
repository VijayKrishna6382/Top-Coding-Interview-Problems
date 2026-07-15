package LinkedList;

/*
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
*/
class Solution {
    public Node flatten(Node head) {
        
    /*
        ArrayList<Integer> list =new ArrayList<>();
        Node temp=head;
        while(temp!=null){
            Node t2=temp;
            while(t2!=null){
                list.add(t2.data);
                t2=t2.bottom;
            }
            temp=temp.next;
        }
        Collections.sort(list);
        return convertbackToLL(list);
        
    }
    public Node convertbackToLL(ArrayList<Integer> list){
        
        Node dummy=new Node(-1);
        Node temp=dummy;
        for(int i=0;i<list.size();i++){
            temp.bottom=new Node(list.get(i));
            temp=temp.bottom;
        }
        return dummy.bottom;
    */
    if(head==null || head.next==null){
        return head;
    }
    Node mergenode=flatten(head.next);
    return merge(head,mergenode);

    }
    public Node merge(Node h1,Node h2){
        Node dummy=new Node(-1);
        Node temp=dummy;
        while(h1!=null && h2!=null){
        if(h1.data<=h2.data){
            temp.bottom=h1;
            h1=h1.bottom;
        }
        else{
            temp.bottom=h2;
            h2=h2.bottom;
        }
        temp.next=null;
        temp=temp.bottom;
        }
        if(h1!=null){
            temp.bottom=h1;
        }
        if(h2!=null){
            temp.bottom=h2;
        }
        return dummy.bottom;
    }
}