package com.test.reflect;

import java.awt.List;

public class person {
	String name = "";
	int age;
	Boolean sex = true;

	// 无参函数有什么作用？
	public void person() {
		// TODO Auto-generated method stub

	}

	public void person(String name) {
		this.name = name;
		System.out.println("-----公共的构造函数-----");
		System.out.println("-----" + name + "-----");
	}

	private void person(String name, int age) {
		this.age = age;
		System.out.println("-----私有的构造函数-----");
		System.out.println("-----" + name + age + "岁了-----");
	}

	protected void person(Boolean sex) {
		this.sex = sex;
		System.out.println("-----受保护的构造函数-----");
		System.out.println("-----" + sex + "-----");
	}

	public void run() {
		System.out.println(name + "正在狂跑");
		if (sex == true) {
			System.out.println("他今年" + age + "岁了,是个帅气的男孩");

		} else {
			System.out.println("她今年" + age + "岁了,是个漂亮的姑娘");
		}

	}
}
