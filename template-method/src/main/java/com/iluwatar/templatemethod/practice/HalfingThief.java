package com.iluwatar.templatemethod.practice;

/**
 * 描述：半身人小偷使用 {@link AbstractStealingMethod} 偷东西
 *
 * @author biguodong
 * Create time 2018-10-31 下午4:26
 **/
public class HalfingThief {

    private AbstractStealingMethod stealingMethod;

    public HalfingThief(AbstractStealingMethod stealingMethod) {
        this.stealingMethod = stealingMethod;
    }

    public void steal(){
        stealingMethod.steal();
    }

    public void changeMethod(AbstractStealingMethod method){
        this.stealingMethod = method;
    }
}
