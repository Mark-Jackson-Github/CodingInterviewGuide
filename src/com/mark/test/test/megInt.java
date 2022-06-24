package com.mark.test.test;

import java.util.Arrays;

/**
 * @author : mark
 * @Date : 2022/6/19 上午11:26
 *
 * 尝试合并两个int数组
 */
public class megInt {

    public static void main(String[] args) {
        int[] num1 = {1,3,6,8};
        int[] num2 = {2,4,5,9};
        int[] num = new int[num1.length + num2.length];

        int len = num1.length;
        boolean whichLong = true;
        if (num1.length < num2.length){
            len = num2.length;
            //这里说明了如果whichLong=false，则说明num2是较长的那个数组
            whichLong = false;
        }


        for (int i = 0; i < len; i++){

        }

        for (int j = 0; j < num2.length ; j++) {
            num[num1.length + j] = num2[j];
        }




    }
}
