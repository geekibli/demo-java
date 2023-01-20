package com.learn.java.thread.disruptor;

import com.learn.java.thread.disruptor.event.LongEvent;
import com.lmax.disruptor.RingBuffer;

import java.nio.ByteBuffer;

public class LongEventProducer {

    public final RingBuffer<LongEvent> ringBuffer;

    public LongEventProducer(RingBuffer<LongEvent> ringBuffer) {
        this.ringBuffer = ringBuffer;
    }

    public void onData(ByteBuffer byteBuffer) {
        long sequence = ringBuffer.next();
        try {
            LongEvent longEvent = ringBuffer.get(sequence);
            long data = byteBuffer.getLong(0);
            longEvent.setValue(data);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } finally {
            System.out.println("生产数据完成。。。。");
            ringBuffer.publish(sequence);
        }
    }
}
