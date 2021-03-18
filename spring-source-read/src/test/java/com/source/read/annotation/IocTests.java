package com.source.read.annotation;

import com.source.read.annotation.bean.BeanA;
import com.source.read.annotation.bean.ComponentConfig;
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
		System.out.println(" 注解版 MainApplication---->" + context.getBean(MainApplication.class));
		System.out.println(" 注解版 使用 @Component 配置的 @Bean 对象---->" + context.getBean("componentX"));
		System.out.println(" 注解版 BeanA---->" + context.getBean(BeanA.class));
	}


	@Test
	@DisplayName("IOC XML初始化")
	public void iocXmlTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		System.out.println("XML版  BeanA---->" + context.getBean(XBeanA.class));
	}



}
