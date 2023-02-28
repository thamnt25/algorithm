import java.util.Stack;

public class PalindromeLinkedList234 {
    public static void main(String[] args) {
       ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        //ListNode head = new ListNode(1, new ListNode(2));
       System.out.print(isPalindrome(head));
    }

    //head = [1,2,6,2,1]
    public static boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode nodes = head;
        int length = 1;
        while (nodes.next != null) {
            length++;
            nodes = nodes.next;
        }
        int mid = length / 2;
        int isOdd = length % 2;
        while(head != null) {
            if (mid != 0) {
                stack.push(head.val);

                mid --;
            } else {
                if (isOdd == 0) {
                    int val = stack.pop();
                    if (val != head.val) {
                        return false;
                    }
                } else {
                    isOdd = 0;
                }
            }
            head = head.next;
        }
        return true;
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
