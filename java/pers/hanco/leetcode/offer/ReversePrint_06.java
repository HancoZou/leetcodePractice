package pers.hanco.leetcode.offer;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author Hanco on 2020/11/14
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）
 */
public class ReversePrint_06 {
    public static void main(String[] args) {
        ListNode node = new ReversePrint_06().init();
        int[] result = new ReversePrint_06().reversePrint_1(node);
        System.out.println(Arrays.toString(result));
        result = new ReversePrint_06().reversePrint_2(node);
        System.out.println(Arrays.toString(result));
    }

    private ListNode init() {
        ListNode third = new ListNode(3);
        ListNode second = new ListNode(2);
        second.next = third;
        ListNode first = new ListNode(1);
        first.next = second;

        return first;
    }

    private int[] reversePrint_1(ListNode head) {
        LinkedList<Integer> tempStack = new LinkedList<>();
        int size = 0;
        while (head != null) {
            tempStack.addFirst(head.val);
            head = head.next;
            size++;
        }

        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = tempStack.removeFirst();
        }

        return result;
    }

    private int[] reversePrint_2(ListNode head) {
        ListNode node = head;
        int size = 0;
        while (node != null) {
            node = node.next;
            size++;
        }

        int[] result = new int[size];
        for (int i = size -1; i >= 0; i--) {
            result[i] = head.val;
            head = head.next;
        }

        return result;
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
