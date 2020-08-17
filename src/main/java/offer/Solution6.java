package offer;




public class Solution6 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public int[] reversePrint(ListNode head) {
        if (head == null) {
            return new int[0];
        }

        int len = 0;
        ListNode tmp = head;
        while (tmp != null) {
            len++;
            tmp = tmp.next;
        }
        int[] result = new int[len];
        int i = len - 1;
        tmp = head;
        while (tmp != null) {
            result[i] = tmp.val;
            i--;
            tmp = tmp.next;

        }
        return result;


    }
}
