for (ListNode listHead : lists) {
            minHeap.offer(listHead);
        }

        ListNode res = new ListNode();

        while (!minHeap.isEmpty()) {
            ListNode item = minHeap.poll();
        ListNode curr = res;
            curr.next = item;

        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));
        
    public ListNode mergeKLists(ListNode[] lists) {
class Solution {
 */
 * }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
            if(listHead == null) continue;