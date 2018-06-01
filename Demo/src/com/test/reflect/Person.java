package com.test.reflect;

import java.awt.List;

public class Person {
	String name = "";
	int age;
	Boolean sex = true;

	// 无参函数
	public Person() {
		// TODO Auto-generated method stub
System.out.println("------无参函数被调用了-----");
	}

	public Person(String name) {
		this.name = name;
		System.out.println("-----公共的构造函数-----");
		System.out.println("-----" + name + "-----");
		run();
	}

	protected  Person(String name, int age) {
		this.age = age;
		System.out.println("-----受保护的构造函数-----");
		System.out.println("-----" + name + age + "岁了-----");
		run();
	}

	private Person(Boolean sex) {
		this.sex = sex;
		System.out.println("-----私有的构造函数-----");
		run();
	}
	

	private void run() {
		System.out.println(name + "正在狂跑");
		if (sex == true) {
			System.out.println("他今年" + age + "岁了,是个帅气的男孩");

		} else {
			System.out.println("她今年" + age + "岁了,是个漂亮的姑娘");
		}

	}

	public void eat() {
		System.out.println(name + "正在狂吃");
		if (sex == true) {
			System.out.println("他今年" + age + "岁了,是个帅气的吃货");

		} else {
			System.out.println("她今年" + age + "岁了,是个漂亮的饭桶");
		}
	}
}