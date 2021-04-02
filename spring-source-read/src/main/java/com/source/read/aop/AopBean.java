package com.source.read.aop;

import org.springframework.stereotype.Component;

/**
 * <p>
 *
 * </p>
 *
 * @author zhāngshìchāng
 * @date 2021/4/2 9:23 上午
 */
@Component
public class AopBean {


	public Integer say() {
		System.out.println("我是目标方法 say");
		return 1;
	}


}
