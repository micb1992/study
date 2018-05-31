package com.test.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.omg.CORBA.PUBLIC_MEMBER;

public class test {

	public static void main(String[] args) throws Exception {
		//反射使用步骤：1、加载类到内存当中 2、解析类 3、调用
		//constructorLoadClass();
		constructorAnalysisClass();
	}



	public static void constructorLoadClass() throws Exception {
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
				.forName("com.test.reflect.person");
		
		// 步骤2：解析类的构造函数
		Constructor constructor = classConstructorLoadClass.getConstructor(null);
		// 调返回无参构造函数
		System.out.println("返回无参构造函数" + constructor);
		
		//步骤3： 创建对象--类型需要强制转换
		person p1 = (person) constructor.newInstance(null);
		// 调用构造函数
		p1.person("MI");
		p1.person(true);
		p1.person("micb", 23);
	

	}
	public static void constructorAnalysisClass() throws Exception {
		// TODO Auto-generated method stub
		/*	解析类：
		Class对象提供了如下常用方法
		Pubic Constructor getConstructor(Class<?>...parameterTypes)
		Pubic Method getMethod(String name,Class<?>...parameterTypes)
		public Field getField(String name) public

		Pubic Constructor getDeclareConstructor(Class...parameterTypes)
		Pubic Method getDeclareMethod(String name,Class...parameterTypes)
		public Field getDeclareField(String name) */
		
		Class classconstructorAnalysisClass =Class.forName("com.test.reflect.person");
		
		//批量获取构造方法
		Constructor[] constructor1 = classconstructorAnalysisClass.getConstructors();
		for(Constructor i:constructor1){
			System.out.println("getConstructors批量获取的构造方法："+i);
		}
	
		Constructor[] constructor2 = classconstructorAnalysisClass.getDeclaredConstructors();
		for(Constructor i:constructor2){
			System.out.println("getDeclaredConstructors批量获取的构造方法："+i);
		}
		
	}

}
