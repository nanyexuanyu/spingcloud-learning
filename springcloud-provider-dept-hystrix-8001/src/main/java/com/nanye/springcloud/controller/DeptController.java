package com.nanye.springcloud.controller;

import com.nanye.springcloud.pojo.Dept;
import com.nanye.springcloud.service.DeptService;
import com.nanye.springcloud.service.DeptServiceImpl;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nanye
 * @version 1.0
 * @date 2020/1/7 14:21
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @HystrixCommand(fallbackMethod = "hystrixGet")
    @GetMapping("/dept/get/{id}")
    public Dept queryById(@PathVariable("id") Long id){
        Dept dept = deptService.queryById(id);

        if (dept == null){
            throw  new RuntimeException("nonono");
        }

        return dept;
    }

    //备选方法
    public Dept hystrixGet(@PathVariable("id") Long id){
        return new Dept()
                .setDeptno(id)
                .setDname("id=>"+id+"，没有对应信息,@Hystrix")
                .setDb_source("no this database");
    }
}
