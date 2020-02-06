package com.moo;

import com.moo.aspects.LogExecutionTime;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class Task {

    @LogExecutionTime
    public void execute(long msecs) throws InterruptedException {
        System.out.println("performing task for " + msecs + "ms");
        TimeUnit.MILLISECONDS.sleep(msecs);
    }
}
