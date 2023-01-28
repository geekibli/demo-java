package com.example.demoboot.service;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

@LiteflowComponent("a")
public class ANodeComponent extends NodeComponent {

    @Override
    public void process() throws Exception {
        System.out.println("ANodeComponent 执行....");
    }
}
