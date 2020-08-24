package com.nanye.springcloud.dao;

import com.nanye.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author nanye
 * @version 1.0
 * @date 2020/1/6 19:33
 */
@Mapper
@Repository
public interface DeptDao {

    boolean addDept(Dept dept);

    Dept queryById(Long id);

    List<Dept> queryAll();
}
