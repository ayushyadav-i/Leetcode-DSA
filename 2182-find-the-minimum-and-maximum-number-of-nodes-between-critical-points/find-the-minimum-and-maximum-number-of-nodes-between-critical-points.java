class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return new int[]{-1, -1};
        }
        int firstCritical = -1;
        int prevCritical = -1;   
        int minDistance = Integer.MAX_VALUE;
        int maxDistance = -1;
        ListNode prev = head;
        ListNode curr = head.next;
        int currentIndex = 1;

        while (curr.next != null) {
            ListNode nextNode = curr.next;
            boolean isLocalMaxima = curr.val > prev.val && curr.val > nextNode.val;
            boolean isLocalMinima = curr.val < prev.val && curr.val < nextNode.val;

            if (isLocalMaxima || isLocalMinima) {
                if (firstCritical == -1) {
                    firstCritical = currentIndex;
                } else {
                    minDistance = Math.min(minDistance, currentIndex - prevCritical);
                    maxDistance = currentIndex - firstCritical;
                }
                prevCritical = currentIndex;
            }
            prev = curr;
            curr = nextNode;
            currentIndex++;
        }
        if (maxDistance == -1) {
            return new int[]{-1, -1};
        }

        return new int[]{minDistance, maxDistance};
    }
}
