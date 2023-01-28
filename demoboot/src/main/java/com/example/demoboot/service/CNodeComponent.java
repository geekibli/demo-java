package com.example.demoboot.service;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

@LiteflowComponent("c")
public class CNodeComponent extends NodeComponent {

    @Override
    public void process() throws Exception {
        System.out.println("CNodeComponent 执行....");
    }
}
