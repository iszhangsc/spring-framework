package com.source.read.annotation;

import com.source.read.annotation.bean.CustomizeDeferredImportSelector;
import com.source.read.annotation.bean.ImportBeanDefinitionRegistrarBean;
import com.source.read.annotation.bean.ImportSelectorBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * <p>
 *
 * </p>
 *
 * @author zhāngshìchāng
 * @date 2021/3/16 11:29 上午
 */
@Import(value = {ImportSelectorBean.class, ImportBeanDefinitionRegistrarBean.class, CustomizeDeferredImportSelector.class})
@Configuration(proxyBeanMethods = false)
@ComponentScan(basePackages = {"com.source.read"})
public class MainApplication {

}
