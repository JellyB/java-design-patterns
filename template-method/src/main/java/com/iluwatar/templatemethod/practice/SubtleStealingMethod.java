package com.iluwatar.templatemethod.practice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 描述：微妙的偷取方法 实现 of {@link AbstractStealingMethod}
 *
 * @author biguodong
 * Create time 2018-10-31 下午4:23
 **/
public class SubtleStealingMethod extends AbstractStealingMethod{

    private static final Logger logger = LoggerFactory.getLogger(SubtleStealingMethod.class);
    /**
     * 挑选目标
     *
     * @return
     */
    @Override
    protected String pickedTarget() {
        return "商店老板";
    }

    /**
     * 迷惑目标
     *
     * @param target
     */
    @Override
    protected void confusedTarget(String target) {
        logger.info("泪牛满面的接近{}，并抱住他", target);
    }

    /**
     * 窃取商品
     *
     * @param target
     */
    @Override
    protected void stealTheItem(String target) {
        logger.info("在靠近的同时悄悄摸取{}的钱包~", target);
    }
}
