package com.source.read.all;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <p>
 *
 * </p>
 *
 * @author zhāngshìchāng
 * @date 2021/3/16 11:29 上午
 */
@Component
public class BeanA {

	@Autowired
	private BeanB b;

}
