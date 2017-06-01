/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    class ListComparator implements Comparator<ListNode>{
        public int compare(ListNode l1, ListNode l2){
            if(l1.val > l2.val)
                return 1;
            else if(l1.val<l2.val)
                return -1;
            else
                return 0;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode rst = null;
        int k = lists.length;
        if (k < 1)
            return null;
        Comparator<ListNode> comp = new ListComparator();
        PriorityQueue<ListNode> min = new PriorityQueue<ListNode>(k, comp);
        for(int  i = 0; i < k; i ++){
            if(lists[i] != null)// lists might be [[]]
                min.add(lists[i]);
        }
        if(min.size() > 0){
            rst = min.poll();
            if(rst.next != null)// always check null
                min.add(rst.next);
            ListNode cur = rst;
            while(min.peek() != null){
                cur.next = min.poll();
                cur = cur.next;
                if(cur.next != null)
                    min.add(cur.next);
            }
            cur.next = null;
        }
        return rst;
    }
    
}