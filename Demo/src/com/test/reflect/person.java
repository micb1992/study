package com.test.reflect;

import java.awt.List;

public class person {

	public void person() {
		// TODO Auto-generated method stub
		String name = "帅哥";

	}

	public void person(String name) {
		System.out.println("-----公共的构造函数-----");
		System.out.println("-----" + name + "-----");
	}

	private void person(String name, int age) {
		System.out.println("-----私有的构造函数-----");
		System.out.println("-----" + name + age + "岁了-----");
	}

	protected void person(Boolean sex) {
		System.out.println("-----受保护的构造函数-----");
		System.out.println("-----" + sex + "-----");
	}
}
