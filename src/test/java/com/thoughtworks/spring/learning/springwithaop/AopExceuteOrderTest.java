package com.thoughtworks.spring.learning.springwithaop;

import com.thoughtworks.spring.learning.springwithaop.Services.MyLogger;
import com.thoughtworks.spring.learning.springwithaop.Services.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AopExceuteOrderTest {
    @Autowired
    public MyService service;

    @Autowired
    public MyLogger logger;

    @Test
    public void should_order_by_advice_order() {
        service.logService();
        assertThat(logger.getLog().size()).isEqualTo(4);
        assertThat(logger.getLog().get(0)).isEqualTo("before method");
        assertThat(logger.getLog().get(1)).isEqualTo("method execute");
        assertThat(logger.getLog().get(2)).isEqualTo("after method");
        assertThat(logger.getLog().get(3)).isEqualTo("after return");
    }
}
