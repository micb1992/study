package com.test.reflect;

import java.awt.List;

public class person {

	public void person() {
		// TODO Auto-generated method stub
		String name = "˧��";

	}

	public void person(String name) {
		System.out.println("-----�����Ĺ��캯��-----");
		System.out.println("-----" + name + "-----");
	}

	private void person(String name, int age) {
		System.out.println("-----˽�еĹ��캯��-----");
		System.out.println("-----" + name + age + "����-----");
	}

	protected void person(Boolean sex) {
		System.out.println("-----�ܱ����Ĺ��캯��-----");
		System.out.println("-----" + sex + "-----");
	}
}
