package com.learn.java.ruleengine;

import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.core.FlowExecutorHolder;
import com.yomahub.liteflow.property.LiteflowConfig;

public class LifeFlowDemo {

    public static void main(String[] args) {
        LiteflowConfig config = new LiteflowConfig();
        config.setRuleSource("flow.xml");
        FlowExecutor flowExecutor = FlowExecutorHolder.loadInstance(config);
        try {
            flowExecutor.execute("chain1", "");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
