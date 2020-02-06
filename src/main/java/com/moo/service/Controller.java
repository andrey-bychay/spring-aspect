package com.moo.service;

import com.moo.Task;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    Task task;

    public Controller(Task task) {
        this.task = task;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/task")
    public void performTask(@RequestParam(value = "ms", defaultValue = "2000") long msecs) {
        try {
            task.execute(msecs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
