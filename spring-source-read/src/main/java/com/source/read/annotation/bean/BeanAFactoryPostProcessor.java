package com.source.read.annotation.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * <p>
 * BeanAFactoryPostProcessor
 * </p>
 *
 * @author zhāngshìchāng
 * @date 2021/3/16 2:13 下午
 */
@Component
public class BeanAFactoryPostProcessor implements BeanFactoryPostProcessor, PriorityOrdered {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition beanA = beanFactory.getBeanDefinition("beanA");
		beanA.setScope(BeanDefinition.SCOPE_PROTOTYPE);
		System.out.println("执行BeanAFactoryPostProcessor");
	}

	@Override
	public int getOrder() {
		return 0;
	}

}
