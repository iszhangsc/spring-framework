package com.source.read.factorybean;

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
public class FactoryBeanBean implements FactoryBean<CustomizeFactoryBean> {

	@Override
	public CustomizeFactoryBean getObject() throws Exception {
		System.out.println("CustomizeFactoryBean 是由 FactoryBeanBean 创建 ");
		return new CustomizeFactoryBean();
	}

	@Override
	public Class<?> getObjectType() {
		return CustomizeFactoryBean.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
