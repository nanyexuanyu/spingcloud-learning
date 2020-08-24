package com.nanye.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author nanye
 * @version 1.0
 * @date 2020/1/10 22:51
 */
@Configuration
public class NanyeRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
