package com.source.read.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 *
 * </p>
 *
 * @author zhāngshìchāng
 * @date 2021/3/16 11:29 上午
 */
@Configuration(proxyBeanMethods = false)
@ComponentScan(basePackages = {"com.source.read"})
public class MainApplication {

}
