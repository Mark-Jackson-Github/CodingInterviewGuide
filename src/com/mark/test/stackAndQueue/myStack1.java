package com.mark.test.stackAndQueue;

import java.util.Stack;

/**
 * @author : mark
 * @Date : 2022/6/9 下午12:01
 * 题目1：“实现一个特殊的栈，在实现栈的基本功能的基础上，再实现返回栈中最小元素的操作。”
 *【要求】
 * 1.pop、push、getMin操作的时间复杂度都是O(1)。
 * 2．设计的栈类型可以使用现成的栈结构。”
 */
public class myStack1 {


    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public myStack1(){
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

    public void push(int newNum){

        if (this.stackMin.isEmpty()){

            this.stackMin.push(newNum);
        }else if (newNum <= this.getmin()){

            this.stackMin.push(newNum);
        }
        this.stackData.push(newNum);
    }



    public int pop(){
        if (this.stackData.isEmpty()){
            throw new RuntimeException("your stack is Empty");
        }
        int value = this.stackData.pop();

        if (value == this.getmin()){
            this.stackMin.pop();
        }
        return value;
    }



    public int getmin(){

        if (this.stackMin.isEmpty()){
            throw new RuntimeException("your stack is Empty");
        }
        return this.stackMin.peek();
    }
}
