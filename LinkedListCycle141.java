import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LinkedListCycle141 {
    public static void main(String[] args) {
        //[3,2,0,-4]
        ListNode head = new ListNode(3, new ListNode(2, new ListNode(0, new ListNode(-4))));
        System.out.print(hasCycle(head));
    }

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (slow != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        ListNode(int x, ListNode next) {
            val = x;
            this.next = next;
        }
    }
}

