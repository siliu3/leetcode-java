/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenhead = even;
        boolean oddround = true;
        while(odd!=null&&even!=null){
            if(oddround){
                odd.next = even.next;
                if(odd.next!=null)
                    odd = odd.next;
                oddround = !oddround;
            }else{
                even.next = odd.next;
                even = even.next;
                oddround = !oddround;
            }
        }
        odd.next = evenhead;
        return head;
    }
}
