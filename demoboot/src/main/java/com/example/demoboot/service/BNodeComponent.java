package com.example.demoboot.service;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

@LiteflowComponent("b")
public class BNodeComponent extends NodeComponent {

    @Override
    public void process() throws Exception {
        System.out.println("BNodeComponent 执行....");
    }
}
