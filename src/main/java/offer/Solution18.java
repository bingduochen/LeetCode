package offer;

public class Solution18 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return head;
        }

        ListNode p=new ListNode(-1);
        p.next=head;
        ListNode tmp,q;
        q=p;
        tmp=head;
        while (tmp!=null){
            if(tmp.val==val){
                q.next=tmp.next;
                tmp=tmp.next;
                break;
            }else {
                tmp=tmp.next;
                q=q.next;
            }
        }
        return p.next;

    }
}
