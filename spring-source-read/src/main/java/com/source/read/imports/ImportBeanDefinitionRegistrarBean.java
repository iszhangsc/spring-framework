package com.source.read.imports;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * <p>
 *
 * </p>
 *
 * @author zhāngshìchāng
 * @date 2021/3/30 3:55 下午
 */
public class ImportBeanDefinitionRegistrarBean implements ImportBeanDefinitionRegistrar {


	public ImportBeanDefinitionRegistrarBean() {
		System.out.println("实例化了 ImportBeanDefinitionRegistrarBean");
	}


	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
		System.out.println("调用了ImportBeanDefinitionRegistrarBean registerBeanDefinitions");
	}


}
