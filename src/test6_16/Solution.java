package test6_16;

public class Solution {

        public ListNode removeElements(ListNode head, int val) {
            // 创建虚拟头结点，规避删除头节点的复杂判断
            ListNode dummy = new ListNode(-1);
            dummy.next = head;
            ListNode cur = dummy;

            while (cur.next != null) {
                if (cur.next.val == val) {
                    // 跳过目标节点，完成删除
                    cur.next = cur.next.next;
                } else {
                    // 指针后移
                    cur = cur.next;
                }
            }
            return dummy.next;
        }
    }

