package com.source.read.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <p>
 *
 * </p>
 *
 * @author zhangshichang
 * @date 2021-03-31 23:04
 */
@Component
public class CircularA {

	@Autowired
	private CircularB circularB;

}
