package com.thoughtworks.spring.learning.springwithaop.Services;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Component
public class MyLogger {

    private List<String> log;


    public MyLogger() {
        log = new ArrayList<>();
    }

    public List<String> getLog() {
        return log;
    }
}
