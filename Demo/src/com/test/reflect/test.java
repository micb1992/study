package com.test.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import javax.activation.FileDataSource;

import org.junit.Test;



public class test {
//参考地址：https://blog.csdn.net/sinat_38259539/article/details/71799078
	public static void main(String[] args) throws Exception {
		//反射使用步骤：1、加载类到内存当中 2、解析类 3、调用
		//constructorLoadClass();
		//constructorAnalysisClass();
		//filedAnaysisClass();
	}



	public void constructorLoadClass() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("反射----获取公共、受保护的构造函数");
		/*
		 * 加载类方式1 Class class1 = Class.forName("com.test.reflect.person");
		 * 加载类方法2 Class class2 = new person().getClass();
		 * 加载类方法3 Class class3 =person.class;
		 */
		
		/*
		 * 注意：在运行期间，一个类，只有一个Class对象产生。
		 * 三种方式常用第一种，第二种对象都有了还要反射干什么。第三种需要导入类的包，依赖太强，
		 * 不导包就抛编译错误。一般都第一种，一个字符串可以传入也可写在配置文件中等多种方法
		 */
		// 步骤1：加载类到内存当中
		Class classConstructorLoadClass = Class
				.forName("com.test.reflect.Person");

		// 步骤2：解析类的构造函数
		Constructor constructor = classConstructorLoadClass
				.getConstructor(null);
		// 调返回无参构造函数
		System.out.println("返回无参构造函数" + constructor);

		// 步骤3： 创建对象--类型需要强制转换
		Person p1 = (Person) constructor.newInstance(null);
		// 步骤4:调用方法
		p1.eat();

	}

	
	public void constructorAnalysisClass() throws Exception {
		// TODO Auto-generated method stub
		/*	解析类：
		Class对象提供了如下常用方法
		Pubic Constructor getConstructor(Class<?>...parameterTypes)
		Pubic Method getMethod(String name,Class<?>...parameterTypes)
		public Field getField(String name) public

		Pubic Constructor getDeclareConstructor(Class...parameterTypes)
		Pubic Method getDeclareMethod(String name,Class...parameterTypes)
		public Field getDeclareField(String name) */
		
		Class classconstructorAnalysisClass =Class.forName("com.test.reflect.Person");
		
		//批量获取构造方法
		Constructor[] constructor1 = classconstructorAnalysisClass.getConstructors();
		for(Constructor i:constructor1){
			System.out.println("getConstructors批量获取的构造方法："+i);
		}
		
		Constructor[] constructor2 = classconstructorAnalysisClass.getDeclaredConstructors();
		for(Constructor i:constructor2){
			System.out.println("getDeclaredConstructors批量获取的构造方法："+i);
		}
		//获取单个构造方法--可以获取到所有公有的构造方法--public protected 默认 
		Constructor constructor3 = classconstructorAnalysisClass.getConstructor(String.class);
		Person p =(Person) constructor3.newInstance("呵呵");
		//获取单个构造方法--可以获取到所有的构造方法，包含私有--public protected private 默认
		Constructor constructor4 = classconstructorAnalysisClass.getDeclaredConstructor(Boolean.class);
		//私有方法只能被类中的其他函数调用，但是反射可以暴力访问
		constructor4.setAccessible(true);
		Person p4 =(Person) constructor4.newInstance(false);
	
	}
	@Test
	public void filedAnaysisClass() throws Exception{
		//获取公有成员变量--公有字段
        System.out.println("************获取所有公有的字段********************");  
        Class persponClass1 = Class.forName("com.test.reflect.Person");
		Field[] personfield1 =persponClass1.getFields();
		for(Field field:personfield1){
			System.out.println(field);
		}
		//获取所有字段，包含私有--public protected private 默认
        System.out.println("************获取所有的字段***********************");  
		Class persponClass2 = Class.forName("com.test.reflect.Person");
		Field[] personfield2 =persponClass2.getDeclaredFields();
		for(Field field:personfield2){
			System.out.println(field);
		}
		//获取公有成员变量并进行初始化
		   System.out.println("************获取公有字段并调用***********************");  
			Class persponClass3 = Class.forName("com.test.reflect.Person");
			Field personfield3 =persponClass3.getField("name");
			Person person5 = (Person) persponClass3.getConstructor().newInstance();
			personfield3.set(person5, "lala");
			System.out.println("验证获取成员变量值："+person5.name);
			
			//获取私有成员变量并进行初始化
			   System.out.println("************获取私有字段并调用***********************");  
				Class persponClass4 = Class.forName("com.test.reflect.Person");
				Field personfield4 =persponClass4.getField("name");
				Person person6 = (Person) persponClass4.getConstructor().newInstance();
				personfield4.setAccessible(true);
				personfield4.set(person6, "呵呵哒");
				System.out.println("验证获取成员变量值："+person6.name);
				
	}

}
