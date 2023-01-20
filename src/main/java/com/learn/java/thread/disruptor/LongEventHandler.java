package com.learn.java.thread.disruptor;

import com.learn.java.thread.disruptor.event.LongEvent;
import com.lmax.disruptor.EventHandler;

public class LongEventHandler implements EventHandler<LongEvent> {

    private long serial = 0;

    public LongEventHandler(long serial) {
        this.serial = serial;
    }

    public void onEvent(LongEvent longEvent, long l, boolean b) throws Exception {
        System.out.println("event value:  " + longEvent.getValue() + " serial : " + serial );
    }
}
