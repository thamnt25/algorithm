public class AddTwoNumbers2 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        addTwoNumbers(l1, l2);
    }

    /*Input: l1 = [2,4,3,6,5], l2 = [5,6,4,3,5]
    Output: [7,0,8]
    Explanation: 342 + 465 = 807.
    Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
*/
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = carry;
           int x = (l1 != null) ? l1.val : 0;
           int y = (l2 != null) ? l2.val : 0;
           sum += x + y;
           carry = sum / 10;
           current.next = new ListNode(sum % 10);
           current = current.next;
           if (carry != 0) {
               current.next = new ListNode(carry);
           }
           l1 = (l1 != null) ? l1.next : null;
           l2 = (l2 != null) ? l2.next : null;
        }
        return dummy.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
