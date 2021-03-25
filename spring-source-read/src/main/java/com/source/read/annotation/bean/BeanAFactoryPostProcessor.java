package com.source.read.annotation.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
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
public class BeanAFactoryPostProcessor implements BeanDefinitionRegistryPostProcessor, PriorityOrdered {

	public BeanAFactoryPostProcessor() {
		System.out.println("实例化：BeanAFactoryPostProcessor");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition beanA = beanFactory.getBeanDefinition("beanA");
		beanA.setScope(BeanDefinition.SCOPE_PROTOTYPE);
		System.out.println("执行 BeanAFactoryPostProcessor postProcessBeanFactory");
	}

	@Override
	public int getOrder() {
		return 0;
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("执行 BeanAFactoryPostProcessor postProcessBeanDefinitionRegistry");
	}

}
