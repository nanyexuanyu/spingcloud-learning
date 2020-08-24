package com.nanye.springcloud.service;

import com.nanye.springcloud.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author nanye
 * @version 1.0
 * @date 2020/1/13 18:49
 */
@Component
public class DeptClientServiceFlallbackFactory implements FallbackFactory {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept queryById(Long id) {
                return new Dept()
                        .setDeptno(id)
                        .setDname("已降级，服务被关闭")
                        .setDb_source("没有数据");
            }

            @Override
            public List<Dept> queryAll() {
                return null;
            }

            @Override
            public Boolean addDept(Dept dept) {
                return null;
            }
        };
    }
}
