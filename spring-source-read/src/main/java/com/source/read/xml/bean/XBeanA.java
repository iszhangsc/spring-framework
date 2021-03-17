package com.source.read.xml.bean;

/**
 * <p>
 *
 * </p>
 *
 * @author zhāngshìchāng
 * @date 2021/3/16 11:45 上午
 */
public class XBeanA {

	private String name;
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "XBeanA{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

}
