package com.source.read.all;

import com.source.read.circulardependency.CircularDependencyMainApp;
import com.source.read.factorybean.FactoryBeanMainApp;
import com.source.read.factorypostprocessor.BeanFactoryPostProcessorMainApp;
import com.source.read.imports.ImportMainApp;
import com.source.read.postprocessor.PostProcessorMainApp;
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
	@DisplayName("BeanFactoryPostProcessor测试")
	public void iocAnnotationTest() {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanFactoryPostProcessorMainApp.class);
	}

	@Test
	@DisplayName("Import测试")
	public void importTest() {
		ApplicationContext context = new AnnotationConfigApplicationContext(ImportMainApp.class);
	}


	@Test
	@DisplayName("FactoryBean测试")
	public void factoryBeanTest() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(FactoryBeanMainApp.class);
	}


	@Test
	@DisplayName("循环依赖测试")
	public void circularDependencyTest() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CircularDependencyMainApp.class);
	}

	@Test
	@DisplayName("BeanPostProcessor测试")
	public void beanPostProcessorTest() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PostProcessorMainApp.class);
	}


	@Test
	@DisplayName("All测试")
	public void allTest() {
		ApplicationContext context = new AnnotationConfigApplicationContext(AllMainApp.class);
	}



	// ============================================== 上面都是注解版的调用 ========================================== //


	@Test
	@DisplayName("IOC XML测试")
	public void iocXmlTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		System.out.println("XML版  BeanA---->" + context.getBean(XBeanA.class));
	}



}
