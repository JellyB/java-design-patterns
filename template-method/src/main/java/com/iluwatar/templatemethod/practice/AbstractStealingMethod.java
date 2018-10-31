package com.iluwatar.templatemethod.practice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 描述： 抽象模板类
 *
 * @author biguodong
 * Create time 2018-10-31 下午4:18
 **/
public abstract class AbstractStealingMethod {

    private static final Logger logger = LoggerFactory.getLogger(AbstractStealingMethod.class);

    /**
     * 挑选目标
     * @return
     */
    protected abstract String pickedTarget();

    /**
     * 迷惑目标
     * @param target
     */
    protected abstract void confusedTarget(String target);


    /**
     * 偷取
     * @param target
     */
    protected abstract void stealTheItem(String target);

    /**
     * 模板方法
     * 执行顺序
     * 1. 挑选目标
     * 2. 迷惑目标
     * 3. 偷取目标
     */
    public final void steal(){
        String target = pickedTarget();
        logger.info("选中目标 {}.", target);
        confusedTarget(target);
        stealTheItem(target);
    }
}
