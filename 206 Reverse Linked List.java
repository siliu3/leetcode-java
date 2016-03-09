/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        else{
            ListNode remain = head.next;
            ListNode tmp;
            head.next = null;
            while(remain!=null){
                tmp = remain.next;
                remain.next = head;
                head = remain;
                remain = tmp;
            }
            return head;
        }
    }
}
