/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        while(pre != null){
            pre=reverse(pre,k);
        }
        //System.out.println("here2");
        return dummy.next;
        
    }
    private ListNode reverse(ListNode pre, int k){
        ListNode cur;
        ListNode last = pre;
        ListNode next;
        int i;
        for(i =0; i < k && last != null ; i++){
            last = last.next;
        }
        //System.out.println(i);
        if(i == k && last != null){
            //System.out.println("last is "+last.val);
            ListNode tail = pre.next;
            last = last.next;
            cur = pre.next.next;
            for(int j = 0 ; j < k&& cur != last; j++){
                //System.out.println("cur is "+ cur.val);
                next = cur.next;
                cur.next = pre.next;
                tail.next = next;
                pre.next = cur;
                cur = next;
                //System.out.println("here");
            }
            return tail;
        }
        else
            return null;
    }
    

}