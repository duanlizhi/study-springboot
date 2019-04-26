package com.dlz.service.impl;

import com.dlz.service.SomeService;
import org.springframework.stereotype.Service;

/**
 * <p> Package: com.dlz.service.impl </p>
 * <p> Description: (用一句话描述该文件做什么) </p>
 *
 * @author lizhi_duan
 * @version 1.0
 * @date 2019/4/26 16:11
 */
@Service
public class SomServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("this is some service impl");
    }
}
