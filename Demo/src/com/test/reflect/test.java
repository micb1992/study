package com.test.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.omg.CORBA.PUBLIC_MEMBER;

public class test {


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//�����෽ʽ1
		//Class class1 = Class.forName("com.test.reflect.person");
		//�����෽��2
		//Class class2 = new person().getClass();
		//�����෽��3
		//Class class3 = person.class;
		constructorPublicParameter();
	}
	private static void constructorNoParameter() {
		// TODO Auto-generated method stub
		System.out.println("�����޲ι��췽��");
		

	}
	private static void constructorPublicParameter() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("����----��ȡ�������ܱ����Ĺ��캯��");
		//�����ൽ�ڴ浱��
		Class classConstructorOneParameter = Class.forName("com.test.reflect.person");
		//������Ĺ��캯��
		Constructor constructor = classConstructorOneParameter.getConstructor(null);
		//�����޲ι��캯��
		System.out.println("�����޲ι��캯��"+constructor);
		//��������--������Ҫǿ��ת��
		person person1 =(person)constructor.newInstance(null);
		//���ù��캯��
		person1.person("MI");
		//person1.person(true);
		person1.run();
	
	}

}
