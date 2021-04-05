package com.source.read.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <p>
 *
 * </p>
 *
 * @author zhangshichang
 * @date 2021-04-04 15:40
 */
@Component
public class IJdkProxyBeanImpl implements IJdkProxyBean {

	@Autowired
	private AopBean aopBean;

	@Override
	public void jdk() {
		System.out.println("我是目标方法 jdk");
	}

}
