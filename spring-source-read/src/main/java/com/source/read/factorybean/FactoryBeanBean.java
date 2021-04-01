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
public class FactoryBeanBean implements FactoryBean<CustomizeBean> {

	@Override
	public CustomizeBean getObject() throws Exception {
		System.out.println("CustomizeBean 是由 FactoryBeanBean 创建 ");
		return new CustomizeBean();
	}

	@Override
	public Class<?> getObjectType() {
		return CustomizeBean.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
