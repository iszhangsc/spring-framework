package com.source.read.imports;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * <p>
 *
 * </p>
 *
 * @author zhāngshìchāng
 * @date 2021/4/1 3:29 下午
 */
@ComponentScan
@Configuration(proxyBeanMethods = false)
@Import(value = {ImportSelectorBean.class, ImportBeanDefinitionRegistrarBean.class, CustomizeDeferredImportSelector.class})
public class ImportMainApp {

}
