package com.test.reflect;

import java.awt.List;

public class person {
	String name = "";
	int age;
	Boolean sex = true;

	// �޲κ�����ʲô���ã�
	public void person() {
		// TODO Auto-generated method stub

	}

	public void person(String name) {
		this.name = name;
		System.out.println("-----�����Ĺ��캯��-----");
		System.out.println("-----" + name + "-----");
		run();
	}

	protected void person(String name, int age) {
		this.age = age;
		System.out.println("-----�ܱ����Ĺ��캯��-----");
		System.out.println("-----" + name + age + "����-----");
		run();
	}

	protected void person(Boolean sex) {
		this.sex = sex;
		System.out.println("-----�ܱ����Ĺ��캯��-----");
		System.out.println("-----" + sex + "-----");
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