package com.thoughtworks.spring.learning.springwithaop.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyService {

    @Autowired
    MyLogger logger;

    @LogService
    public void logService() {
        logger.getLog().add("method execute");
    }
}
