package com.mark.test.stackAndQueue;

import java.util.Stack;

/**
 * @author : mark
 * @Date : 2022/6/10 上午11:04
 *
 *【题目】
 * 编写一个类，用两个栈实现队列，支持队列的基本操作（add、poll、peek）
 *
 */
public class TwoStacksQueue {

    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;


    public TwoStacksQueue(){

        stackPop = new Stack<Integer>();
        stackPush = new Stack<Integer>();
    }

    public void add(int pushInt){
        stackPush.push(pushInt);
    }

    public int poll(){

        if (stackPush.isEmpty() && stackPop.isEmpty()){
            throw new RuntimeException("Queue is empty");
        }else if (stackPop.empty()){
            while (!stackPush.empty()){
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();

    }

    public int peek(){
        if (stackPop.empty() && stackPush.empty()){
            throw new RuntimeException("Queue is empty");
        }else if (stackPop.empty()){
            while (!stackPush.empty()){
                stackPop.push(stackPush.pop());
            }
        }

        return stackPop.peek();
    }
}
