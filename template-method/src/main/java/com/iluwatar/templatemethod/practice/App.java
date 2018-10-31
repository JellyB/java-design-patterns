package com.iluwatar.templatemethod.practice;

/**
 * 描述：模板方法使用类定义骨架，子类为空白部分提供实现。
 *
 * @author biguodong
 * Create time 2018-10-31 下午4:49
 **/
public class App {

    public static void main(String[] args) {
        HalfingThief halfingThief = new HalfingThief(new HitAndRunStealingMethod());

        halfingThief.steal();

        halfingThief.changeMethod(new SubtleStealingMethod());

        halfingThief.steal();
    }
}
