package com.source.read.annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

/**
 * <p>
 *
 * </p>
 *
 * @author zhāngshìchāng
 * @date 2021/3/17 3:00 下午
 */
@Configuration
public class ComponentConfig {


	@Bean
	public ComponentY componentY() {
		System.out.println("componentY 实例化 之前调用" + componentX());
		return new ComponentY();
	}

	@Bean
	public ComponentX componentX() {
		return new ComponentX();
	}


	public static class ComponentX {
	}

	public static class ComponentY {

	}
}
