package com.dlz.test;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * <p> Package: com.dlz.test </p>
 * <p> Description: (用一句话描述该文件做什么) </p>
 *
 * @author lizhi_duan
 * @version 1.0
 * @date 2019/4/28 09:27
 */
@Slf4j
public class Demo {
    public void Execute(List<String> list,String type) {
        LinkedList<String> linkedList = new LinkedList<>(list);
        try {
            switch (type) {
                case "0":
                case "1":
                case "2":
                case "3":
                case "4":
                    linkedList.addFirst(generate(type));
                    break;
            }
        } catch (Exception e) {
            log.info("新增数据异常，{}", e.getMessage());
        }
        List arrayList = new ArrayList(Arrays.asList("U5","U6","U7"));
        arrayList.add("U8");
    }
    private String generate(String type) {
        return "U" + type;
    }

}
