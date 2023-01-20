package com.learn.java.thread.disruptor.event;

/**
 * 环形数组每个节点的类型
 */
public class LongEvent {

    private Long value;

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }
}
