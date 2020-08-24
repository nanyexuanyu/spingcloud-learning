package com.nanye.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author nanye
 * @version 1.0
 * @date 2020/1/6 13:08
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)  //链式写法
public class Dept implements Serializable {

    private Long deptno;
    private String dname;
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
}
