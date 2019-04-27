package com.dlz.dao;

import com.dlz.entity.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p> Package: com.dlz.dao </p>
 * <p> Description: (用一句话描述该文件做什么) </p>
 *
 * @author lizhi_duan
 * @version 1.0
 * @date 2019/4/26 20:15
 */
@Mapper
public interface ISomeDao {
     int saveStudent(Student student);
}
