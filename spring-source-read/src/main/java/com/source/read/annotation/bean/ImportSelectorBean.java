package com.source.read.annotation.bean;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Arrays;
import java.util.function.Predicate;

/**
 * <p>
 *
 * </p>
 *
 * @author zhāngshìchāng
 * @date 2021/3/30 2:16 下午
 */
public class ImportSelectorBean implements ImportSelector {


	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{};
	}

	@Override
	public Predicate<String> getExclusionFilter() {
		return null;
	}

}
