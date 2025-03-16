package LInkedList;

//reverse the linked list
class Solution {
    Node reverseList(Node head) {
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
