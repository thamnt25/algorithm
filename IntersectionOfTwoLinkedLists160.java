public class IntersectionOfTwoLinkedLists160 {
    public static void main(String[] args) {
        //listA = [4,1,8,4,5], listB = [5,6,1,8,4,5]
        ListNode headA = new ListNode(4, new ListNode(1, new ListNode(8, new ListNode(4, new ListNode(5)))));
        ListNode headB = new ListNode(5, new ListNode(6, new ListNode(1, new ListNode(8, new ListNode(4, new ListNode(5))))));
        ListNode intersectionNode = getIntersectionNode(headA, headB);
        System.out.print(intersectionNode);
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode intersectionNode = null;
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        int lengthA = 0;
        int lengthB = 0;
        while (nodeA != null) {
            lengthA++;
            nodeA = nodeA.next;
        }

        while (nodeB != null) {
            lengthB++;
            nodeB = nodeB.next;
        }
        int diff = Math.abs(lengthA - lengthB);
        while (diff != 0) {
            if (lengthA > lengthB) {
                headA = headA.next;
            } else {
                headB = headB.next;
            }
            diff--;
        }
        while (headA != null || headB != null) {
            if (headA == headB) {
                return headA;
            } else {
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        ListNode(int x, ListNode next) {
            this.val = x;
            this.next = next;
        }
    }
}
