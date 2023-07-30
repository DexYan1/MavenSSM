package com.yan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Date: 2023/7/22 - 22:47
 * @Description: com.yan.config
 * @version: 1.0
 */
@Configuration
@ComponentScan({"com.yan.controller", "com.yan.config"})
//开启json数据类型自动转换
@EnableWebMvc
public class SpringMvcConfig {
}
