package com.jim.mybatis.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jim on 2017/9/21.
 * This class is ...
 */
@Configuration
@MapperScan(basePackages = {"com.jim.mybatis.model.mapper"})
public class AppConfig {
}
