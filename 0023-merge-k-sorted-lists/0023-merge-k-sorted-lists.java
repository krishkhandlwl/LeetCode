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
    // public static class NodeComparator implements Comparator<ListNode> {
    // @Override
    // public int compare(ListNode o1, ListNode o2) {
    //     return o1.val - o2.val;
    // }
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((o1,o2)->o1.val-o2.val);
        
        ListNode head = new ListNode(-1);
        ListNode dummy = head;
        
        for(ListNode list : lists){
            while(list!= null){
                pq.add(list);
                list = list.next;
            }
        }
        while(!pq.isEmpty()){
            head.next = pq.poll();
            head = head.next;
            head.next = null;
        }
        return dummy.next;
    }
}