package com.mark.test.stackAndQueue;

import java.util.Stack;

/**
 * @author : mark
 * @Date : 2022/6/9 下午11:21
 *
 * 第二种方式：
 * 压入数据规则
 * 假设当前数据为newNum，先将其压入stackData。然后判断stackMin是否为空？
 * 若为空：则newNum压入stackMin;
 * 若不为空：则比较newNum和stackMin的栈顶元素中哪一个更小。
 *
 *
 */
public class myStack2 {

    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public myStack2(){

        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }


    public void push(int newNum){


        if (this.stackMin.isEmpty()){
            this.stackMin.push(newNum);
        }else if (newNum < this.getmin()){
            this.stackMin.push(newNum);
        }else {
            int newMin = this.stackMin.peek();
            this.stackMin.push(newMin);
        }

        this.stackData.push(newNum);
    }

    public int pop(){
        if (this.stackData.isEmpty()){
            throw new RuntimeException("your stack is empty");
        }
        this.stackMin.pop();

        return this.stackData.pop();
    }


    public int getmin(){
        if (this.stackMin.isEmpty()){
            throw new RuntimeException("your stack is empty");
        }

        return this.stackMin.peek();
    }
}
