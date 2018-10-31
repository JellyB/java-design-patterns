package com.iluwatar.templatemethod.practice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 描述： 直接干偷取方法 实现 of {@link AbstractStealingMethod}
 *
 * @author biguodong
 * Create time 2018-10-31 下午4:25
 **/
public class HitAndRunStealingMethod extends AbstractStealingMethod{

    private static final Logger logger = LoggerFactory.getLogger(HitAndRunStealingMethod.class);

    /**
     * 挑选目标
     *
     * @return
     */
    @Override
    protected String pickedTarget() {
        return "老妖精女人";
    }

    /**
     * 迷惑目标
     *
     * @param target
     */
    @Override
    protected void confusedTarget(String target) {
        logger.info("从后面悄悄靠近{}", target);
    }

    /**
     * 窃取商品
     *
     * @param target
     */
    @Override
    protected void stealTheItem(String target) {
        logger.info("拿起手提包快速逃跑~");
    }
}
