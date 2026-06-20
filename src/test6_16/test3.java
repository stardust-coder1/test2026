package test6_16;

public class test3 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        int targetVal = 6;
        Solution solution = new Solution();
        ListNode newHead = solution.removeElements(head, targetVal);

        // 遍历打印结果链表
        System.out.print("删除值" + targetVal + "后链表：");
        ListNode p = newHead;
        while (p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
    }
}
