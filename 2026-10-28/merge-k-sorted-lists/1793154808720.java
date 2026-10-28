while(!pq.isEmpty()) {
        ListNode dummy = new ListNode();
            ListNode node = pq.poll();
        ListNode curr = dummy;

            curr.next = node;

            if (node.next != null) {

        }
            pq.offer(node);
        for (ListNode node : lists) {

        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));
    public ListNode mergeKLists(ListNode[] lists) {
class Solution {
 */
 * }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 *     ListNode(int val) { this.val = val; }
 *     ListNode() {}
            if (node == null) continue;