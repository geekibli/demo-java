package com.learn.java.thread.disruptor;

import com.learn.java.thread.disruptor.event.LongEvent;
import com.learn.java.thread.disruptor.event.LongEventFactory;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.dsl.Disruptor;

import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DisruptorApplication {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        LongEventFactory eventFactory = new LongEventFactory();

        int ringBufferSize = 1024 * 1024;

        Disruptor<LongEvent> disruptor = new Disruptor<LongEvent>(eventFactory, ringBufferSize, executor);
        disruptor.handleEventsWith(new LongEventHandler(1), new LongEventHandler(2));

        disruptor.start();

        RingBuffer<LongEvent> ringBuffer = disruptor.getRingBuffer();

        LongEventProducer producer = new LongEventProducer(ringBuffer);

        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        for (int i = 1; i <= 100 ; i ++) {
            byteBuffer.putLong(0, i);
            producer.onData(byteBuffer);
        }

        disruptor.shutdown();

        executor.shutdown();


    }
}
