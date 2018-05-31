package com.test.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.omg.CORBA.PUBLIC_MEMBER;

public class test {

	public static void main(String[] args) throws Exception {
		//����ʹ�ò��裺1�������ൽ�ڴ浱�� 2�������� 3������
		//constructorLoadClass();
		constructorAnalysisClass();
	}



	public static void constructorLoadClass() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("����----��ȡ�������ܱ����Ĺ��캯��");
		/*
		 * �����෽ʽ1 Class class1 = Class.forName("com.test.reflect.person");
		 * �����෽��2 Class class2 = new person().getClass();
		 * �����෽��3 Class class3 =person.class;
		 */
		
		/*
		 * ע�⣺�������ڼ䣬һ���ֻ࣬��һ��Class���������
		 * ���ַ�ʽ���õ�һ�֣��ڶ��ֶ������˻�Ҫ�����ʲô����������Ҫ������İ�������̫ǿ��
		 * ���������ױ������һ�㶼��һ�֣�һ���ַ������Դ���Ҳ��д�������ļ��еȶ��ַ���
		 */
		// ����1�������ൽ�ڴ浱��
		Class classConstructorLoadClass = Class
				.forName("com.test.reflect.person");
		
		// ����2��������Ĺ��캯��
		Constructor constructor = classConstructorLoadClass.getConstructor(null);
		// �������޲ι��캯��
		System.out.println("�����޲ι��캯��" + constructor);
		
		//����3�� ��������--������Ҫǿ��ת��
		person p1 = (person) constructor.newInstance(null);
		// ���ù��캯��
		p1.person("MI");
		p1.person(true);
		p1.person("micb", 23);
	

	}
	public static void constructorAnalysisClass() throws Exception {
		// TODO Auto-generated method stub
		/*	�����ࣺ
		Class�����ṩ�����³��÷���
		Pubic Constructor getConstructor(Class<?>...parameterTypes)
		Pubic Method getMethod(String name,Class<?>...parameterTypes)
		public Field getField(String name) public

		Pubic Constructor getDeclareConstructor(Class...parameterTypes)
		Pubic Method getDeclareMethod(String name,Class...parameterTypes)
		public Field getDeclareField(String name) */
		
		Class classconstructorAnalysisClass =Class.forName("com.test.reflect.person");
		
		//������ȡ���췽��
		Constructor[] constructor1 = classconstructorAnalysisClass.getConstructors();
		for(Constructor i:constructor1){
			System.out.println("getConstructors������ȡ�Ĺ��췽����"+i);
		}
	
		Constructor[] constructor2 = classconstructorAnalysisClass.getDeclaredConstructors();
		for(Constructor i:constructor2){
			System.out.println("getDeclaredConstructors������ȡ�Ĺ��췽����"+i);
		}
		
	}

}
