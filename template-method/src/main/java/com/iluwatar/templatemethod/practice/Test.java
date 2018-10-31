package com.iluwatar.templatemethod.practice;

import java.util.Arrays;

/**
 * 描述：
 *
 * @author biguodong
 * Create time 2018-10-31 上午10:35
 **/
public class Test {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 2, 2, 3, 3, 3, 2, 2, 1, 1, 1, 1, 2, 2, 3, 2, 1, 2, 3, 2, 1, 2, 3, 2, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        int oneSize = Arrays.stream(array).filter(item-> item == 1).map(item -> 1).reduce(0, Integer::sum);
        int twoSize = Arrays.stream(array).filter(item-> item == 2).map(item -> 1).reduce(0, Integer::sum);
        int threeSize = Arrays.stream(array).filter(item-> item == 3).map(item -> 1).reduce(0, Integer::sum);
        System.err.println("one:" + oneSize + "    two:" + twoSize + "   three:" + threeSize);
        System.err.println(array.length);
    }
}
