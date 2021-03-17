package com.source.read.annotation.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
	public ComponentX componentX() {
		return new ComponentX();
	}


	public static class ComponentX {
	}

}
