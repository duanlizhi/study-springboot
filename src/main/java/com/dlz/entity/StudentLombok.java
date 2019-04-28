package com.dlz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p> Package: com.dlz.entity </p>
 * <p> Description: (用一句话描述该文件做什么) </p>
 *
 * @author lizhi_duan
 * @version 1.0
 * @date 2019/4/28 15:53
 */
@Data
@NoArgsConstructor//不带参数的构造函数
@AllArgsConstructor//带所有参数的构造函数
public class StudentLombok {
    private String name;
    private int age;
}
