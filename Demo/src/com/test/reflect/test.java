package com.test.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import javax.activation.FileDataSource;

import org.junit.Test;



public class test {
//�ο���ַ��https://blog.csdn.net/sinat_38259539/article/details/71799078
	public static void main(String[] args) throws Exception {
		//����ʹ�ò��裺1�������ൽ�ڴ浱�� 2�������� 3������
		//constructorLoadClass();
		//constructorAnalysisClass();
		//filedAnaysisClass();
	}



	public void constructorLoadClass() throws Exception {
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
				.forName("com.test.reflect.Person");

		// ����2��������Ĺ��캯��
		Constructor constructor = classConstructorLoadClass
				.getConstructor(null);
		// �������޲ι��캯��
		System.out.println("�����޲ι��캯��" + constructor);

		// ����3�� ��������--������Ҫǿ��ת��
		Person p1 = (Person) constructor.newInstance(null);
		// ����4:���÷���
		p1.eat();

	}

	
	public void constructorAnalysisClass() throws Exception {
		// TODO Auto-generated method stub
		/*	�����ࣺ
		Class�����ṩ�����³��÷���
		Pubic Constructor getConstructor(Class<?>...parameterTypes)
		Pubic Method getMethod(String name,Class<?>...parameterTypes)
		public Field getField(String name) public

		Pubic Constructor getDeclareConstructor(Class...parameterTypes)
		Pubic Method getDeclareMethod(String name,Class...parameterTypes)
		public Field getDeclareField(String name) */
		
		Class classconstructorAnalysisClass =Class.forName("com.test.reflect.Person");
		
		//������ȡ���췽��
		Constructor[] constructor1 = classconstructorAnalysisClass.getConstructors();
		for(Constructor i:constructor1){
			System.out.println("getConstructors������ȡ�Ĺ��췽����"+i);
		}
		
		Constructor[] constructor2 = classconstructorAnalysisClass.getDeclaredConstructors();
		for(Constructor i:constructor2){
			System.out.println("getDeclaredConstructors������ȡ�Ĺ��췽����"+i);
		}
		//��ȡ�������췽��--���Ի�ȡ�����й��еĹ��췽��--public protected Ĭ�� 
		Constructor constructor3 = classconstructorAnalysisClass.getConstructor(String.class);
		Person p =(Person) constructor3.newInstance("�Ǻ�");
		//��ȡ�������췽��--���Ի�ȡ�����еĹ��췽��������˽��--public protected private Ĭ��
		Constructor constructor4 = classconstructorAnalysisClass.getDeclaredConstructor(Boolean.class);
		//˽�з���ֻ�ܱ����е������������ã����Ƿ�����Ա�������
		constructor4.setAccessible(true);
		Person p4 =(Person) constructor4.newInstance(false);
	
	}
	@Test
	public void filedAnaysisClass() throws Exception{
		//��ȡ���г�Ա����--�����ֶ�
        System.out.println("************��ȡ���й��е��ֶ�********************");  
        Class persponClass1 = Class.forName("com.test.reflect.Person");
		Field[] personfield1 =persponClass1.getFields();
		for(Field field:personfield1){
			System.out.println(field);
		}
		//��ȡ�����ֶΣ�����˽��--public protected private Ĭ��
        System.out.println("************��ȡ���е��ֶ�***********************");  
		Class persponClass2 = Class.forName("com.test.reflect.Person");
		Field[] personfield2 =persponClass2.getDeclaredFields();
		for(Field field:personfield2){
			System.out.println(field);
		}
		//��ȡ���г�Ա���������г�ʼ��
		   System.out.println("************��ȡ�����ֶβ�����***********************");  
			Class persponClass3 = Class.forName("com.test.reflect.Person");
			Field personfield3 =persponClass3.getField("name");
			Person person5 = (Person) persponClass3.getConstructor().newInstance();
			personfield3.set(person5, "lala");
			System.out.println("��֤��ȡ��Ա����ֵ��"+person5.name);
			
			//��ȡ˽�г�Ա���������г�ʼ��
			   System.out.println("************��ȡ˽���ֶβ�����***********************");  
				Class persponClass4 = Class.forName("com.test.reflect.Person");
				Field personfield4 =persponClass4.getField("name");
				Person person6 = (Person) persponClass4.getConstructor().newInstance();
				personfield4.setAccessible(true);
				personfield4.set(person6, "�Ǻ���");
				System.out.println("��֤��ȡ��Ա����ֵ��"+person6.name);
				
	}

}
