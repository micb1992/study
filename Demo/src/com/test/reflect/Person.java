package com.test.reflect;

import java.awt.List;

public class Person {
	String name = "";
	int age;
	Boolean sex = true;

	// �޲κ���
	public Person() {
		// TODO Auto-generated method stub
System.out.println("------�޲κ�����������-----");
	}

	public Person(String name) {
		this.name = name;
		System.out.println("-----�����Ĺ��캯��-----");
		System.out.println("-----" + name + "-----");
		run();
	}

	protected  Person(String name, int age) {
		this.age = age;
		System.out.println("-----�ܱ����Ĺ��캯��-----");
		System.out.println("-----" + name + age + "����-----");
		run();
	}

	private Person(Boolean sex) {
		this.sex = sex;
		System.out.println("-----˽�еĹ��캯��-----");
		run();
	}
	

	private void run() {
		System.out.println(name + "���ڿ���");
		if (sex == true) {
			System.out.println("������" + age + "����,�Ǹ�˧�����к�");

		} else {
			System.out.println("������" + age + "����,�Ǹ�Ư���Ĺ���");
		}

	}

	public void eat() {
		System.out.println(name + "���ڿ��");
		if (sex == true) {
			System.out.println("������" + age + "����,�Ǹ�˧���ĳԻ�");

		} else {
			System.out.println("������" + age + "����,�Ǹ�Ư���ķ�Ͱ");
		}
	}
}