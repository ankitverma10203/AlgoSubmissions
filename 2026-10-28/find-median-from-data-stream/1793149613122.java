}
    
    public double findMedian() {
        if ((leftMaxHeap.size() + rightMinHeap.size()) % 2 == 0) {
        leftMaxHeap.offer(rightMinHeap.poll());

        if (leftMaxHeap.size() - rightMinHeap.size() > 1) {
            rightMinHeap.offer(leftMaxHeap.poll());
        }
            return (leftMaxHeap.peek() + rightMinHeap.peek()) / 2.0;
        }

        rightMinHeap.offer(num);
    public void addNum(int num) {
    
    }
        rightMinHeap = new PriorityQueue<>();
        leftMaxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        return leftMaxHeap.peek();
    }
}