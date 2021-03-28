package com.source.read.annotation;

import com.source.read.annotation.bean.BeanA;
import com.source.read.annotation.bean.BeanAFactoryPostProcessor;
import com.source.read.annotation.bean.ComponentConfig;
import com.source.read.annotation.bean.Customize;
import com.source.read.annotation.bean.CustomizeBeanFactory;
import com.source.read.xml.bean.XBeanA;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>
 * IOC测试
 * </p>
 *
 * @author zhāngshìchāng
 * @date 2021/3/16 11:32 上午
 */
public class IocTests {


	@Test
	@DisplayName("IOC注解版初始化")
	public void iocAnnotationTest() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(MainApplication.class);
		context.addBeanFactoryPostProcessor(new BeanAFactoryPostProcessor());
		context.refresh();
		System.out.println(" 注解版 MainApplication---->" + context.getBean(MainApplication.class));
		System.out.println(" 注解版 使用 @Component 配置的 @Bean 对象---->" + context.getBean("componentX"));
		System.out.println(" 注解版 CustomizeBeanFactory---->" + context.getBean(CustomizeBeanFactory.class));
		System.out.println(" 注解版 CustomizeBeanFactory---->" + context.getBean("customizeBeanFactory"));
		System.out.println(" 注解版 Customize---->" + context.getBean(Customize.class));
	}


	@Test
	@DisplayName("IOC XML初始化")
	public void iocXmlTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		System.out.println("XML版  BeanA---->" + context.getBean(XBeanA.class));
	}



}
