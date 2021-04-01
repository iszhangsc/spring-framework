package com.source.read.all;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * <p>
 * SpringBean 初始化生命周期顺序研究
 * </p>
 *
 * @author zhāngshìchāng
 * @date 2021/3/29 4:46 下午
 */
@Component
public class InitializationLifeCycleBean implements BeanFactoryAware, ApplicationContextAware, InitializingBean, BeanPostProcessor, SmartInitializingSingleton {


	private BeanFactory beanFactory;

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("执行了 InitializationLifeCycleBean setBeanFactory");
		this.beanFactory = beanFactory;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("执行了 InitializationLifeCycleBean setApplicationContext");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("执行了 InitializationLifeCycleBean postProcessBeforeInitialization");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("执行了 InitializationLifeCycleBean postProcessAfterInitialization");
		return bean;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("执行了 InitializationLifeCycleBean afterPropertiesSet");
	}


	@Override
	public void afterSingletonsInstantiated() {
		System.out.println("执行了 InitializationLifeCycleBean afterSingletonsInstantiated ");
	}

}
