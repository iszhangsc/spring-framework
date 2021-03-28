package com.source.read.annotation.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * <p>
 *
 * </p>
 *
 * @author zhangshichang
 * @date 2021-03-27 22:11
 */
@Component
public class CustomizeBeanFactory implements FactoryBean<Customize> {

	@Override
	public Customize getObject() throws Exception {
		return new Customize();
	}

	@Override
	public Class<?> getObjectType() {
		return Customize.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
