package com.dlz;

import com.dlz.service.SomeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudySpringbootApplicationTests {

    @Resource(name = "somServiceImpl")
    private SomeService someService;
    @Resource(name = "otherServiceImpl")
    private SomeService otherService;

    @Test
    public void contextLoads() {
        someService.doSome();
        otherService.doSome();
    }

}
