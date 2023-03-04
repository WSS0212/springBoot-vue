package com.example.springboot1.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author wss
 * @create 2022-12-13-16:45
 */
public class Test {
    Deque<Integer> inStack;
    Deque<Integer> outStack;

    public Test() {
        inStack = new ArrayDeque<>();
        outStack = new ArrayDeque<>();
    }

    public void appendTail(int value) {
        inStack.push(value);
    }

    public int deleteHead() {
        if (outStack.isEmpty()) {
            if (inStack.isEmpty()) {
                return -1;
            }
            in2out();
        }
        return outStack.pop();
    }

    public void in2out() {
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }
    }

}
