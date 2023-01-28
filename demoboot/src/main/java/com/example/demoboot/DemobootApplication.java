package com.example.demoboot;

import com.yomahub.liteflow.core.FlowExecutor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemobootApplication {

    public static void main(String[] args) {
//        ConfigurableApplicationContext context = SpringApplication.run(DemobootApplication.class, args);
//        FlowExecutor flowExecutor = context.getBean(FlowExecutor.class);
//        try {
//            flowExecutor.execute2Resp("chain1");
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

        SpringApplication.run(DemobootApplication.class, args);
    }

}
