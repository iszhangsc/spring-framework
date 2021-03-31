package com.source.read.annotation;

import com.source.read.annotation.bean.BeanA;
import com.source.read.annotation.bean.BeanAFactoryPostProcessor;
import com.source.read.annotation.bean.ComponentConfig;
import com.source.read.annotation.bean.Customize;
import com.source.read.annotation.bean.CustomizeBeanFactory;
import com.source.read.annotation.bean.ImportBeanDefinitionRegistrarBean;
import com.source.read.annotation.bean.ImportSelectorBean;
import com.source.read.circulardependency.CircularA;
import com.source.read.circulardependency.CircularDependencyMainApplication;
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
		ApplicationContext context = new AnnotationConfigApplicationContext(MainApplication.class);
//		System.out.println("注解版 ImportBeanDefinitionRegistrarBean--->" + context.getBean(ImportSelectorBean.class));
		System.out.println(" 注解版 MainApplication---->" + context.getBean(MainApplication.class));
		System.out.println(" 注解版 使用 @Component 配置的 @Bean 对象---->" + context.getBean("componentX"));
		System.out.println(" 注解版 CustomizeBeanFactory---->" + context.getBean(CustomizeBeanFactory.class));
		System.out.println(" 注解版 CustomizeBeanFactory---->" + context.getBean("customizeBeanFactory"));
		System.out.println(" 注解版 Customize---->" + context.getBean(Customize.class));
	}


	@Test
	@DisplayName("循环依赖测试")
	public void circularDependencyTest() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CircularDependencyMainApplication.class);
		System.out.println("CircularA" + applicationContext.getBean(CircularA.class));
	}


	@Test
	@DisplayName("IOC XML初始化")
	public void iocXmlTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		System.out.println("XML版  BeanA---->" + context.getBean(XBeanA.class));
	}



}
