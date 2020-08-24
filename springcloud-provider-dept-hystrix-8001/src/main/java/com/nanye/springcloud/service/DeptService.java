package com.nanye.springcloud.service;

import com.nanye.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author nanye
 * @version 1.0
 * @date 2020/1/7 14:10
 */
public interface DeptService {

    boolean addDept(Dept dept);

    Dept queryById(Long id);

    List<Dept> queryAll();
}
