package com.example.springboot1.leetcode;

import com.sun.org.apache.bcel.internal.generic.DDIV;

import java.util.*;

/**
 * @author wss
 * @create 2022-12-13-17:23
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {

    public int maxDepth(TreeNode root) {
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        ArrayList<ArrayList<Integer>> integers = new ArrayList<>();

        deque.offer(root);
        while (!deque.isEmpty()) {
            int size = deque.size();
            ArrayList<Integer> rawData = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = deque.poll();
                rawData.add(treeNode.val);
                if (treeNode.left != null) deque.offer(treeNode.left);
                if (treeNode.right != null) deque.offer(treeNode.right);
            }
            integers.add(rawData);
        }
        return integers.size();
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {{1, 3, 5, 7, 9}, {2, 4, 6, 8, 10}, {11, 13, 15, 17, 19}, {12, 14, 16, 18, 20}, {21, 22, 23, 24, 25}};
        int[][] test = {{5}, {6}};
        int[] numb = {2, 2, 2, 0, 1};

        TreeNode t0 = new TreeNode(3);
        TreeNode t1 = new TreeNode(9);
        TreeNode t2 = new TreeNode(20);
        TreeNode t3 = new TreeNode(15);
        TreeNode t4 = new TreeNode(7);
        t0.left = t1;
        t0.right = t2;
        t2.left = t3;
        t2.right = t4;
        System.out.println(solution.maxDepth(t0));
        //        solution.removeNthFromEnd(l1, 1);
//        MyLinkedList linkedList = new MyLinkedList();
//        linkedList.addAtHead(1);
//        linkedList.addAtTail(3);
//        linkedList.addAtIndex(1, 2);
//        int i = linkedList.get(2);
//        System.out.println(i);
//        linkedList.deleteAtIndex(0);
//        System.out.println(linkedList.get(0));
//        ListNode listNode = solution.removeElements(l1, 1);
//        while (listNode != null) {
//            System.out.println(listNode.val);
//            listNode = listNode.next;
//        }

//        solution.isSubStructure(root, root2);
//        solution.levelOrder(r
//        oot);
//        System.out.println(solution.fib(44));

//        System.out.println(solution.firstUniqChar("abaccdeff"));
        //       String s1 = "cbbd";
//        String s2 = s1.substring(1, 1 + 2);
//        System.out.println(s2);
//        System.out.println("位书嵩");
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class ListNode {
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

class MyLinkedList {
    //当前链表的长度
    int size;
    //虚拟头节点
    ListNode dummy;

    public MyLinkedList() {
        dummy = new ListNode(0);
        size = 0;
    }

    /**
     * get(index)：获取链表中第 index 个节点的值。如果索引无效，则返回-1。
     *
     * @param index
     * @return
     */
    public int get(int index) {
        if (index >= size) return -1;
        ListNode cur = dummy;
        for (int i = 0; i <= index; i++) {
            cur = cur.next;
        }
        return cur.val;
    }

    /**
     * 在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。
     *
     * @param val
     */
    public void addAtHead(int val) {
        dummy.next = new ListNode(val, dummy.next);
        size++;
    }

    /**
     * addAtTail(val)：将值为 val 的节点追加到链表的最后一个元素。
     *
     * @param val
     */
    public void addAtTail(int val) {
        ListNode cur = dummy;
        for (int i = 0; i < size; i++) {
            cur = cur.next;
        }
        cur.next = new ListNode(val);
        size++;
    }

    /**
     * @param index
     * @param val
     */
    public void addAtIndex(int index, int val) {
        if (index == size) addAtTail(val);
        else if (index > size) return;
        else if (index <= 0) addAtHead(val);
        else {
            ListNode cur = dummy;
            for (int i = 0; i < index; i++) {
                cur = cur.next;
            }
            cur.next = new ListNode(val, cur.next);
            size++;
        }
    }

    /**
     * 如果索引 index 有效，则删除链表中的第 index 个节点。
     *
     * @param index
     */
    public void deleteAtIndex(int index) {
        if (index >= size || index < 0) return;
        ListNode cur = dummy;
        ListNode pre = dummy;
        for (int i = 0; i <= index; i++) {
            cur = cur.next;
            if (i != index) pre = pre.next;
        }
        pre.next = cur.next;
        size--;
    }
}